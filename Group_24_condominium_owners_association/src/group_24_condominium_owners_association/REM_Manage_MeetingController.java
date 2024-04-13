/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Manage_MeetingController implements Initializable {

    @FXML
    private TextField MeetDocumentName_TextField;
    @FXML
    private TextField MeetType_TextField;
    @FXML
    private TextField meetingTitle_TextField;
    @FXML
    private TextField meetingTime_TextField;
    @FXML
    private TableView<REM_Manage_Meet> meetingDocumentation_TV;
    @FXML
    private TableColumn<REM_Manage_Meet, String > meetDocumentationName_Tc;
    @FXML
    private TableColumn<REM_Manage_Meet, String > meetingType_Tc;
    @FXML
    private TableColumn<REM_Manage_Meet,  String> meetingTitle_Tc;
    @FXML
    private TableColumn<REM_Manage_Meet,String > meetingTime_Tc;
    @FXML
    private TextField TypePie_TextField;
    @FXML
    private TextField Typepercentage_TextField;
    @FXML
    private PieChart piechart;
    
    private ObservableList<REM_Manage_Meet> meetingList;
    private ObservableList<PieChart.Data> pieChartData;


    /**
     * Initializes the controller class.
     */
    private ObservableList <PieChart.Data> list = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        meetingList = FXCollections.observableArrayList();
        meetingDocumentation_TV.setItems(meetingList);

        meetDocumentationName_Tc.setCellValueFactory(new PropertyValueFactory<>("meetDocumentName"));
        meetingType_Tc.setCellValueFactory(new PropertyValueFactory<>("meetType"));
        meetingTitle_Tc.setCellValueFactory(new PropertyValueFactory<>("meetingTitle"));
        meetingTime_Tc.setCellValueFactory(new PropertyValueFactory<>("meetingTime"));
        
        pieChartData = FXCollections.observableArrayList();
        piechart.setData(pieChartData);
    }    

    @FXML
    private void backButtonOnClck(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("RuelsAndPolicyManagerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }


    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LogInUI.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @FXML
    private void viewDocumentPercentageOnButtonClick(ActionEvent event) {
        
   pieChartData.clear();
    
    
    String type = TypePie_TextField.getText();
    double percentage = Double.parseDouble(Typepercentage_TextField.getText());
    
   
    pieChartData.add(new PieChart.Data(type, percentage));
    }

    @FXML
    private void addNewTypeOnButtonClick(ActionEvent event) {
    String type = TypePie_TextField.getText();
    double percentage = Double.parseDouble(Typepercentage_TextField.getText());
    pieChartData.add(new PieChart.Data(type, percentage));
    }
    

    @FXML
    private void addDocumentaionOnButtonClick(ActionEvent event) {
    String meetDocumentName = MeetDocumentName_TextField.getText();
    String meetType = MeetType_TextField.getText();
    String meetingTitle = meetingTitle_TextField.getText();
    String meetingTime = meetingTime_TextField.getText();

    REM_Manage_Meet meeting = new REM_Manage_Meet(meetDocumentName, meetType, meetingTitle, meetingTime);
    
    
    writeMeetingToFile(meeting);
    
    
   
    }

    @FXML
    private void viewButtonOnClick(ActionEvent event) {
         meetingList.clear();
         readMeetingFromFile();
    }
    

    @FXML
    private void CancelOnButtonClick(ActionEvent event) {
    MeetDocumentName_TextField.clear();
    MeetType_TextField.clear();
    meetingTitle_TextField.clear();
    meetingTime_TextField.clear();
    }
      private void writeMeetingToFile(REM_Manage_Meet meeting) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("rem_MeetingDetailsRulesManager.txt", true))) {
        writer.write(meeting.getMeetDocumentName() + "," + meeting.getMeetType() + "," + meeting.getMeetingTitle() + "," + meeting.getMeetingTime() + "\n");
    } catch (IOException e) {
        e.printStackTrace();
    }
    
      }
    private void readMeetingFromFile() {
       try (BufferedReader reader = new BufferedReader(new FileReader("rem_MeetingDetailsRulesManager.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                String meetDocumentName = parts[0];
                String meetType = parts[1];
                String meetingTitle = parts[2];
                String meetingTime = parts[3];

                REM_Manage_Meet meeting = new REM_Manage_Meet(meetDocumentName, meetType, meetingTitle, meetingTime);
                meetingList.add(meeting);
                
                
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}

