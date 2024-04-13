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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import modelPack.UwMedicalServices;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class UwMedicalServicesController implements Initializable {

    @FXML
    private TextField tf_unitOwnerId;
    @FXML
    private ComboBox<String> cb_problemType;
    @FXML
    private Label lbl_error;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_problemType.getItems().addAll("Fever", "Headache", "Diarrhea");
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
    private void sentOnClick(ActionEvent event) {

        String problemType = cb_problemType.getValue();
        String unitOwnerId = tf_unitOwnerId.getText();

        if (problemType == null || problemType.isEmpty()) {
            lbl_error.setText("You must select Type");
            return;
        }

        if (unitOwnerId == null || unitOwnerId.isEmpty()) {
            lbl_error.setText("User ID can not be empty");
            return;
        }

        UwMedicalServices medicalRequest = new UwMedicalServices(problemType, unitOwnerId);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("medicalServices.txt", true))) {
            writer.write(medicalRequest.getUnitOwnerId() + "," + medicalRequest.getProblemType());
            writer.newLine();
            lbl_error.setText("Request sent succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
