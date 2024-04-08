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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class RetailSpaceController implements Initializable {

    @FXML
    private TableColumn<?, ?> ProductNameTC;
    @FXML
    private TableColumn<?, ?> PriceTC;
    @FXML
    private TableColumn<?, ?> ExpiryDatesTC;
    @FXML
    private TableView<?> ProductDetailsTableView;
    @FXML
    private TextField ProductnameTextField;
    @FXML
    private TextField PriceTextField;
    @FXML
    private TextField expirydatesTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SaveButtonOnClickOnAction(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClickOnAction(ActionEvent event) {
    }


    private static class C {

        public C() {
        }
    }


    
}
