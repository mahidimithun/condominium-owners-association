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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_Security_Guard_ListController implements Initializable {

    @FXML
    private TableView<?> securityGuardList_TableView;
    @FXML
    private TableColumn<?, ?> securityGuardName_TableColumn;
    @FXML
    private TableColumn<?, ?> guardJoiningDate_TableColumn;
    @FXML
    private TextField securityGuardName_TextField;
    @FXML
    private DatePicker guardJoiningDate_DatePicker;
    @FXML
    private TextArea securityGuardList_TextArea;
    @FXML
    private Label securityGuardList_Label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addGuardOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void removeGuardNameOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewGuardNameOnButtonClick(ActionEvent event) {
    }
    
}
