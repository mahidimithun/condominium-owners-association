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
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class AdvertisingandPromotionOpportunities_COController implements Initializable {

    @FXML
    private Label AdvertisementandPromotionManagementSectionLabel;
    @FXML
    private TextField TitleTF;
    @FXML
    private AnchorPane EndDateDatePicker;
    @FXML
    private TableView<?> Advertisement_TV;
    @FXML
    private TableColumn<?, ?> TitleTC;
    @FXML
    private TableColumn<?, ?> DescriptionTC;
    @FXML
    private TableColumn<?, ?> StartdateTC;
    @FXML
    private TableColumn<?, ?> EnddateTC;
    @FXML
    private TextArea DescriptionTA;
    @FXML
    private DatePicker StartDate_DatePicker;
    @FXML
    private DatePicker EndDate_DatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BackButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void AddButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void EditButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void DeleteButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void OkButtonOnAction(ActionEvent event) {
    }
    
}
