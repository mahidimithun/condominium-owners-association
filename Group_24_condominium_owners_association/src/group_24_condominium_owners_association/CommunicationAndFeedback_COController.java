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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class CommunicationAndFeedback_COController implements Initializable {

    @FXML
    private TextField NameTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField UnitnumberTextField;
    @FXML
    private TextField PhoneNumberTextField;
    @FXML
    private TextArea FeedbackmessageTextArea;
    @FXML
    private TextArea SuggestionsTextArea;
    @FXML
    private TextArea CommunicationFeedbackUpdatesTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClickOnAction(ActionEvent event) {
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
    private void LogoutOnClickOnAction(ActionEvent event) {
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
    private void ViewButtonOnAction(ActionEvent event) {
         String name = NameTextField.getText();
        String email = EmailTextField.getText();
        String unitNumber = UnitnumberTextField.getText();
        String phoneNumber = PhoneNumberTextField.getText();
        String feedbackMessage = FeedbackmessageTextArea.getText();
        String suggestions = SuggestionsTextArea.getText();
        
        // Construct the updates message using the inputs
        String updates = "Name: " + name + "\n"
                        + "Email: " + email + "\n"
                        + "Unit Number: " + unitNumber + "\n"
                        + "Phone Number: " + phoneNumber + "\n"
                        + "Feedback Message: " + feedbackMessage + "\n"
                        + "Suggestions: " + suggestions;
        
        CommunicationFeedbackUpdatesTextArea.setText(updates);
    }
    
}
