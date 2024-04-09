/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class RuelsAndPolicyManagerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    private void associationDocumentationListOnButtonClick(ActionEvent event) {
       try {
            Parent root = FXMLLoader.load(getClass().getResource("REM_Documentation_List.fxml"));
           Scene someScene = new Scene(root);

          Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }  
        
    }

    @FXML
    private void AssociationPolicyOnButtonClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("REM_Association_Policy_Rules.fxml"));
           Scene someScene = new Scene(root);

          Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
        
    }

    @FXML
    private void FeedbackAndSuggestionOnButtonClick(ActionEvent event) {
          try {
           Parent root = FXMLLoader.load(getClass().getResource("REM_Feedback_Suggestion.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void NewPolicyAssociationOnButtonClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("REM_New_Policy.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    

    @FXML
    private void WarningLetterOnButtonClick(ActionEvent event) {
           try {
            Parent root = FXMLLoader.load(getClass().getResource("REM_Warning_Letter.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }

    }
    
    @FXML
    private void RulesBreakingButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("REM_Rules_Breaking.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }

    }
    
   @FXML
    private void OnlineDiscussionForumButtonOnClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("REM_Online_Discussion.fxml"));
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
    private void ManageMeetingButtonOnclick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("REM_Manage_Meeting.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
    }
     
   