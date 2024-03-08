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

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class GymnasiumCenterController implements Initializable {

    @FXML
    private RadioButton ServiceOfferRadioButton;
    @FXML
    private ComboBox<?> OpenHoursComboBox;
    @FXML
    private ComboBox<?> NecessaryEqComboBox;

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
    private void OpenHoursButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void NecessaryEqButtonOnClick(ActionEvent event) {
    }
    
}
