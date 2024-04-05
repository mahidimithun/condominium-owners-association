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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class CommunityInvestmentOpportunities_COController implements Initializable {

    @FXML
    private Label CommunityUpdatesRadioButton;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField InvestedAmountTextField;
    @FXML
    private TextField ExpectedAreaTextField;
    @FXML
    private ComboBox<?> DurationComboBox;
    @FXML
    private TextArea CommunityInvestmentOpportunitiesOutputTextArea;

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
    private void CommunitymeetingsRadioButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void RegularchangesRadioButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void SaveButtonOnClickOnAction(ActionEvent event) {
    }
    
}
