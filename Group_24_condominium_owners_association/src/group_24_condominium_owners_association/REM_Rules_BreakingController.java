/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Rules_BreakingController implements Initializable {

    @FXML
    private TextField PolicyName_TextField;
    @FXML
    private TextField violationName_TextField;
    @FXML
    private ComboBox<?> Rulesviolation_ComboBox;
    @FXML
    private TextField ViolatorName_TextField;
    @FXML
    private TableView<?> RulesBreaking_TableView;
    @FXML
    private TableColumn<?, ?> PolicyName_TableColumn;
    @FXML
    private TableColumn<?, ?> ViolationName_TableColumn;
    @FXML
    private TableColumn<?, ?> rulesViolation_TableColumn;
    @FXML
    private TableColumn<?, ?> ViolatorName_TableColumn;
    @FXML
    private DatePicker rulesBreaking_DatePicker;
    @FXML
    private TableColumn<?, ?> rulesBreakingDate_DatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("RuelsAndPolicyManagerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LogInUI.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @FXML
    private void addRulesBreakButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewDetailsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    }
    
}
