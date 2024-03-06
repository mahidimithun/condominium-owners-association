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
public class MRcoordinatorController implements Initializable {

    @FXML
    private TableView<?> repairTable;
    @FXML
    private TableColumn<?, ?> tc_repairUnitOwnerId;
    @FXML
    private TableColumn<?, ?> tc_repairProduct;
    @FXML
    private TableColumn<?, ?> tc_repairDate;
    @FXML
    private TableView<?> maintenanceTable;
    @FXML
    private TableColumn<?, ?> tc_maintenance;
    @FXML
    private ComboBox<?> cb_equipmentList;
    @FXML
    private TableView<?> equipmentTable;
    @FXML
    private TableColumn<?, ?> tc_equipmentId;
    @FXML
    private TableColumn<?, ?> tc_equipmentName;
    @FXML
    private TextField tf_equipmentId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cleanerAndCareTakerOnClick(ActionEvent event) {
    }

    @FXML
    private void technicianOnClick(ActionEvent event) {
    }

    @FXML
    private void budgetOnClick(ActionEvent event) {
    }

    @FXML
    private void makePaymentOnClick(ActionEvent event) {
    }
    
}
