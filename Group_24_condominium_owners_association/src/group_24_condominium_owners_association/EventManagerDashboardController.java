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
 * @author Meem
 */
public class EventManagerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void EventTypeButtonOnClick(ActionEvent event) {
        
        
   
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EventType.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        
    

    

    @FXML
    private void EventDetailsButtonOnClick(ActionEvent event) {
    
 
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EventDetails.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void ContactInformationButtonOnClick(ActionEvent event) {
    
       try {
            Parent root = FXMLLoader.load(getClass().getResource("EM_ContactInfoFXML.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    @FXML
    private void FeedbackButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EM_Feedback&Reviews.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void PaymentButtonOnClick(ActionEvent event) {
    
 
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Payment_EM.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    @FXML
    private void AnnouncementsButtonOnClick(ActionEvent event) {
    
 
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Announcements_EM.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }

    @FXML
    private void EventRegistrationandTicketingButtonOnClick(ActionEvent event) {
    
        try {
            Parent root = FXMLLoader.load(getClass().getResource("EventRegistrationandTicketing_EM.fxml"));
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
    }
}
    
    

