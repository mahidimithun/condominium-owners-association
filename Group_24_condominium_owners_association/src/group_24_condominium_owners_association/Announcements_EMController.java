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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class Announcements_EMController implements Initializable {

    @FXML
    private ComboBox<?> UpcomingCommunityEventsComboBox;
    @FXML
    private TextArea ContentTextArea;
    @FXML
    private DatePicker Date_DatePicker;
    @FXML
    private TextField TimeTextField;
    @FXML
    private TextField LocationTextField;
    @FXML
    private TableView<?> AnnouncementsDetailsTV;
    @FXML
    private TableColumn<?, ?> UpcomingEventsTC;
    @FXML
    private TableColumn<?, ?> DateTC;
    @FXML
    private TableColumn<?, ?> TimeTC;
    @FXML
    private TableColumn<?, ?> LocationTC;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void DoneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClickOnAction(ActionEvent event) {
    }
    
}
