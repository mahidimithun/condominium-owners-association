/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedWriter;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import modelPack.MRbudget;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MrBudgetController implements Initializable {

    @FXML
    private TextField tf_amount;
    @FXML
    private ComboBox<String> cb_budgetType;
    @FXML
    private Label lbl_notifiy;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_budgetType.getItems().addAll("Maintenance", "Repair", "Utility");
    }

    @FXML
    private void BudgetInfoSentOnClick(ActionEvent event) {
        String budgetType = cb_budgetType.getValue();
        String budgetAmount = tf_amount.getText();

        if (budgetType == null || budgetType.isEmpty()) {
            lbl_notifiy.setText("You must select budget type.");
            return;
        }

        if (budgetAmount == null || budgetAmount.isEmpty()) {
            lbl_notifiy.setText("You must fill budget amount.");
            return;
        }

        MRbudget mrBudget = new MRbudget(budgetType, budgetAmount);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mrBudget.txt", true))) {
            writer.write(mrBudget.getBudgetType() + "," + mrBudget.getBudgetAmount());
            writer.newLine(); // Add a newline for each entry
            lbl_notifiy.setText(" Sent succesfully");
        } catch (IOException e) {
            e.printStackTrace();
            // Handle file writing exception here
        }

        // Clear input fields
        cb_budgetType.setValue(null);
        tf_amount.clear();

    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("MRcoordinator.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }

}
