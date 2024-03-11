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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class TrainingSessionGuard_SCOController implements Initializable {

    @FXML
    private TextField participateName_tf;
    @FXML
    private DatePicker trainingDate_dp;
    @FXML
    private TextArea TraingProgram_ta;
    @FXML
    private TableView<?> trainingProgram_tv;
    @FXML
    private TableColumn<?, ?> participateName_tc;
    @FXML
    private TableColumn<?, ?> traingProgramDate_tc;
    @FXML
    private Label TrainingProgramOutput_Label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackToHomeOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addTrainingOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void cancelOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void removeTrainingOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addtrainingOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewTrainingOnButtonClick(ActionEvent event) {
    }
    
}
