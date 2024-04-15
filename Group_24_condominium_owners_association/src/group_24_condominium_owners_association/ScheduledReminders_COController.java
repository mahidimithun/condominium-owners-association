
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ScheduledReminders_COController implements Initializable {

    @FXML
    private TextField TimeTF;
    @FXML
    private TableView<ScheduledReminders> ReminderListTV;
    @FXML
    private TableColumn<ScheduledReminders, String> ReminderTitleTC;
    @FXML
    private TableColumn<ScheduledReminders, String> DateTC;
    @FXML
    private TableColumn<ScheduledReminders, String> TimeTC;
    @FXML
    private TextField ReminderTitleTF;
    @FXML
    private DatePicker Date_DP;
    @FXML
    private TableColumn<ScheduledReminders, String> Schedule_TypeTC;
    @FXML
    private TextField ScheduleTypeTF;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ReminderTitleTC.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
        DateTC.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        TimeTC.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
        Schedule_TypeTC.setCellValueFactory(cellData -> cellData.getValue().scheduleTypeProperty());
    }    

    @FXML
    private void AddReminderButtonOnAction(ActionEvent event) {
        String title = ReminderTitleTF.getText();
        String date = Date_DP.getValue().toString(); 
        String time = TimeTF.getText();
        String scheduleType = ScheduleTypeTF.getText();
        
        
        ScheduledReminders newReminder = new   ScheduledReminders(title, date, time, scheduleType);
        

        ReminderListTV.getItems().add(newReminder);
    }
        
    
    @FXML
    private void LogoutButtonOnAction(ActionEvent event) {
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

    
}
