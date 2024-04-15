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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class TrainingSessionGuard_SCOController implements Initializable {

    @FXML
    private TextField participateName_tf;
    @FXML
    private DatePicker trainingDate_dp;
    @FXML
    private TextArea TraingProgram_ta;
    @FXML
    private TextField TrainingTime_TF;
    @FXML
    private RadioButton TrainingAm_RB;
    @FXML
    private RadioButton TrainingPM_RB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackToHomeOnButtonClick(ActionEvent event) {
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
    private void addTrainingOnButtonClick(ActionEvent event) {
        String participantName = participateName_tf.getText();
        String trainingDate = trainingDate_dp.getValue().toString();
        String trainingTime = TrainingTime_TF.getText();
        String amPm = TrainingAm_RB.isSelected() ? "AM" : "PM";

        String trainingSession = participantName + "," + trainingDate + "," + trainingTime + " " + amPm + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("TrainingProgram.txt", true))) {
            writer.write(trainingSession);
            System.out.println("Training session added successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while adding training session");
        }
    }

    @FXML
    private void cancelOnButtonClick(ActionEvent event) {
        participateName_tf.clear();
        trainingDate_dp.getEditor().clear();
        TrainingTime_TF.clear();
        TrainingAm_RB.setSelected(false);
        TrainingPM_RB.setSelected(false);
    }


    @FXML
    private void viewTrainingOnButtonClick(ActionEvent event) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("TrainingProgram.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            TraingProgram_ta.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while reading training sessions");
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
    }
    

