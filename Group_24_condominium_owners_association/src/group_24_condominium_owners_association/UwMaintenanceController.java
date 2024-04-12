/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import modelPack.MRmaintenanceOrder;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class UwMaintenanceController implements Initializable {

    @FXML
    private ComboBox<String> cb_maintenanceType;
    @FXML
    private TextField tf_yourId;
    @FXML
    private DatePicker maintenanceDate;
    @FXML
    private Label lbl_error;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_maintenanceType.getItems().addAll("Electricity", "Water", "Gas", "Internet");
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UwExtraServices.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }

    @FXML
    private void confrimOnClick(ActionEvent event) {

        String selectedMaintenanceType = cb_maintenanceType.getValue();
        String enteredYourId = tf_yourId.getText();
        LocalDate selectedDate = maintenanceDate.getValue();

        if (selectedMaintenanceType == null || selectedMaintenanceType.isEmpty()) {
            lbl_error.setText("You must select Type");
            return;
        }

        if (enteredYourId == null || enteredYourId.isEmpty()) {
            lbl_error.setText("User ID can not be empty");
            return;
        }

        if (selectedDate == null) {
            lbl_error.setText("Date can not be empty");
            return;
        }

        //past date check
        if (selectedDate.isBefore(LocalDate.now())) {

            lbl_error.setText(" Date Can not be past");
            return;
        }

        MRmaintenanceOrder order = new MRmaintenanceOrder(selectedMaintenanceType, enteredYourId, selectedDate);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("maintenanceOrder.txt", true))) {
            writer.write(order.getMaintenanceType() + "," + order.getYourId() + "," + order.getDate());
            writer.newLine(); // Add a newline for each entry
            lbl_error.setText(" Add succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        cb_maintenanceType.setValue(null);
        tf_yourId.clear();
        maintenanceDate.setValue(null);

    }

}
