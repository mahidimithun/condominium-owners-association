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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class REM_New_PolicyController implements Initializable {

    @FXML
    private TextArea policyDescription_TextArea;
    @FXML
    private TextArea complainManagemnet_TextArea;
    @FXML
    private DatePicker Policy_Dp;
    @FXML
    private TextField newPolicy_TextField;
    @FXML
    private ComboBox<String> policyType_Combobox;
    
    
    
    

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
    private void logoutButtonOnClick(ActionEvent event) {
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
    private void addPolicyButtonOnClick(ActionEvent event) {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("policy_data.txt", true))) {
            writer.write("New Policy: " + newPolicy_TextField.getText() + "\n");
            writer.write("Policy Description: " + policyDescription_TextArea.getText() + "\n");
            writer.write("Complaint Management: " + complainManagemnet_TextArea.getText() + "\n");
            writer.write("Policy Date: " + Policy_Dp.getValue() + "\n");
            writer.write("Policy Type: " + policyType_Combobox.getValue() + "\n");
            writer.write("\n"); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void viewButtonOnClick(ActionEvent event) {
         try (BufferedReader reader = new BufferedReader(new FileReader("policy_data.txt"))) {
            StringBuilder data = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
            policyDescription_TextArea.setText(data.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    policyDescription_TextArea.clear();
    complainManagemnet_TextArea.clear();
    Policy_Dp.getEditor().clear();
    newPolicy_TextField.clear();
    policyType_Combobox.getSelectionModel().clearSelection();
    }

    @FXML
    private void sentButtonOnClick(ActionEvent event) {
         
    }
     private void writeToFile(String message) {
       
       BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("sentFeedback_REM.txt", true));
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                
            }
        }
     }
}
     
    
    
   

    