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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AD_ListScence_REMController implements Initializable {

    @FXML
    private TableView<?> DocumentationTable_tv;
    @FXML
    private TableColumn<?, ?> DocumentName_tc;
    @FXML
    private TableColumn<?, ?> DocumentDate_tc;
    @FXML
    private TextArea documentationOutput_label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void removeDocumentOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void addDocumentOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void goBackOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void viewDocumentOnButtonClick(ActionEvent event) {
    }
    
}
