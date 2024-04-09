/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Feedback_SuggestionController implements Initializable {

    @FXML
    private TableView<?> Feedback_TableView;
    @FXML
    private TableColumn<?, ?> Feedbacker_TableColumn;
    @FXML
    private TableColumn<?, ?> ResidentName_TableColumn;
    @FXML
    private TableColumn<?, ?> ResindentNumberTable_Column;
    @FXML
    private TableColumn<?, ?> ContactInfo_TableColumn;
    @FXML
    private TableColumn<?, ?> FeedbacksandSuggestions_TableColumn;
    @FXML
    private TableColumn<?, ?> SuggestedActions_TableColumn;
    @FXML
    private RadioButton Taken_RadioButton;
    @FXML
    private RadioButton notTaken_RadioButton;
    @FXML
    private TextField FeedbackerName_TextField;
    @FXML
    private ComboBox<?> ResidentNumber_Combobox;
    @FXML
    private TextField ResidentName_TextField;
    @FXML
    private TextField ContactInfo_TextField;
    @FXML
    private TextArea FeedbackandSuggestions_TextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("RuelsAndPolicyManagerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }

    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LogInUI.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }

    }


    @FXML
    private void AddSuggestionsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewSuggestionsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void CancelButtonOnClick(ActionEvent event) {
    }
    
}
