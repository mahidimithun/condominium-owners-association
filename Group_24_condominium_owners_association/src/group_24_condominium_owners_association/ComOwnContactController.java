/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ComOwnContactController implements Initializable {

    @FXML
    private TextField GmailTF;

    @FXML
    private TextField PhoneTF;

    @FXML
    private ComboBox<String> OfficehoursCB;

    @FXML
    private TextField NameTF;

    @FXML
    private TableView<ComOwnContact> CommercialOwner_ContactInfoDetailsTV;

    @FXML
    private TableColumn<ComOwnContact, String> NameTableColumn;

    @FXML
    private TableColumn<ComOwnContact, String> GmailTableColumn;

    @FXML
    private TableColumn<ComOwnContact, String> OfficeHoursTableColumn;

    @FXML
    private TableColumn<ComOwnContact, String> PhoneNumberTableColumn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        OfficehoursCB.getItems().addAll("9 AM - 12 PM", "1 PM - 4 PM", "6 PM - 10 PM");

      
        NameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        GmailTableColumn.setCellValueFactory(new PropertyValueFactory<>("gmail"));
        OfficeHoursTableColumn.setCellValueFactory(new PropertyValueFactory<>("officeHours"));
        PhoneNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
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
    private void ViewButtonOnAction(ActionEvent event) {
     
        String name = NameTF.getText();
        String gmail = GmailTF.getText();
        String phone = PhoneTF.getText();
        String officeHours = OfficehoursCB.getValue();

  
       ComOwnContact contactInfo = new ComOwnContact(name, gmail, phone, officeHours);

      
        CommercialOwner_ContactInfoDetailsTV.getItems().add(contactInfo);
    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
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

    

