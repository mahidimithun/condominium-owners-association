/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modelPack.MRmaintenanceOrder;

import modelPack.MrTechnician;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MrTechinicianListController implements Initializable {

    @FXML
    private TextField tf_inputTechName;
    @FXML
    private TextField tf_inputTechPhoneNo;
    @FXML
    private ComboBox<String> cb_inputTechType;
    @FXML
    private TableView<MrTechnician> techTable;
    @FXML
    private TableColumn<MrTechnician, String> tc_techPhone;
    @FXML
    private TableColumn<MrTechnician, String> tc_TechType;
    @FXML
    private TableColumn<MrTechnician, String> tc_TechName;
    @FXML
    private DatePicker techHireDate;
    @FXML
    private TableColumn<MrTechnician, LocalDate> tc_hireDate;
    @FXML
    private Label lbl_error;

    ObservableList<MrTechnician> techList;

    private String filename = "mrTechnician.txt";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_inputTechType.getItems().addAll("Electrician", "Water", "Gas", "Internet", "Mechanic");

        tc_techPhone.setCellValueFactory(new PropertyValueFactory("techPhoneNo"));
        tc_TechType.setCellValueFactory(new PropertyValueFactory("techType"));
        tc_TechName.setCellValueFactory(new PropertyValueFactory("techName"));
        tc_hireDate.setCellValueFactory(new PropertyValueFactory("date"));

        techList = techTable.getItems();

    }

    @FXML
    private void addNewTechOnClick(ActionEvent event) {
        String techName = tf_inputTechName.getText();
        String techPhonNo = tf_inputTechPhoneNo.getText();
        LocalDate hireDate = techHireDate.getValue();
        String techType = cb_inputTechType.getValue();

        if (techName == null || techName.isEmpty()) {
            lbl_error.setText("You must enter name");
            return;
        }

        if (techPhonNo == null || techPhonNo.isEmpty()) {
            lbl_error.setText("You must enter Phone No");
            return;
        }

        if (hireDate == null) {
            lbl_error.setText("Date can not be empty");
            return;
        }

        //past date check
        if (hireDate.isBefore(LocalDate.now())) {

            lbl_error.setText(" Date Can not be past");
            return;
        }

        if (techType == null || techType.isEmpty()) {
            lbl_error.setText("You must select Type");
            return;
        }

        MrTechnician tech = new MrTechnician(techName, techPhonNo, techType,hireDate);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mrTechnician.txt", true))) {
            writer.write(tech.getTechPhoneNo() + "," + tech.getTechType() + "," + tech.getTechName() + "," + tech.getDate());
            writer.newLine();
            lbl_error.setText(" Add succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        cb_inputTechType.setValue(null);
        tf_inputTechName.clear();
        techHireDate.setValue(null);
        tf_inputTechPhoneNo.clear();
    }

    @FXML
    private void backOnClick(ActionEvent event) {
    }

    @FXML
    private void viewOnClick(ActionEvent event) {

        StringBuilder data = new StringBuilder();
        Scanner s = null;

        try {

            s = new Scanner(new BufferedReader(new FileReader(filename)));
            techList.clear();

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String techPhone = parts[0];
                    String techType = parts[1];
                    String techName = parts[2];
                    String dateString = parts[3];
                    LocalDate date = LocalDate.parse(dateString);

                    techList.add(new MrTechnician(techName, techPhone, techType, date));
                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (s != null) {
                s.close();
            }

        }

    }

}
