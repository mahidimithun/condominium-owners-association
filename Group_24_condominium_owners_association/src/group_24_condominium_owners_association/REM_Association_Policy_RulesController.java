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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Association_Policy_RulesController implements Initializable {

    @FXML
    private TextArea newRules_TextArea;
    @FXML
    private TextArea newPolicy_TextArea;
    @FXML
    private TextField PolicyAddtime_TextField;
    @FXML
    private DatePicker policyAddDate_Datepicker;
    @FXML
    private TableView<?> policyAndRules_TableView;
    @FXML
    private TableColumn<?, ?> newPolicy_TableColumn;
    @FXML
    private TableColumn<?, ?> newRules_TableColumn;
    @FXML
    private TableColumn<?, ?> policyAddtime_TableColumn;
    @FXML
    private TableColumn<?, ?> policyAddDate_TableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackbuttonOnClick(ActionEvent event) {
    }

    @FXML
    private void LogOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addDetailsOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewDetailsOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    }
    
}
