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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_AssociationDocumentationController implements Initializable {

    @FXML
    private TextArea AssociationDocumentation_ta;
    @FXML
    private TextField documentName_tf;
    @FXML
    private DatePicker documentDate_dp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addDocumentOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void removeDocumentOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void goBackToHomePageOnButtonClick(ActionEvent event) {
    }
    
}
