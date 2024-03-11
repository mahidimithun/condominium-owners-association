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
public class SCO_SecurityGuardListController implements Initializable {

    @FXML
    private TextField securityGuard_tf;
    @FXML
    private DatePicker guardJoiningDate_dp;
    @FXML
    private TextArea GuardList_ta;
    @FXML
    private TableView<?> Security_tv;
    @FXML
    private TableColumn<?, ?> guardName_tc;
    @FXML
    private TableColumn<?, ?> guardJoining_tc;
    @FXML
    private Label GuardOutput_Label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackToHomeOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addGuardNameOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void removeGuardOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewGuardNameOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void CancelSecurityOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addGuardListOnButtonClick(ActionEvent event) {
    }
    
}
