/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

        EventNameComboBox.getItems().addAll("Event 1", "Event 2", "Event 3");
        
       
        EventNameTableColumn.setCellValueFactory(cellData -> cellData.getValue().eventNameProperty());
        TimeTableColumn.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        DateTableColumn.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
    }    

    @FXML
    private void BackButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EventManagerDashboard.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setTitle("back");
            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
       
    }

    @FXML
    private void ViewButtonOnAction(ActionEvent event) {
        String eventName = EventNameComboBox.getValue();
        String time = TimeTextField.getText();
        String date = Date_DP.getValue().toString();

      
        EventDetails eventDetails = new EventDetails(eventName, time, date);

      
        Event_Details_Updates_TableView.getItems().add(eventDetails);
    }

    @FXML
    private void LogoutButtonOnAction(ActionEvent event) {
        try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUI.fxml"));
        Parent root = loader.load();

        
        Stage newStage = new Stage();
        newStage.setTitle("logout");

      
        Scene scene = new Scene(root);
        newStage.setScene(scene);

        
        newStage.show();
    } catch (IOException e) {
        e.printStackTrace();
    }
   
    }
}
    

