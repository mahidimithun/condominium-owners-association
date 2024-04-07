/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
// EventParticipationChart_EMController.java
package group_24_condominium_owners_association;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventParticipationChart_EMController implements Initializable {

    @FXML
    private ComboBox<String> EventTypesCB;
    @FXML
    private TextField ParcentageofEventParticipationTF;
    @FXML
    private PieChart ViewEventsParticipationPieChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        EventTypesCB.getItems().addAll("BBQparty", "Fitness and Wellness Activities", "Welcome Parties",
                "Community Meetings", "Educational Workshops/Seminars");
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
    private void AddEventsToChartOnClick(ActionEvent event) {
        String eventType = EventTypesCB.getValue();
        String percentage = ParcentageofEventParticipationTF.getText();

        if (eventType != null && !eventType.isEmpty() && percentage != null && !percentage.isEmpty()) {
            ViewEventsParticipationPieChart.getData().add(new PieChart.Data(eventType, Double.parseDouble(percentage)));
        }
    }

    @FXML
    private void ViewEventsparticipationButtonOnClick(ActionEvent event) {
        // No additional action needed here if the chart is already updated dynamically
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
}