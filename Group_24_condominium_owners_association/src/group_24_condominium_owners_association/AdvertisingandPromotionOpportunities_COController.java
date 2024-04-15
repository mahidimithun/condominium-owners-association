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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

        TitleTC.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        DescriptionTC.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
        dateTC.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
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
    private void AddButtonOnAction(ActionEvent event) {
        
        String title = TitleTF.getText();
        String description = DescriptionTF.getText();
        String date = Date_DP.getValue().toString();
        
    
        AdvertisingPromotion promotion = new AdvertisingPromotion(title, description, date);
        
      
        Advertisement_TV.getItems().add(promotion);
        
        
    }

    @FXML
    private void DeleteButtonOnAction(ActionEvent event) {
        TitleTF.clear();
    DescriptionTF.clear();
    Date_DP.setValue(null);
}
      
    

    @FXML
    private void logoutButtonOnAction(ActionEvent event) {
        try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUI.fxml"));
        Parent root = loader.load();

        
        Stage newStage = new Stage();
        newStage.setTitle("logout");

      
        Scene scene = new Scene(root);
        newStage.setScene(scene);

        
        newStage.show();
    } catch (IOException e) {
        e.printStackTrace();
        
    }
    }
}
    
    