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

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class EventRegistrationandTicketing_EMController implements Initializable {

    @FXML
    private ComboBox<?> RegistrationFormComboBox;
    @FXML
    private ComboBox<?> UpcomingEventsComboBox;
    @FXML
    private ComboBox<?> TicketSelectionComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GetTicketButtonOnClick(ActionEvent event) {
    }
    
}
