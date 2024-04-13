/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class REM_Association_Policy_RulesController implements Initializable {

    @FXML
    private TextArea newRules_TextArea;
    @FXML
    private TextArea newPolicy_TextArea;
    @FXML
    private TextField PolicyAddtime_TextField;
    @FXML
    private DatePicker policyAddDate_Datepicker;
    @FXML
    private TableView<REM_Association_Policy_Rules> policyAndRules_TableView;
    @FXML
    private TableColumn<REM_Association_Policy_Rules, String> newPolicy_TableColumn;
    @FXML
    private TableColumn<REM_Association_Policy_Rules, String> newRules_TableColumn;
    @FXML
    private TableColumn<REM_Association_Policy_Rules, String> policyAddtime_TableColumn;
    @FXML
    private TableColumn<REM_Association_Policy_Rules, LocalDate> policyAddDate_TableColumn;

    private ObservableList<REM_Association_Policy_Rules> policyAndRulesList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         policyAndRulesList = FXCollections.observableArrayList();
          policyAndRules_TableView.setItems(policyAndRulesList);

        newPolicy_TableColumn.setCellValueFactory(new PropertyValueFactory<>("newPolicy"));
        newRules_TableColumn.setCellValueFactory(new PropertyValueFactory<>("newRules"));
        policyAddtime_TableColumn.setCellValueFactory(new PropertyValueFactory<>("policyAddTime"));
        policyAddDate_TableColumn.setCellValueFactory(new PropertyValueFactory<>("policyAddDate"));
    }
    
    @FXML
    private void BackbuttonOnClick(ActionEvent event) {
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
    private void LogOutButtonOnClick(ActionEvent event) {
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
private void addDetailsOnButtonClick(ActionEvent event) {
    String newPolicy = newPolicy_TextArea.getText();
    String newRules = newRules_TextArea.getText();
    String policyAddTime = PolicyAddtime_TextField.getText();
    LocalDate policyAddDate = policyAddDate_Datepicker.getValue();

    REM_Association_Policy_Rules policyRules = new REM_Association_Policy_Rules(newPolicy, newRules, policyAddDate, policyAddTime);
    writePolicyRulesToFile(policyRules);
}

@FXML
private void viewDetailsOnButtonClick(ActionEvent event) {
    policyAndRulesList.clear();
    readPolicyRulesFromFile();
    policyAndRules_TableView.setItems(policyAndRulesList);
}

@FXML
private void cancelButtonOnClick(ActionEvent event) {
     newPolicy_TextArea.clear();
    newRules_TextArea.clear();
    PolicyAddtime_TextField.clear();
    policyAddDate_Datepicker.setValue(null);
    
}

private void writePolicyRulesToFile(REM_Association_Policy_Rules policyRules) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("rem_PolicyRulesDetails.txt", true))) {
        String newPolicy = policyRules.getNewPolicy() != null ? policyRules.getNewPolicy() : "";
        String newRules = policyRules.getNewRules() != null ? policyRules.getNewRules() : "";
        String policyAddTime = policyRules.getPolicyAddTime() != null ? policyRules.getPolicyAddTime() : "";
        String policyAddDate = policyRules.getPolicyAddDate() != null ? policyRules.getPolicyAddDate().toString() : "";

        writer.write(newPolicy + "," + newRules + "," + policyAddTime + "," + policyAddDate + "\n");
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private void readPolicyRulesFromFile() {
    policyAndRulesList.clear();
    try (BufferedReader reader = new BufferedReader(new FileReader("rem_PolicyRulesDetails.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                String newPolicy = parts[0];
                String newRules = parts[1];
                String policyAddTime = parts[2];
                LocalDate policyAddDate = LocalDate.parse(parts[3]);

                REM_Association_Policy_Rules policyRules = new REM_Association_Policy_Rules(newPolicy, newRules, policyAddDate, policyAddTime);
                policyAndRulesList.add(policyRules);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
}

    