/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Online_DiscussionController implements Initializable {

    @FXML
    private PieChart pieChart;

    /**
     * Initializes the controller class.
     */
     private ObservableList <PieChart.Data> list 
            = FXCollections.observableArrayList();
    @FXML
    private TextField newItemName;
    @FXML
    private TextField newItemValue;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void cancelDiscussionOnButtonClick(ActionEvent event) {
    }

    @FXML
    private void LogOutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void loadPieChartButton(ActionEvent event) {
        pieChart.setData(list);
        
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                    new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                   
                }
            }
            );
            
        }
    }

    @FXML
    private void addNewItemToChartButtonOnClick(ActionEvent event) {
         list.add(
            new PieChart.Data(
                newItemName.getText(),
                Integer.parseInt(newItemValue.getText())
            )        
        );
    }
    
}
