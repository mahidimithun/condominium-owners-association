/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class CommonAreaBooking_COController implements Initializable {

    @FXML
    private RadioButton AvailabilityYesRadioButton;
    @FXML
    private RadioButton AvailabilityNoRadioButton;
    @FXML
    private DatePicker BookingstatusDatePicker;
    @FXML
    private TextField TimeTextField;
    @FXML
    private TextArea CommomAreaBookingUpdatesTextArea;
    @FXML
    private ComboBox<String> UpcomingEventsCB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       UpcomingEventsCB.getItems().addAll("BBQparty", "Fitness and Wellness Activities", "Welcome Parties",
                "Community Meetings", "Educational Workshops/Seminars");
    }
  
    @FXML
    private void BackButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CommercialOwnerDashboard.fxml"));
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
    private void SubmitButtonOnAction(ActionEvent event) {
       
          boolean isAvailable = AvailabilityYesRadioButton.isSelected();

    
    LocalDate bookingDate = BookingstatusDatePicker.getValue();

    
    String bookingTime = TimeTextField.getText();


    String bookingUpdates = CommomAreaBookingUpdatesTextArea.getText();

    String selectedEvent = UpcomingEventsCB.getValue();


    StringBuilder output = new StringBuilder();
    output.append("Availability: ").append(isAvailable ? "Yes" : "No").append("\n");
    output.append("Booking Date: ").append(bookingDate).append("\n");
    output.append("Booking Time: ").append(bookingTime).append("\n");
    output.append("Selected Event: ").append(selectedEvent);

    
    CommomAreaBookingUpdatesTextArea.setText(output.toString());
    }
    @FXML
    private void CancelBookingButtonOnAction(ActionEvent event) {
         BookingstatusDatePicker.setValue(null); 
         TimeTextField.clear(); 
         CommomAreaBookingUpdatesTextArea.clear();
    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
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
