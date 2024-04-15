/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class EM_ContactInfoFXMLController implements Initializable {

    @FXML
    private TextField GmailTextField;
    @FXML
    private TextField PhoneNumberTextField;
    @FXML
    private ComboBox<String> OfficehoursCB;
    @FXML
    private TextField NameTF;
    @FXML
    private TableView<EM_ContactInfo> EM_ContactInfoDetailsTV;
    @FXML
    private TableColumn<EM_ContactInfo, String> NameTC;
    @FXML
    private TableColumn<EM_ContactInfo, String> GmailTC;
    @FXML
    private TableColumn<EM_ContactInfo, String> PhoneNumberTC;
    @FXML
    private TableColumn<EM_ContactInfo, String> OfficeHoursTC;

    private ObservableList<EM_ContactInfo> contactInfoList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        OfficehoursCB.setItems(FXCollections.observableArrayList(
                "8:00 AM - 12:00 PM", "1:00 PM - 5:00 PM", "7:00 PM-11:00 PM")
        );

 
        contactInfoList = FXCollections.observableArrayList();
        EM_ContactInfoDetailsTV.setItems(contactInfoList);

        
        NameTC.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        GmailTC.setCellValueFactory(cellData -> cellData.getValue().gmailProperty());
        PhoneNumberTC.setCellValueFactory(cellData -> cellData.getValue().phoneNumberProperty());
        OfficeHoursTC.setCellValueFactory(cellData -> cellData.getValue().officeHoursProperty());
    }


    @FXML
    private void BackButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EventManagerDashboard.fxml"));
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

    @FXML
    private void ViewButtonOnClick(ActionEvent event) {
        
    String name = NameTF.getText();
    String gmail = GmailTextField.getText();
    String phoneNumber = PhoneNumberTextField.getText();
    String officeHours = OfficehoursCB.getValue();


    EM_ContactInfo contactInfo = new EM_ContactInfo(name, gmail, phoneNumber, officeHours);


    contactInfoList.add(contactInfo);

    }
    
}
