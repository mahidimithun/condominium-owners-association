/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

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
    @FXML
    private TextArea Save_Payment_MethodTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void SavePaymentMethodOnClick(ActionEvent event) {
        String cardNumber = CardNumberPassTextField.getText();
    String expirationDate = ExpirationDateTextField.getText();
    

    Save_Payment_MethodTextArea.setText("Card Number: " + cardNumber + "\nExpiration Date: " + expirationDate);
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

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
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
    
}
