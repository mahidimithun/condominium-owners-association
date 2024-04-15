/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea; 
import javafx.stage.Stage;

import modelPack.FMsentDueUtility;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FMsentDueUtilityController implements Initializable {

    @FXML
    private TextArea ta_typing;
    
     private static List<FMsentDueUtility> messageList = new ArrayList<>();
    
      private String filename = "dueUtilityBill.txt"; 


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sentOnClick(ActionEvent event) {
        
        String messageText = ta_typing.getText();

        FMsentDueUtility messageModel = new FMsentDueUtility(); // Use the modelClass
        messageModel.setTypeDueUtility(messageText);

        messageList.add(messageModel);

        ta_typing.clear();
        writeToFile(messageText);

    }
    
     public static List<FMsentDueUtility> getMessageList() {
        return messageList;
    }
     
      private void writeToFile(String message) {
       
       BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename, true));
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




    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader(getClass().getResource("FMDashboard.fxml")); 
        Parent parent = loader.load();

       Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene); 
        currentStage.show();

    }
    
}
