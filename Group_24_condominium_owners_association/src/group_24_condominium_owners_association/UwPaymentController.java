/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class UwPaymentController implements Initializable {

    @FXML
    private ComboBox<?> cb_paymentType;
    @FXML
    private Label lbl_showTotalAmount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void payNowOnClick(ActionEvent event) {
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UnitOwnerDashboard.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }
    
}
