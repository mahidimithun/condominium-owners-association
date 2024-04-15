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
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class WorkScheduleListUI_SCOController implements Initializable {

   @FXML
    private TextField scheduleName_tf;
    @FXML
    private DatePicker scheduleDate_dp;
    @FXML
    private TableView<WorkScheduleList_SCO> scheduleTable_tv;
    @FXML
    private TableColumn<WorkScheduleList_SCO, String> scheduleName_tc;
    @FXML
    private TableColumn<WorkScheduleList_SCO, LocalDate> schduleDate_tc;
    @FXML
    private TableColumn<WorkScheduleList_SCO, String> workType_tc;
    @FXML
    private TableColumn<WorkScheduleList_SCO, String> shiftStartTime_tc;
    @FXML
    private TableColumn<WorkScheduleList_SCO, String> shiftEndTime_tc;
    @FXML
    private TableColumn<WorkScheduleList_SCO, String> location_TableColumn;
    @FXML
    private ComboBox<String> workTypeCombobox;
    @FXML
    private TextField shiftStartTime_TextField;
    @FXML
    private TextField shiftEndTime_TextField;
    @FXML
    private TextField location_TextField;

    private ObservableList<WorkScheduleList_SCO> scheduleList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        scheduleList = FXCollections.observableArrayList();

        scheduleName_tc.setCellValueFactory(new PropertyValueFactory<>("scheduleName"));
        schduleDate_tc.setCellValueFactory(new PropertyValueFactory<>("scheduleDate"));
        workType_tc.setCellValueFactory(new PropertyValueFactory<>("workType"));
        shiftStartTime_tc.setCellValueFactory(new PropertyValueFactory<>("shiftStartTime"));
        shiftEndTime_tc.setCellValueFactory(new PropertyValueFactory<>("shiftEndTime"));
        location_TableColumn.setCellValueFactory(new PropertyValueFactory<>("location"));

        scheduleTable_tv.setItems(scheduleList);
        workTypeCombobox.getItems().addAll("Monitoring", "Responding to Emergencies:", "Risk Assessment:");
    }
       

    @FXML
    private void goBackToHomePageOnButtonClick(ActionEvent event) {
          try {
            Parent root = FXMLLoader.load(getClass().getResource("SecurityControlOfficerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }


    @FXML
    private void addNewScheduleOnButtonClick(ActionEvent event) {
        String scheduleName = scheduleName_tf.getText();
        LocalDate scheduleDate = scheduleDate_dp.getValue();
        String workType = workTypeCombobox.getValue().toString();
        String shiftStartTime = shiftStartTime_TextField.getText();
        String shiftEndTime = shiftEndTime_TextField.getText();
        String location = location_TextField.getText();

       
        writeScheduleDetailsToFile(new WorkScheduleList_SCO(scheduleName, scheduleDate, workType, shiftStartTime, shiftEndTime, location));

        
    }


    @FXML
    private void viewScheduleOnButtonClick(ActionEvent event) {
    scheduleList.clear(); 
    readScheduleDetailsFromFile(); 
    scheduleTable_tv.setItems(scheduleList); 
    }
     private void writeScheduleDetailsToFile(WorkScheduleList_SCO schedule) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Guard_WorkScheduleDetails.txt", true))) {
            writer.write(schedule.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    private void readScheduleDetailsFromFile() {
        scheduleList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Guard_WorkScheduleDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    LocalDate scheduleDate = LocalDate.parse(parts[1]);
                    WorkScheduleList_SCO schedule = new WorkScheduleList_SCO(parts[0], scheduleDate, parts[2], parts[3], parts[4], parts[5]);
                    scheduleList.add(schedule);
                }
            }
        } catch (IOException e) {
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
    private void cancelButtonOnClick(ActionEvent event) {
    scheduleName_tf.clear();
    scheduleDate_dp.getEditor().clear();
    workTypeCombobox.getSelectionModel().clearSelection();
    shiftStartTime_TextField.clear();
    shiftEndTime_TextField.clear();
    location_TextField.clear();
    }
    
}
