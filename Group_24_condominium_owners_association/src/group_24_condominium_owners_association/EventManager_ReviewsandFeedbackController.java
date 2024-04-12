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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class EventManager_ReviewsandFeedbackController implements Initializable {

    @FXML
    private TextField NameTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private ComboBox<?> EventsComboBox;
    @FXML
    private TextArea CommentTextArea;
    @FXML
    private CheckBox RatingOneCB;
    @FXML
    private CheckBox RatingTwoCB;
    @FXML
    private CheckBox RatingThreeCB;
    @FXML
    private CheckBox RatingFourCB;
    @FXML
    private CheckBox RatingFiveCB;
    @FXML
    private TextArea EventManager_ReviewsandFeedbackTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SubmitButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
    }
    
}
