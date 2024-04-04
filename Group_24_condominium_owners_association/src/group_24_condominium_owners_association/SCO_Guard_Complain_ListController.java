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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_Guard_Complain_ListController implements Initializable {

    @FXML
    private RadioButton addressedRadioButton;
    @FXML
    private RadioButton notAddressedRadioButton;
    @FXML
    private ComboBox<?> complainType_Combobox;
    @FXML
    private TextField complainBy_TextField;
    @FXML
    private DatePicker complainDate_DatePicker;
    @FXML
    private TextArea complainTopic_TextArea;
    @FXML
    private TableView<?> guardComplain_TableView;
    @FXML
    private TableColumn<?, ?> complainBy_TableColumn;
    @FXML
    private TableColumn<?, ?> complainType_TableColumn;
    @FXML
    private TableColumn<?, ?> complainDate_TableColumn;
    @FXML
    private TableColumn<?, ?> complainStatus_TableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void LogOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void editGuardComplainButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void saveGuardComplainButtonOnClick(ActionEvent event) {
    }
    
}
