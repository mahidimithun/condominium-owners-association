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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Documentation_ListController implements Initializable {

    @FXML
    private TableView<?> Document_TableView;
    @FXML
    private TableColumn<?, ?> DocumentName_TableColumn;
    @FXML
    private TableColumn<?, ?> documentDate_TableColumn;
    @FXML
    private TableColumn<?, ?> documentTopic_TableColumn;
    @FXML
    private TableColumn<?, ?> file_TableColumn;
    @FXML
    private TextField documentName_TextField;
    @FXML
    private DatePicker document_dp;
    @FXML
    private ComboBox<?> documentTopic_TextField;
    @FXML
    private ComboBox<?> fileType_Combobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addDocumentButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void viewDocumentButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
    }
    
}
