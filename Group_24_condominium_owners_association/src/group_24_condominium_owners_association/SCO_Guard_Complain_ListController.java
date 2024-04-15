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
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_Guard_Complain_ListController implements Initializable {

    @FXML
    private RadioButton addressedRadioButton;
    @FXML
    private RadioButton notAddressedRadioButton;
    @FXML
    private ComboBox<String> complainType_Combobox;
    @FXML
    private TextField complainBy_TextField;
    @FXML
    private DatePicker complainDate_DatePicker;
    @FXML
    private TableView<GuardComplain> guardComplain_TableView;
    @FXML
    private TableColumn<GuardComplain, String> complainBy_TableColumn;
    @FXML
    private TableColumn<GuardComplain, String> complainType_TableColumn;
    @FXML
    private TableColumn<GuardComplain, String> complainDate_TableColumn;
    @FXML
    private TableColumn<GuardComplain, String> complainStatus_TableColumn;

    /**
     * Initializes the controller class.
     */
     private ObservableList<GuardComplain> guardComplainList ;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        guardComplainList = FXCollections.observableArrayList();
        complainType_Combobox.getItems().addAll("Complaints about Visitors:", "Complaints about Employees:", "Safety Concerns","Incident Reports");
        
       complainBy_TableColumn.setCellValueFactory(new PropertyValueFactory<>("complainBy"));
       complainType_TableColumn.setCellValueFactory(new PropertyValueFactory<>("complainType"));
       complainDate_TableColumn.setCellValueFactory(new PropertyValueFactory<>("complainDate"));
       complainStatus_TableColumn.setCellValueFactory(new PropertyValueFactory<>("complainStatus"));
    }    

    @FXML
    private void LogOutButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SecurityControlOfficerDashboard"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

     @FXML
    private void addGuardComplainButtonOnClick(ActionEvent event) {
        String complainBy = complainBy_TextField.getText();
        String complainType = complainType_Combobox.getValue();
        String complainDate = complainDate_DatePicker.getValue().toString();
        String complainStatus = addressedRadioButton.isSelected() ? "Addressed" : "Not Addressed";

        GuardComplain newComplain = new GuardComplain(complainBy, complainType, complainDate, complainStatus);
        guardComplainList.add(newComplain);

        writeComplainsToFile();
    }

    @FXML
    private void viewGuardComplainButtonOnClick(ActionEvent event) {
        readComplainsFromFile();
    }

    @FXML
    private void cancelGuardComplainButtonOnClick(ActionEvent event) {
        complainBy_TextField.clear();
        complainDate_DatePicker.getEditor().clear();
        complainType_Combobox.getEditor().clear();
        addressedRadioButton.setSelected(false);
        notAddressedRadioButton.setSelected(false);
    }

    private void writeComplainsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("GuardComplain.txt"))) {
            for (GuardComplain complain : guardComplainList) {
                writer.write(complain.getComplainBy() + "," +
                        complain.getComplainType() + "," +
                        complain.getComplainDate() + "," +
                        complain.getComplainStatus() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readComplainsFromFile() {
        guardComplainList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("GuardComplain.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    guardComplainList.add(new GuardComplain(parts[0], parts[1], parts[2], parts[3]));
                }
            }
            guardComplain_TableView.setItems(guardComplainList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SecurityControlOfficerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

