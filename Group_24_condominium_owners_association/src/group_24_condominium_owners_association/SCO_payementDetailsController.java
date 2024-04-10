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
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_payementDetailsController implements Initializable {

    @FXML
    private RadioButton paid_rb;
    @FXML
    private RadioButton unpaid_rb;
    @FXML
    private TextField guardName_TextField;
    @FXML
    private ComboBox<?> guardDesignation_Combobox;
    @FXML
    private TextField paymentAmount_TextField;
    @FXML
    private DatePicker payment_dp;
    @FXML
    private ComboBox<?> paymentApproval_Combobox;
    @FXML
    private TableView<?> paymentDetails_TV;
    @FXML
    private TableColumn<?, ?> guardName_TC;
    @FXML
    private TableColumn<?, ?> guardDesignation_TC;
    @FXML
    private TableColumn<?, ?> paymentStatus_TC;
    @FXML
    private TableColumn<?, ?> paymentAmount_TC;
    @FXML
    private TableColumn<?, ?> paymentDate_TC;
    @FXML
    private TableColumn<?, ?> payemntApproval_TC;

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
    private void logOutOnButtonClick(ActionEvent event) {
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
