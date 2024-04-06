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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    }

    @FXML
    private void LogoutOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void ViewButtonOnAction(ActionEvent event) {
    }
    
}
