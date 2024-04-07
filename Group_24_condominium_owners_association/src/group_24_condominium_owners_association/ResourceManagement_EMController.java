/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class ResourceManagement_EMController implements Initializable {

 
    @FXML
    private ComboBox<String> EquipmentListCB;
    @FXML
    private TextField NumberofEquipmentListTF;
    @FXML
    private PieChart NumberofEquipmentListPieChart;
    @FXML
    private TextField EventslistTF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      EquipmentListCB.getItems().addAll("Tables and Chairs", "Audio Equipments", "Visual Equipment", "Decoration Items","Food and Beverage Equipment");
        

    }    

   

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EventManagerDashboard.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setTitle("back");
            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUI.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setTitle("logout");
            Scene scene = new Scene(root);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    @FXML
    private void AddButtonOnClick(ActionEvent event) {
        String equipmentList = EquipmentListCB.getValue();
    String percentage = NumberofEquipmentListTF.getText();

    if (equipmentList != null && !equipmentList.isEmpty() && percentage != null && !percentage.isEmpty()) {
        NumberofEquipmentListPieChart.getData().add(new PieChart.Data(equipmentList, Double.parseDouble(percentage)));
    }
}
    }
         
    
   
    
