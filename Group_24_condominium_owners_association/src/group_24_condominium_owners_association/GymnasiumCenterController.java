/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class GymnasiumCenterController implements Initializable {

   
    @FXML
    private ComboBox<String> OpenhoursComboBox; // Changed ComboBox<?> to ComboBox<String> assuming it holds String values
    @FXML
    private TextField NecessaryEqTextField;
    @FXML
    private TextArea GymnasiumUpdatesTextArea;
    @FXML
    private RadioButton ServiceOffer_AvailableRB;
    @FXML
    private RadioButton ServiceOffer_UnavailableRB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        OpenhoursComboBox.getItems().addAll(
            "8:00 AM - 10:00 AM",
            "12:00 PM - 2:00 PM",
            "4:00 PM - 6:00 PM"
            
        );
    }    

    private void AvailableButtonOnClick(ActionEvent event) {
        
        ServiceOffer_AvailableRB.setSelected(true);
      ServiceOffer_AvailableRB.setSelected(false);
    }

    private void UnavailableButtonOnClick(ActionEvent event) {

      ServiceOffer_UnavailableRB.setSelected(false);
        ServiceOffer_UnavailableRB.setSelected(true);
    }


       
    @FXML
    private void BackButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CommercialOwnerDashboard.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setTitle("back");
            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void SaveButtonOnAction(ActionEvent event) {
         String serviceStatus;
    
    if (ServiceOffer_AvailableRB.isSelected()) {
        serviceStatus = "Service Available";
    } else {
        serviceStatus = "Service Unavailable";
    }
    
    String openHours = OpenhoursComboBox.getValue();
    String necessaryEquipment = NecessaryEqTextField.getText();
    
    // Formulate the update text
    String updateText = "Service Status: " + serviceStatus + "\n" +
                        "Open Hours: " + openHours + "\n" +
                        "Necessary Equipment: " + necessaryEquipment;
    
    // Update the TextArea
    GymnasiumUpdatesTextArea.setText(updateText);
}
    }
    

    

