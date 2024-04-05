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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    private ChoiceBox<?> UpcomingEventsChoiceBox;
    @FXML
    private TextArea CommomAreaBookingUpdatesTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void BackButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void SubmitButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void CancelBookingButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void AddbookingButtonOnClickOnAction(ActionEvent event) {
    }
    
}
