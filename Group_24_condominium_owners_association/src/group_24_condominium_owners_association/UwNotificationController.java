/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import modelPack.MRCmedicalFees;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class UwNotificationController implements Initializable {

    @FXML
    private Label lbl_showNotification;

    private String filename = "sentMedicalFee.txt";
    private String filename1 = "sentWarning.txt";
    private String filename2 = "dueUtilityBill.txt";

    private static MRCmedicalFees receivedMessage;

    public static void setReceivedMessage(MRCmedicalFees message) {
        receivedMessage = message;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("UnitOwnerDashboard.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }

    @FXML
    private void medicalFeeOnClick(ActionEvent event) {

        StringBuilder data = new StringBuilder();
        Scanner s = null;
        String line;
        
          try {

            s = new Scanner(new BufferedReader(new FileReader(filename)));

            while (s.hasNext()) {
                data.append(s.nextLine()).append("\n");
            }
            s.close();
            lbl_showNotification.setText(data.toString());
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @FXML
    private void warningOnClick(ActionEvent event) {
        
         StringBuilder data = new StringBuilder();
        Scanner s = null;
        String line;
        
          try {

            s = new Scanner(new BufferedReader(new FileReader(filename1)));

            while (s.hasNext()) {
                data.append(s.nextLine()).append("\n");
            }
            s.close();
            lbl_showNotification.setText(data.toString());
        } catch (IOException e) {
            e.printStackTrace();

        }
        
    }

    @FXML
    private void utilityOnClick(ActionEvent event) {
        
         StringBuilder data = new StringBuilder();
        Scanner s = null;
        String line;
        
          try {

            s = new Scanner(new BufferedReader(new FileReader(filename2)));

            while (s.hasNext()) {
                data.append(s.nextLine()).append("\n");
            }
            s.close();
            lbl_showNotification.setText(data.toString());
        } catch (IOException e) {
            e.printStackTrace();

        }
        
    }

}
