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

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_CCTV_Footage_RecordController implements Initializable {

    @FXML
    private Label CCTVRecordOutput_Label;
    @FXML
    private TextArea CCTVfootageFileDetails_TextArea;
    @FXML
    private DatePicker CCTVFileRecordDate_DatePicker;
    @FXML
    private TableView<?> CCTVFootage_TableView;
    @FXML
    private TableColumn<?, ?> CCTVFileDetails_TableColumn;
    @FXML
    private TableColumn<?, ?> fileRecordDate_TableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addFootageFileRecordButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewFootageFileRecordButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void removeFootageRecordButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void cancelFootageButtonOnClick(ActionEvent event) {
    }
    
}
