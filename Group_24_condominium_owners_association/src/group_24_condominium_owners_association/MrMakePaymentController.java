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
 * @author HP
 */
public class MrMakePaymentController implements Initializable {

    @FXML
    private TextField tf_paymentCode;
    @FXML
    private ComboBox<?> cb_paymentType;
    @FXML
    private TextField tf_amount;
    @FXML
    private TextField tf_unitOwnerId;
    @FXML
    private TableView<?> makePaymentTable;
    @FXML
    private TableColumn<?, ?> tc_paymentCode;
    @FXML
    private TableColumn<?, ?> tc_paymentType;
    @FXML
    private TableColumn<?, ?> tc_amount;
    @FXML
    private TableColumn<?, ?> tc_unitOwnerId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void makePaymentOnClick(ActionEvent event) {
    }
    
}
