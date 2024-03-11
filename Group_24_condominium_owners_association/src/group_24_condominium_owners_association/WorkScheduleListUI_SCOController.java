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
public class WorkScheduleListUI_SCOController implements Initializable {

    @FXML
    private TextField scheduleName_tf;
    @FXML
    private DatePicker scheduleDate_dp;
    @FXML
    private TextArea scheduleList_ta;
    @FXML
    private TableView<?> scheduleTable_tv;
    @FXML
    private TableColumn<?, ?> scheduleName_tc;
    @FXML
    private TableColumn<?, ?> schduleDate_tc;
    @FXML
    private Label workScheduleOutput_Label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackToHomePageOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addNewScheduleOnButonClick(ActionEvent event) {
    }

    @FXML
    private void cancelScheduleOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addNewScheduleOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void removeScheduleOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewScheduleOnButtonClick(ActionEvent event) {
    }
    
}
