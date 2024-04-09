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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdvertisingandPromotionOpportunities_COController implements Initializable {

    @FXML
    private TextField TitleTF;
    @FXML
    private TableView<AdvertisingPromotion> Advertisement_TV;
    @FXML
    private TableColumn<AdvertisingPromotion, String> TitleTC;
    @FXML
    private TableColumn<AdvertisingPromotion, String> DescriptionTC;
    @FXML
    private TableColumn<AdvertisingPromotion, String> dateTC;
    @FXML
    private TextField DescriptionTF;
    @FXML
    private DatePicker Date_DP;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize columns to display data from AdvertisingPromotion
        TitleTC.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        DescriptionTC.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
        dateTC.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
    }    

    @FXML
    private void BackButtonOnAction(ActionEvent event) {
        // Handle Back button action
    }

    @FXML
    private void AddButtonOnAction(ActionEvent event) {
        // Get data from input fields
        String title = TitleTF.getText();
        String description = DescriptionTF.getText();
        String date = Date_DP.getValue().toString();
        
        // Create AdvertisingPromotion object
        AdvertisingPromotion promotion = new AdvertisingPromotion(title, description, date);
        
        // Add the object to the TableView
        Advertisement_TV.getItems().add(promotion);
        
        // Clear input fields after adding
        clearFields();
    }

    @FXML
    private void DeleteButtonOnAction(ActionEvent event) {
        // Handle Delete button action
    }

    @FXML
    private void logoutButtonOnAction(ActionEvent event) {
        // Handle logout button action
    }
    
    private void clearFields() {
        TitleTF.clear();
        DescriptionTF.clear();
        Date_DP.setValue(null);
    }
}