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
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;


public class REM_Rules_BreakingController implements Initializable {

    @FXML
    private TextField PolicyName_TextField;
    @FXML
    private TextField violationName_TextField;
    @FXML
    private ComboBox<String> Rulesviolation_ComboBox;
    @FXML
    private TextField ViolatorName_TextField;
    @FXML
    private TableView<REM_Rules_Break> RulesBreaking_TableView;
    @FXML
    private TableColumn<REM_Rules_Break, String> PolicyName_TableColumn;
    @FXML
    private TableColumn<REM_Rules_Break, String> ViolationName_TableColumn;
    @FXML
    private TableColumn<REM_Rules_Break, String> rulesViolation_TableColumn;
    @FXML
    private TableColumn<REM_Rules_Break, String> ViolatorName_TableColumn;
    @FXML
    private DatePicker rulesBreaking_DatePicker;
    @FXML
    private TableColumn<REM_Rules_Break, LocalDate> rulesBreakingDate_DatePicker;

    private ObservableList<REM_Rules_Break> rulesBreakingList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rulesBreakingList = FXCollections.observableArrayList();

        PolicyName_TableColumn.setCellValueFactory(new PropertyValueFactory<>("policyName"));
        ViolationName_TableColumn.setCellValueFactory(new PropertyValueFactory<>("violationName"));
        rulesViolation_TableColumn.setCellValueFactory(new PropertyValueFactory<>("rulesViolation"));
        ViolatorName_TableColumn.setCellValueFactory(new PropertyValueFactory<>("violatorName"));
        rulesBreakingDate_DatePicker.setCellValueFactory(new PropertyValueFactory<>("rulesBreakingDate"));

        Rulesviolation_ComboBox.getItems().addAll("Type A", "Type B", "Type C");
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
    private void addRulesBreakButtonOnClick(ActionEvent event) {
    String policyName = PolicyName_TextField.getText();
    String violationName = violationName_TextField.getText();
    String rulesViolation = Rulesviolation_ComboBox.getValue();
    String violatorName = ViolatorName_TextField.getText();
    LocalDate rulesBreakingDate = rulesBreaking_DatePicker.getValue();

   
    REM_Rules_Break rulesBreak = new REM_Rules_Break(policyName, violationName, rulesViolation, violatorName, rulesBreakingDate);

    }

    @FXML
    private void viewDetailsButtonOnClick(ActionEvent event) {
     rulesBreakingList.clear();

      readRulesBreakFromFile();

    
     RulesBreaking_TableView.setItems(rulesBreakingList);
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
        
    }

    private void writeRulesBreakToFile(REM_Rules_Break rulesBreak) {
       try (BufferedWriter writer = new BufferedWriter(new FileWriter("RulesBreakDetails.txt", true))) {
        String policyName = rulesBreak.getPolicyName() != null ? rulesBreak.getPolicyName() : "";
        String violationName = rulesBreak.getViolationName() != null ? rulesBreak.getViolationName() : "";
        String rulesViolation = rulesBreak.getRulesViolation() != null ? rulesBreak.getRulesViolation() : "";
        String violatorName = rulesBreak.getViolatorName() != null ? rulesBreak.getViolatorName() : "";
        String rulesBreakingDate = rulesBreak.getRulesBreakingDate() != null ? rulesBreak.getRulesBreakingDate().toString() : "";

        writer.write(policyName + "," + violationName + "," + rulesViolation + "," +
                violatorName + "," + rulesBreakingDate + "\n");
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    private void readRulesBreakFromFile() {
        rulesBreakingList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("RulesBreakDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    REM_Rules_Break rulesBreak = new REM_Rules_Break(parts[0], parts[1], parts[2], parts[3], LocalDate.parse(parts[4]));
                    rulesBreakingList.add(rulesBreak);
                }
            }

            RulesBreaking_TableView.setItems(rulesBreakingList);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}