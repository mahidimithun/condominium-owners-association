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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class ComOwnContactController implements Initializable {

    @FXML
    private TextField GmailTF;
    @FXML
    private TextField PhoneTF;
    @FXML
    private ComboBox<?> OfficehoursCB;
    @FXML
    private TextField NameTF;
    @FXML
    private TableView<?> CommercialOwner_ContactInfoDetailsTV;
    @FXML
    private TableColumn<?, ?> NameTableColumn;
    @FXML
    private TableColumn<?, ?> GmailTableColumn;
    @FXML
    private TableColumn<?, ?> OfficeHoursTableColumn;
    @FXML
    private TableColumn<?, ?> PhoneNumberTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void ViewButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
    }
    
}
