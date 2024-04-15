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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Meem
 */
public class CommunityInvestmentOpportunities_COController implements Initializable {

  
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField InvestedAmountTextField;
    @FXML
    private TextField ExpectedAreaTextField;
    @FXML
    private ComboBox<String> DurationComboBox;
    @FXML
    private TextArea CommunityInvestmentOpportunitiesOutputTextArea;
    @FXML
    private RadioButton CommunitymeetingsRadioButton;
    @FXML
    private RadioButton RegularchangesRadioButton;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        DurationComboBox.getItems().addAll("8.00am-10.00am", "11.00am-1.00pm", "2.00pm-4.00pm");
              
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


    
    @FXML
    private void SaveButtonOnAction(ActionEvent event) {
        String name = NameTextField.getText();
        String investedAmount = InvestedAmountTextField.getText();
        String expectedArea = ExpectedAreaTextField.getText();
        String duration = DurationComboBox.getValue().toString(); // Assuming the values are strings
        
       
        String output = "Name: " + name + "\n"
                      + "Invested Amount: " + investedAmount + "\n"
                      + "Expected Area: " + expectedArea + "\n"
                      + "Duration: " + duration + "\n";
        
        
        if (CommunitymeetingsRadioButton.isSelected()) {
            output += "Type: Community Meetings\n";
        } else if (RegularchangesRadioButton.isSelected()) {
            output += "Type: Regular Changes\n";
        }
        
      
        CommunityInvestmentOpportunitiesOutputTextArea.setText(output);
    }
    }
    

