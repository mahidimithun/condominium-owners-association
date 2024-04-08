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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class MedicalPharmacyController implements Initializable {

    @FXML
    private RadioButton MedicineAvailableRadioButton;
    @FXML
    private TextField OpenAndCloseTextField;
    @FXML
    private TextArea MedicineAvailabilityOutputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MedicineAvailableButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void MedicineUnavailableButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void SaveButtonOnClickOnAction(ActionEvent event) {
    }
    
}
