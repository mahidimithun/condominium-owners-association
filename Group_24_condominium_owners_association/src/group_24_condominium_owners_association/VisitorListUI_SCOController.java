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
public class VisitorListUI_SCOController implements Initializable {
    @FXML
    private TextArea Visitor_ta;
    @FXML
    private TableView<?> guard_tv;
    @FXML
    private TableColumn<?, ?> guardName_tc;
    @FXML
    private TableColumn<?, ?> guardJoiningDate_tc;
    @FXML
    private Label securityGuardList_Label;
    @FXML
    private TextField guardName_tf;
    @FXML
    private DatePicker guardJoiningDate_dp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gOBackOnButtonClick(ActionEvent event) {
    }


    @FXML
    private void addGuardOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void removeGuardOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewGuardOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void cancelOnButtonClick(ActionEvent event) {
    }

    
}
