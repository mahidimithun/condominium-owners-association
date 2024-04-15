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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_Warning_LetterController implements Initializable {

    @FXML
    private TextField unitNumber_TextField;
    @FXML
    private TextField warningFor_TextField;
    @FXML
    private TextArea warningMessage_TextArea;
    @FXML
    private TextField name_TextField;
    @FXML
    private TextArea output_TextArea;

    /**
     * Initializes the controller class.
     */
     

     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
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
    private void sentButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
        
        unitNumber_TextField.clear();
        warningFor_TextField.clear();
        warningMessage_TextArea.clear();
        name_TextField.clear();
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) throws IOException {
    String unitNumber = unitNumber_TextField.getText();
        String warningFor = warningFor_TextField.getText();
        String name = name_TextField.getText();
        String warningMessage = warningMessage_TextArea.getText();
        
        String data = "Unit Number: " + unitNumber + "\n" +
                      "Warning For: " + warningFor + "\n" +
                      "Name: " + name + "\n" +
                      "Warning Message: " + warningMessage + "\n";
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("REM_Warning_Letter.txt", true));
        writer.write(data);
        writer.newLine();
        writer.close();
        
    }
    
    

    @FXML
    private void viewButtonOnClick(ActionEvent event) {
         try {
         output_TextArea.clear();
        BufferedReader reader = new BufferedReader(new FileReader("REM_Warning_Letter.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            output_TextArea.appendText(line + "\n");
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }
}

   