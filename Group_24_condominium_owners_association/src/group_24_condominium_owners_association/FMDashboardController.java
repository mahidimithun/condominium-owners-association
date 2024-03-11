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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FMDashboardController implements Initializable {

    @FXML
    private TextField tf_fm_UtilityBill;
    @FXML
    private TextField tf_fm_OwnerId;
    @FXML
    private TableView<?> tableView1;
    @FXML
    private TableColumn<?, ?> tc_Fm_UnitOwnerId;
    @FXML
    private TableColumn<?, ?> tc_Fm_ApartmentName;
    @FXML
    private TableColumn<?, ?> tc_Fm_Floor;
    @FXML
    private TableView<?> tableView2;
    @FXML
    private TableColumn<?, ?> tc_OwnerId;
    @FXML
    private TableColumn<?, ?> tc_UtilityBill;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Click_Fm_RecieveBills(ActionEvent event) {
    }

    @FXML
    private void Click_Fm_Gardening(ActionEvent event) {
    }

    @FXML
    private void Click_Fm_SwimingPool(ActionEvent event) {
    }

    @FXML
    private void Click_Fm_EventTracking(ActionEvent event) {
    }

    @FXML
    private void Click_Fm_Property(ActionEvent event) {
    }

    @FXML
    private void Click_Fm_EventFee(ActionEvent event) {
    }

    @FXML
    private void AddBill(ActionEvent event) {
    }

    @FXML
    private void SendBill(ActionEvent event) {
    }

    @FXML
    private void Click_Fm_Budget(ActionEvent event) {
    }
    
}
