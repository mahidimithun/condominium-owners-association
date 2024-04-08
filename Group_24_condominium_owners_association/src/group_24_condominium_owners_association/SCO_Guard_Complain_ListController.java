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
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
     private ObservableList<GuardComplain> guardComplainList = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        complainType_Combobox.getItems().addAll("Type A", "Type B", "Type C");
        
        complainBy_TableColumn.setCellValueFactory(cellData -> cellData.getValue().complainByProperty());
        complainType_TableColumn.setCellValueFactory(cellData -> cellData.getValue().complainTypeProperty());
        complainDate_TableColumn.setCellValueFactory(cellData -> cellData.getValue().complainDateProperty());
        complainStatus_TableColumn.setCellValueFactory(cellData -> cellData.getValue().complainStatusProperty());
    }    

    @FXML
    private void LogOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addGuardComplainButtonOnClick(ActionEvent event) {
        String complainBy = complainBy_TextField.getText();
        String complainType = complainType_Combobox.getValue();
        String complainDate = complainDate_DatePicker.getValue().toString();
        String complainStatus = addressedRadioButton.isSelected() ? "Addressed" : "Not Addressed";

        // Create a new GuardComplain object
        GuardComplain newComplain = new GuardComplain(complainBy, complainType, complainDate, complainStatus);
        
        // Add the new complain to the list and update TableView
        guardComplainList.add(newComplain);
        guardComplain_TableView.setItems(guardComplainList);

        // Save the updated list to the file
        saveComplainsToFile();
    }

    @FXML
    private void viewGuardComplainButtonOnClick(ActionEvent event) {
        loadComplainsFromFile();
    }

    @FXML
    private void cancelGuardComplainButtonOnClick(ActionEvent event) {
        complainBy_TextField.clear();
        complainDate_DatePicker.getEditor().clear();
        complainType_Combobox.getEditor().clear();
        addressedRadioButton.setSelected(false);
        notAddressedRadioButton.setSelected(false);
    }
    
    private void saveComplainsToFile() {
        // Write the data from guardComplainList to the file
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

    private void loadComplainsFromFile() {
        // Read data from the file and populate guardComplainList
        guardComplainList.clear(); // Clear existing data
        
        try (BufferedReader reader = new BufferedReader(new FileReader("GuardComplain.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    guardComplainList.add(new GuardComplain(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Update TableView
        guardComplain_TableView.setItems(guardComplainList);
    }
}
