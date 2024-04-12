/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class BeautySalonController implements Initializable {

    @FXML
    private ComboBox<String> OpenandclosehoursComboBox; 
    @FXML
    private TextField ServiceOfferTextField;
    @FXML
    private TextArea BeautySalonBookingUpdatesTextArea;
    @FXML
    private DatePicker date_DP;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize ComboBox options
        OpenandclosehoursComboBox.getItems().addAll(
            "9:00 AM - 6:00 PM",
            "10:00 AM - 7:00 PM",
            "11:00 AM - 8:00 PM"
        );
    }    

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
       
    }

    @FXML
    private void BookedButtonOnClick(ActionEvent event) {
       
    String selectedHour = OpenandclosehoursComboBox.getValue();
    String serviceOffer = ServiceOfferTextField.getText();
    String bookingDate = date_DP.getValue().toString();
    String bookingUpdate = "Booking details:\n" +
                            "Selected hour: " + selectedHour + "\n" +
                            "Service offer: " + serviceOffer + "\n" +
                            "Booking date: " + bookingDate + "\n";

   
    BeautySalonBookingUpdatesTextArea.appendText(bookingUpdate);
      
        
    }   
    
}
