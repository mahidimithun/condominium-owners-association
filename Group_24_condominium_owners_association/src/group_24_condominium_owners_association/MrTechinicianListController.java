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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MrTechinicianListController implements Initializable {

    @FXML
    private TextField tf_inputTechName;
    @FXML
    private TextField tf_inputTechPhoneNo;
    @FXML
    private ComboBox<?> cb_inputTechType;
    @FXML
    private TableView<?> techTable;
    @FXML
    private TableColumn<?, ?> tc_techPhone;
    @FXML
    private TableColumn<?, ?> tc_TechType;
    @FXML
    private TableColumn<?, ?> tc_TechName;
    @FXML
    private DatePicker techHireDate;
    @FXML
    private ComboBox<?> cb_oldTechType;
    @FXML
    private Label lbl_showTechName;
    @FXML
    private Label showTechPhone;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewTechOnClick(ActionEvent event) {
    }
    
}
