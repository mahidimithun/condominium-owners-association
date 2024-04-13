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

/**
 * FXML Controller class
 *
 * @author User
 */
public class MRCemergencyTreatmentRequestController implements Initializable {

    @FXML
    private TableColumn<?, ?> MRCemergencyTreatReq_UnitOwnerId;
    @FXML
    private TableColumn<?, ?> MRCemergencyTreatReq_ProblemType;
    @FXML
    private TableView<?> MRCemergencyTreatReq_tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void MRCemergencyTreatReqBackOnClick(ActionEvent event) {
    }

    @FXML
    private void MRCemergencyTreatReqViewOnClick(ActionEvent event) {
    }

    @FXML
    private void MRCemergencyTreatReqClearOnClick(ActionEvent event) {
    }
    
}
