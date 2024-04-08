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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class EventDetailsController implements Initializable {

    @FXML
    private TextField TimeTextField;
    @FXML
    private DatePicker DateTextField;
    @FXML
    private ComboBox<?> EventNameComboBox;
    @FXML
    private TextArea EventDetailsUpdatesTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void DoneButtonOnClickOnAction(ActionEvent event) {
    }
    
}
