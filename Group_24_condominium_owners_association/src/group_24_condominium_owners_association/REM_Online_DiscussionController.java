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
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Online_DiscussionController implements Initializable {

    @FXML
    private PieChart discussionTopicPieChart;
    @FXML
    private ComboBox<?> discussion_Type_Combobox;
    @FXML
    private TextArea discussionTopicTextArea;
    @FXML
    private TableColumn<?, ?> discussionType_TableColumn;
    @FXML
    private TableColumn<?, ?> discussionTopic_TableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewDiscussionOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void cancelDiscussionOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void LogOutButtonOnClick(ActionEvent event) {
    }
    
}
