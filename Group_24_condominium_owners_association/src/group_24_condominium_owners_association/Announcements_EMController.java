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
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class Announcements_EMController implements Initializable {

    @FXML
    private ComboBox<String> UpcomingCommunityEventsComboBox;
    @FXML
    private DatePicker Date_DatePicker;
    @FXML
    private TextField TimeTextField;
    @FXML
    private TextField LocationTextField;
    @FXML
    private TableView<Announcements_Updates> AnnouncementsDetailsTV;
    @FXML
    private TableColumn<Announcements_Updates, String> UpcomingEventsTC;
    @FXML
    private TableColumn<Announcements_Updates, String> DateTC;
    @FXML
    private TableColumn<Announcements_Updates, String> TimeTC;
    @FXML
    private TableColumn<Announcements_Updates, String> LocationTC;

    private ObservableList<Announcements_Updates> announcementsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        announcementsList = FXCollections.observableArrayList();
        
      
        UpcomingEventsTC.setCellValueFactory(new PropertyValueFactory<>("upcomingEvents"));
        DateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        TimeTC.setCellValueFactory(new PropertyValueFactory<>("time"));
        LocationTC.setCellValueFactory(new PropertyValueFactory<>("location"));
        
      
        UpcomingCommunityEventsComboBox.getItems().addAll("BBQ", "Fitness and wellness activities", "Community meetings", "Holiday celebrations", "Game nights", "Educational workshops/seminars");
    }    

    @FXML
    private void DoneButtonOnClick(ActionEvent event) {
       
        String upcomingEvent = UpcomingCommunityEventsComboBox.getValue();
        String date = Date_DatePicker.getValue().toString();
        String time = TimeTextField.getText();
        String location = LocationTextField.getText();
        

        Announcements_Updates announcement = new Announcements_Updates(upcomingEvent, date, time, location);
        announcementsList.add(announcement);
        
       
        AnnouncementsDetailsTV.setItems(announcementsList);
    }

    @FXML
    private void BackButtonOnClickOnAction(ActionEvent event) {
       
    }
    
}