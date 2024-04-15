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
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EventManager_ReviewsandFeedbackController implements Initializable {

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField EmailTextField;

    @FXML
    private ComboBox<String> EventsComboBox;

    @FXML
    private TextArea CommentTextArea;

    @FXML
    private CheckBox RatingOneCB;

    @FXML
    private CheckBox RatingTwoCB;

    @FXML
    private CheckBox RatingThreeCB;

    @FXML
    private CheckBox RatingFourCB;

    @FXML
    private CheckBox RatingFiveCB;

    @FXML
    private TextArea EventManager_ReviewsandFeedbackTextArea;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        EventsComboBox.getItems().addAll("BBQ", "Fitness and Wellness Activities", "Community Meetings","Holiday Celebrations","Game Nights","Educational workshops/seminars");

        
        EventManager_ReviewsandFeedbackTextArea.setText("Leave your feedback here...");
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("EventManagerDashboard.fxml"));
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

    @FXML
    private void SubmitButtonOnClick(ActionEvent event) {
         String name = NameTextField.getText();
    String email = EmailTextField.getText();
    String selectedEvent = EventsComboBox.getValue(); 
    String comment = CommentTextArea.getText();

    
    StringBuilder feedbackMessage = new StringBuilder();
    feedbackMessage.append("Name: ").append(name).append("\n");
    feedbackMessage.append("Email: ").append(email).append("\n");
    feedbackMessage.append("Event: ").append(selectedEvent).append("\n"); 
    feedbackMessage.append("Comment: ").append(comment).append("\n");
    feedbackMessage.append("Ratings: ");
    feedbackMessage.append(RatingOneCB.isSelected() ? "1 " : "");
    feedbackMessage.append(RatingTwoCB.isSelected() ? "2 " : "");
    feedbackMessage.append(RatingThreeCB.isSelected() ? "3 " : "");
    feedbackMessage.append(RatingFourCB.isSelected() ? "4 " : "");
    feedbackMessage.append(RatingFiveCB.isSelected() ? "5 " : "");

    
    EventManager_ReviewsandFeedbackTextArea.setText(feedbackMessage.toString());
    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
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

    
}
