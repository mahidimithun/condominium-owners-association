/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class UwchartController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private BarChart<String, Double> barChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadOnClick(ActionEvent event) {
        
         ObservableList<PieChart.Data> chartData = FXCollections.observableArrayList();
        XYChart.Series barChartData = new XYChart.Series();
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader("unitOwnerchart.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String category = parts[0].trim();
                double value = Double.parseDouble(parts[1].trim());
                chartData.add(new PieChart.Data(category, value));
                barChartData.getData().add(new XYChart.Data(category,value));
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        pieChart.setData(chartData);
        pieChart.setTitle("Unit Owner Bill Pie Chart");
        pieChart.setLegendSide(Side.RIGHT);
        pieChart.setClockwise(false);
        
        barChart.getData().clear();
        barChart.getData().add(barChartData);
        barChart.setTitle("Unit Owner Bill Bar Chart");
        
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UnitOwnerDashboard.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
        
    }
    
}
