/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class EventDetailsController implements Initializable {

    @FXML
    private TextField TimeTextField;
    @FXML
    private ComboBox<String> EventNameComboBox;
    @FXML
    private DatePicker Date_DP;
    @FXML
    private TableView<EventDetails> Event_Details_Updates_TableView;
    @FXML
    private TableColumn<EventDetails, String> EventNameTableColumn;
    @FXML
    private TableColumn<EventDetails, String> TimeTableColumn;
    @FXML
    private TableColumn<EventDetails, String> DateTableColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize your ComboBox with some event names
        EventNameComboBox.getItems().addAll("Event 1", "Event 2", "Event 3");
        
        // Initialize TableView columns
        EventNameTableColumn.setCellValueFactory(cellData -> cellData.getValue().eventNameProperty());
        TimeTableColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        DateTableColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
    }    

    @FXML
    private void BackButtonOnAction(ActionEvent event) {
        // Implement back button functionality here if needed
    }

    @FXML
    private void ViewButtonOnAction(ActionEvent event) {
        String eventName = EventNameComboBox.getValue();
        String time = TimeTextField.getText();
        String date = Date_DP.getValue().toString();

        // Create a new EventDetails object with the retrieved data
        EventDetails eventDetails = new EventDetails(eventName, time, date);

        // Add the EventDetails object to the TableView
        Event_Details_Updates_TableView.getItems().add(eventDetails);
    }

    @FXML
    private void LogoutButtonOnAction(ActionEvent event) {
        // Implement logout button functionality here if needed
    }
}
    

