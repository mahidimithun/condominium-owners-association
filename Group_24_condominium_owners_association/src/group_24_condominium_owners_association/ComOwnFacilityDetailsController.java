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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class ComOwnFacilityDetailsController implements Initializable {

    @FXML
    private Label OpenHoursRadioButton;
    @FXML
    private TextField LocationTextField;
    @FXML
    private TextField MedicalPharmacyTextField;
    @FXML
    private TextField BeautySalonTextField;
    @FXML
    private TextField RetailSpaceTextField;
    @FXML
    private TextField GymnasiumCenterTextField;

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
    private void DoneButtonOnClick(ActionEvent event) {
    }
    
}
