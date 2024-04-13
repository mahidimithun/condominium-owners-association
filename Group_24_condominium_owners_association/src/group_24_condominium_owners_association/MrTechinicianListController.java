/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
          cb_inputTechType.getItems().addAll("Electrician", "Water", "Gas", "Internet","Mechanic");
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
        
        

        MrTechnician tech = new MrTechnician(techName, techPhonNo, hireDate,techType);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mrTechnician.txt", true))) {
            writer.write(tech.getTechPhoneNo() + "," + tech.getTechType() + ","+ tech.getTechName()+","+tech.getDate());
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
    
}
