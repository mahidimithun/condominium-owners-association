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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ComOwnFacilityDetailsController implements Initializable {

    @FXML
    private TextField LocationTextField;
    @FXML
    private ComboBox<String> OpenHoursComboBox;
    @FXML
    private TextField ServicesOfferTF;
    @FXML
    private TableView<ComOwnFacilityDetails> FacilitiesOutputTV;
    @FXML
    private TableColumn<ComOwnFacilityDetails, String> LocationTC;
    @FXML
    private TableColumn<ComOwnFacilityDetails, String> OpenHoursTC;
    @FXML
    private TableColumn<ComOwnFacilityDetails, String> ServicesOfferTC;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize ComboBox with open hours
        OpenHoursComboBox.getItems().addAll("8:00 AM - 5:00 PM", "9:00 AM - 6:00 PM", "10:00 AM - 7:00 PM");

        // Initialize TableView columns
        LocationTC.setCellValueFactory(cellData -> cellData.getValue().locationProperty());
        OpenHoursTC.setCellValueFactory(cellData -> cellData.getValue().openHoursProperty());
        ServicesOfferTC.setCellValueFactory(cellData -> cellData.getValue().servicesOfferProperty());

        
         if (FacilitiesOutputTV != null) {
       


        LocationTC.setCellValueFactory(cellData -> cellData.getValue().locationProperty());
        OpenHoursTC.setCellValueFactory(cellData -> cellData.getValue().openHoursProperty());
        ServicesOfferTC.setCellValueFactory(cellData -> cellData.getValue().servicesOfferProperty());
    }
    }    

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }

    

    @FXML
    private void MedicalPharmacyButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MedicalPharmacy.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void BeautySalonButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("BeautySalon.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void RetailSpaceButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("RetailSpace.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void GymnasiumCenterButtonOnAction(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("GymnasiumCenter.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void DoneButtonOnAction(ActionEvent event) {
         String location = LocationTextField.getText();
    String openHours = OpenHoursComboBox.getValue();
    String servicesOffered = ServicesOfferTF.getText();
    
  
    if (location.isEmpty() || openHours == null || servicesOffered.isEmpty()) {
  
        System.out.println("Please fill in all the fields.");
        return;
    }
    
  
    ComOwnFacilityDetails newFacility = new ComOwnFacilityDetails(location, openHours, servicesOffered);
    
    
    FacilitiesOutputTV.getItems().add(newFacility);
    
  
    LocationTextField.clear();
    OpenHoursComboBox.getSelectionModel().clearSelection();
    ServicesOfferTF.clear();


  
  
}


    

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
    }
    
}
