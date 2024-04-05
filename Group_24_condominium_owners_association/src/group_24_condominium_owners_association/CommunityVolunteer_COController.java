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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class CommunityVolunteer_COController implements Initializable {

    @FXML
    private TextField NameTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField PhonenumberTextField;
    @FXML
    private DatePicker JoiningdateDatePicker;
    @FXML
    private TextArea VolunteerOpportunityDetailsViewTextArea;

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
    private void LogoutButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void ViewButtonOnClickOnAction(ActionEvent event) {
    }
    
}
