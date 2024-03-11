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

/**
 * FXML Controller class
 *
 * @author User
 */
public class MRCDashboardController implements Initializable {

    @FXML
    private Label lbl_MRC_UnitOwnerId;
    @FXML
    private Label lbl_MRC_ServiceType;
    @FXML
    private Label lbl_MRC_Phone;
    @FXML
    private Label lbl_MRC_Location;
    @FXML
    private ComboBox<?> cb_MRC_ConfirmationType;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MRC_Send(ActionEvent event) {
    }

    @FXML
    private void MRC_ContactMedicalOfficer(ActionEvent event) {
    }

    @FXML
    private void MRC_MedicalFees(ActionEvent event) {
    }

    @FXML
    private void MRC_HospitalSeatBooking(ActionEvent event) {
    }

    @FXML
    private void MRC_MedicalService(ActionEvent event) {
    }

    @FXML
    private void MRC_EmergencyTreatmentRequest(ActionEvent event) {
    }
    
}
