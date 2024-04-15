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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class ParkingManagement_COController implements Initializable {

    @FXML
    private PieChart ParkingsituationPieChart;
    @FXML
    private TextField ParcentageofparkingusageTextField;
    @FXML
    private ComboBox<String> Search_CB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Search_CB.getItems().addAll("Available parking spots", "Occupied spots", "Reserved spots");
    }    




    @FXML
    private void AddingButtonOnAction(ActionEvent event) {
        String Search = Search_CB.getValue();
        String percentage = ParcentageofparkingusageTextField.getText();

        if (Search != null && !Search.isEmpty() && percentage != null && !percentage.isEmpty()) {
           ParkingsituationPieChart.getData().add(new PieChart.Data(Search, Double.parseDouble(percentage)));
        }
    }


    @FXML
    private void BackButtonOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CommercialOwnerDashboard.fxml"));
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
    private void ViewButtonOnClickOnAction(ActionEvent event) {
    }
    
}
