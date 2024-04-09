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
    private RadioButton MedicineUnavailableRadioButton;
    @FXML
    private TextField OpenAndCloseTextField;
    @FXML
    private TextArea MedicineAvailabilityOutputTextArea;

    
    private boolean isMedicineAvailable = false;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MedicineAvailableButtonOnClick(ActionEvent event) {
        isMedicineAvailable = true;
        updateMedicineAvailabilityOutput();
    }

    @FXML
    private void MedicineUnavailableButtonOnClick(ActionEvent event) {
        isMedicineAvailable = false;
        updateMedicineAvailabilityOutput();
    }

    @FXML
    private void SaveButtonOnAction(ActionEvent event) {
        String openCloseTime = OpenAndCloseTextField.getText();
        String radioButtonStatus = "";
        if (MedicineAvailableRadioButton.isSelected()) {
            radioButtonStatus = "Medicine status: Available\n";
        } else if (MedicineUnavailableRadioButton.isSelected()) {
            radioButtonStatus = "Medicine status: Unavailable\n";
        }
        MedicineAvailabilityOutputTextArea.setText(radioButtonStatus + "Open/Close time: " + openCloseTime);
    }

   
    private void updateMedicineAvailabilityOutput() {
        if (isMedicineAvailable) {
            MedicineAvailabilityOutputTextArea.setText("Medicine is available.");
        } else {
            MedicineAvailabilityOutputTextArea.setText("Medicine is unavailable.");
        }
    }
}


    

