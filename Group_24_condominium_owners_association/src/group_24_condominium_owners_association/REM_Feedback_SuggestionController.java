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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class REM_Feedback_SuggestionController implements Initializable {

    @FXML
    private TextField FeedbackerName_TextField;
    @FXML
    private ComboBox<String> ResidentNumber_Combobox; 
    @FXML
    private TextField ResidentName_TextField;
    @FXML
    private TextField ContactInfo_TextField;
    @FXML
    private TextArea FeedbackandSuggestions_TextArea;
    @FXML
    private TableView<REM_Feedback_Suggest> Feedback_TableView;
    @FXML
    private TableColumn<REM_Feedback_Suggest, String> Feedbacker_TableColumn;
    @FXML
    private TableColumn<REM_Feedback_Suggest, String> ResidentName_TableColumn;
    @FXML
    private TableColumn<REM_Feedback_Suggest, String> ResindentNumberTable_Column;
    @FXML
    private TableColumn<REM_Feedback_Suggest, String> ContactInfo_TableColumn;
    @FXML
    private TableColumn<REM_Feedback_Suggest, String> FeedbacksandSuggestions_TableColumn;
    
     private ObservableList<REM_Feedback_Suggest> feedbackSuggestionList = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList<String> residentNumbers = FXCollections.observableArrayList("101", "102", "103","201","202","203","301","302","303");
         
        

        Feedbacker_TableColumn.setCellValueFactory(new PropertyValueFactory<>("feedbackerName"));
        ResidentName_TableColumn.setCellValueFactory(new PropertyValueFactory<>("residentName"));
        ResindentNumberTable_Column.setCellValueFactory(new PropertyValueFactory<>("residentNumber"));
        ContactInfo_TableColumn.setCellValueFactory(new PropertyValueFactory<>("contactInfo"));
        FeedbacksandSuggestions_TableColumn.setCellValueFactory(new PropertyValueFactory<>("feedbackandSuggestions"));
        
         ResidentNumber_Combobox.setItems(residentNumbers);
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("RuelsAndPolicyManagerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("LogInUI.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void AddSuggestionsButtonOnClick(ActionEvent event) {
        // Handle add suggestions button click
        String feedbackerName = FeedbackerName_TextField.getText();
        String residentName = ResidentName_TextField.getText();
        String residentNumber = ResidentNumber_Combobox.getValue(); 
        String contactInfo = ContactInfo_TextField.getText();
        String feedbackandSuggestions = FeedbackandSuggestions_TextArea.getText();

        REM_Feedback_Suggest feedback = new REM_Feedback_Suggest(feedbackerName, residentName, residentNumber, contactInfo, feedbackandSuggestions);
      
        writeFeedbackToFile(feedback);
        
       
    }

    @FXML
    private void viewSuggestionsButtonOnClick(ActionEvent event) {
        feedbackSuggestionList.clear();
        readFeedbackSuggestionsFromFile();
         Feedback_TableView.setItems(feedbackSuggestionList);
}

    @FXML
    private void CancelButtonOnClick(ActionEvent event) {
       
        FeedbackerName_TextField.clear();
        ResidentName_TextField.clear();
        ResidentNumber_Combobox.getSelectionModel().clearSelection();
        ContactInfo_TextField.clear();
        FeedbackandSuggestions_TextArea.clear();
    }
    private void readFeedbackSuggestionsFromFile() {
    
    feedbackSuggestionList.clear();

 
    try (BufferedReader reader = new BufferedReader(new FileReader("rem_FeedbackDetailsRulesManager.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 5) {
                String feedbackerName = parts[0];
                String residentNumber = parts[1];
                String residentName = parts[2];
                String contactInfo = parts[3];
                String feedback = parts[4];

                REM_Feedback_Suggest suggestion = new REM_Feedback_Suggest(feedbackerName, residentNumber, residentName, contactInfo, feedback);
                feedbackSuggestionList.add(suggestion);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
   
    private void writeFeedbackToFile(REM_Feedback_Suggest feedback) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rem_FeedbackDetailsRulesManager.txt", true))) {
            
            writer.write(feedback.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}