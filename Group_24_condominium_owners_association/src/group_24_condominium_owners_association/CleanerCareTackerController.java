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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CleanerCareTackerController implements Initializable {

    @FXML
    private TextField tf_cleanerId;
    @FXML
    private TextField tf_cleanerName;
    @FXML
    private TextField tf_cleanerAge;
    @FXML
    private ComboBox<?> cb_cleanerGender;
    @FXML
    private ComboBox<?> cb_cleanerType;
    @FXML
    private TextField tf_careTakerId;
    @FXML
    private TextField tf_careTakerName;
    @FXML
    private TextField tf_careTakerAge;
    @FXML
    private ComboBox<?> cb_careTakerGender;
    @FXML
    private ComboBox<?> cb_careTakerType;
    @FXML
    private TableView<?> cleanerTable;
    @FXML
    private TableColumn<?, ?> tc_cleanerId;
    @FXML
    private TableColumn<?, ?> tc_cleanerName;
    @FXML
    private TableColumn<?, ?> tc_cleanerAge;
    @FXML
    private TableColumn<?, ?> tc_cleanerGender;
    @FXML
    private TableColumn<?, ?> tc_cleanerType;
    @FXML
    private TableView<?> careTakerTable;
    @FXML
    private TableColumn<?, ?> tc_careTakerId;
    @FXML
    private TableColumn<?, ?> tc_careTakerName;
    @FXML
    private TableColumn<?, ?> tc_careTakerAge;
    @FXML
    private TableColumn<?, ?> tc_careTakerGender;
    @FXML
    private TableColumn<?, ?> tc_careTakerType;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addCleanerOnClick(ActionEvent event) {
    }

    @FXML
    private void addCareTakerOnClick(ActionEvent event) {
    }
    
}
