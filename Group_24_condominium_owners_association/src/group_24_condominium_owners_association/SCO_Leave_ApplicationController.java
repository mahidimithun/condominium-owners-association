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
import javafx.scene.chart.BarChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_Leave_ApplicationController implements Initializable {

    @FXML
    private TextField guardName_TextField;
    @FXML
    private ComboBox<?> guardDesignation_Combobox;
    @FXML
    private ComboBox<?> leaveApplication_Combobox;
    @FXML
    private ComboBox<?> applicationapproval_Combobox;
    @FXML
    private TextArea recordsOutput_TextArea;
    @FXML
    private TextField enterApplicationType_TextField;
    @FXML
    private TextField Percentage_TextField;
    @FXML
    private BarChart<?, ?> BarChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addRecordsButttonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewRecordsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void vewRecordsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addRecordsOnButtonClick(ActionEvent event) {
    }
    
}
