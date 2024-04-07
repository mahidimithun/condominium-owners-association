
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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class ScheduledReminders_COController implements Initializable {

    @FXML
    private Label ReminderMessageLabel;
    @FXML
    private TextField ReminderMessageTF;
    @FXML
    private TextField TimeTF;
    @FXML
    private DatePicker DateDatePicker;
    @FXML
    private Label ReminderListLabel;
    @FXML
    private TableView<?> ReminderListTV;
    @FXML
    private TableColumn<?, ?> ReminderTitleTC;
    @FXML
    private TableColumn<?, ?> DescriptionTC;
    @FXML
    private TableColumn<?, ?> DateTC;
    @FXML
    private TableColumn<?, ?> TimeTC;
    @FXML
    private TextField ReminderTitleTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddReminderButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void SaveButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void EditReminderButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void RefreshButtonOnAction(ActionEvent event) {
    }
    
}