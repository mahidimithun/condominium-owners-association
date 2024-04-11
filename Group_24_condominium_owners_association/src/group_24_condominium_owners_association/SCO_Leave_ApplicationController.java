/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SCO_Leave_ApplicationController implements Initializable {

    @FXML
    private TextField guardName_TextField;
    @FXML
    private ComboBox<String> guardDesignation_Combobox;
    @FXML
    private ComboBox<String> leaveApplication_Combobox;
    @FXML
    private ComboBox<String> applicationapproval_Combobox;
    @FXML
    private TextArea recordsOutput_TextArea;
    @FXML
    private TextField enterApplicationType_TextField;
    @FXML
    private TextField Percentage_TextField;
    @FXML
    private BarChart<String, Number> barChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        initializeComboBoxes();
        initializeBarChart();
    }

    private void initializeComboBoxes() {
        
        guardDesignation_Combobox.getItems().addAll(" Senior Guard ", "Junior Guard ", " Emergency Guard ");
        leaveApplication_Combobox.getItems().addAll("Vacation", "Sick Leave", "Personal Leave");
        applicationapproval_Combobox.getItems().addAll("Approved", "Pending", "Rejected");
    }

    private void initializeBarChart() {
       
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        barChart.setTitle("Leave Application Percentage");
        xAxis.setLabel("Application Type");
        yAxis.setLabel("Percentage");
        barChart.setLegendVisible(false);
        barChart.setAnimated(false);
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        // Handle back button click
    }

    @FXML
    private void logoutButtonOnClick(ActionEvent event) {
        // Handle logout button click
    }

    @FXML
    private void addRecordsButttonOnClick(ActionEvent event) {
        // Handle add records button click
        String record = ""; // Get the record data
        recordsOutput_TextArea.appendText(record + "\n");
    }

    @FXML
    private void viewRecordsButtonOnClick(ActionEvent event) {
          String guardName = guardName_TextField.getText();
    String guardDesignation = guardDesignation_Combobox.getValue();
    String leaveApplication = leaveApplication_Combobox.getValue();
    String applicationApproval = applicationapproval_Combobox.getValue();

    // Create a string representation of the output
    String output = "Guard Name: " + guardName + "\n" +
                    "Guard Designation: " + guardDesignation + "\n" +
                    "Leave Application: " + leaveApplication + "\n" +
                    "Application Approval: " + applicationApproval;

    // Show the output in the recordsOutput_TextArea
    recordsOutput_TextArea.setText(output);
    }

    

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
       recordsOutput_TextArea.clear();
    }

    @FXML
    private void addRecordsBarChartOnButtonClick(ActionEvent event) {
      
           loadRecordsOnMouseClick();
    }

    private void loadRecordsOnMouseClick() {
       
        String applicationType = enterApplicationType_TextField.getText();
        int percentage = Integer.parseInt(Percentage_TextField.getText());

     
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>(applicationType, percentage));
        barChart.getData().add(series);

    }

    @FXML
    private void cancelBarChartButtonOnClick(ActionEvent event) {
       
        barChart.getData().clear(); 
    }

    @FXML
    private void viewRecordsButtonBarChartOnClick(ActionEvent event) {
        
       displayRecordsOnBarChart();
    }

    private void displayRecordsOnBarChart() {
        // You need to implement the logic to retrieve records from the data source and then add them to the bar chart.
        // Since the data source retrieval mechanism is not provided, I'll demonstrate with a sample dataset.
        // For demonstration purposes, let's assume the data is retrieved from some external source or database.
        // In a real application, replace this with your actual data retrieval logic.

        // For demonstration, let's assume we have the following data:
        String applicationType = enterApplicationType_TextField.getText();
        int percentage = Integer.parseInt(Percentage_TextField.getText());

        // Add data to BarChart
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>(applicationType, percentage));
        barChart.getData().add(series);
   
    }
}

