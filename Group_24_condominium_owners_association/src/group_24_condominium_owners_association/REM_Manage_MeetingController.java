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
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Manage_MeetingController implements Initializable {

    @FXML
    private TextField MeetDocumentName_TextField;
    @FXML
    private TextField MeetType_TextField;
    @FXML
    private TextField meetingTitle_TextField;
    @FXML
    private TextField meetingTime_TextField;
    @FXML
    private TableView<?> meetingDocumentation_TV;
    @FXML
    private TableColumn<?, ?> meetDocumentationName_Tc;
    @FXML
    private TableColumn<?, ?> meetingType_Tc;
    @FXML
    private TableColumn<?, ?> meetingTitle_Tc;
    @FXML
    private TableColumn<?, ?> meetingTime_Tc;
    @FXML
    private TextField TypePie_TextField;
    @FXML
    private TextField Typepercentage_TextField;
    @FXML
    private PieChart piechart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClck(ActionEvent event) {
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
    private void logOutButtonOnClick(ActionEvent event) {
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
    private void viewDocumentPercentageOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addNewTypeOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addDocumentaionOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void RemoveDocumenOnButtonClick(ActionEvent event) {
    }
    
}
