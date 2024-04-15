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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_CCTV_Footage_RecordController implements Initializable {

    @FXML
    private TextArea commentRecord_TextArea;
    @FXML
    private TextField fileName_TextField;
    @FXML
    private TextField FootageTime_TextField;
    @FXML
    private DatePicker FileRecord_dp;
    @FXML
    private TextArea CCTV_Output_TextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void backButtonOnClick(ActionEvent event) {
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
    private void addfileDetailsButtonOnClick(ActionEvent event) {
         String fileName = fileName_TextField.getText();
        String footageTime = FootageTime_TextField.getText();
        String fileRecordDate = FileRecord_dp.getValue().toString();
        String comment = commentRecord_TextArea.getText();

        String fileDetails = fileName + "," + footageTime + "," + fileRecordDate + "," + comment + "\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("CCTVFootageRecord.txt", true))) {
            writer.write(fileDetails);
            System.out.println("CCTV footage record added successfully");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred while adding CCTV footage record");
        }
    }

    @FXML
    private void viewfileButtonOnClick(ActionEvent event) {
          StringBuilder content = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader("CCTVFootageRecord.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
        CCTV_Output_TextArea.setText(content.toString()); 
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Error occurred while reading CCTV footage records");
    }
    }
    
    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
 fileName_TextField.clear();
        FootageTime_TextField.clear();
        FileRecord_dp.getEditor().clear();
        commentRecord_TextArea.clear();
    }
    
}
