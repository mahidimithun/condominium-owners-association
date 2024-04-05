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
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class PaymentController implements Initializable {

    @FXML
    private PasswordField CardNumberPassTextField;
    @FXML
    private PasswordField ExpirationDateTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BkashButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SavePaymentMethodOnClick(ActionEvent event) {
    }
    
}
