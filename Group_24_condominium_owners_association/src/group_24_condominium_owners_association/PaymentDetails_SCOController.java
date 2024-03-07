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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class PaymentDetails_SCOController implements Initializable {

    @FXML
    private TextField payment_tf;
    @FXML
    private TextField paymentAmount_tf;
    @FXML
    private DatePicker PaymentDate_dp;
    @FXML
    private RadioButton paid_rb;
    @FXML
    private RadioButton unpaid_rb;
    @FXML
    private TableColumn<?, ?> payment_tc;
    @FXML
    private TableColumn<?, ?> paymentAmount_tc;
    @FXML
    private TableColumn<?, ?> paymentDate_tc;
    @FXML
    private TableColumn<?, ?> paymentStatus_tc;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addPaymentOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void payment_tv(MouseEvent event) {
    }

    @FXML
    private void addButtonForTableViewOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void goBackToOnButtonClick(ActionEvent event) {
    }
    
}
