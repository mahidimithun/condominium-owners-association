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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class GymnasiumCenterController implements Initializable {

    @FXML
    private RadioButton ServiceOfferRadioButton;
    @FXML
    private ComboBox<?> OpenhoursComboBox;
    @FXML
    private TextField NecessaryEqTextField;
    @FXML
    private TextArea GymnasiumUpdatesTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AvailableButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void UnavailableButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void SaveButtonOnClickOnAction(ActionEvent event) {
    }
    
}
