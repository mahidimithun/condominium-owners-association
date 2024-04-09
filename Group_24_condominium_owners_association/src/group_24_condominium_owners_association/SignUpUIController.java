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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SignUpUIController implements Initializable {

    @FXML
    private TextField newUsername_TextField;
    @FXML
    private PasswordField newPassword_PasswordField;
    @FXML
    private ComboBox<String> signUP_Cb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        signUP_Cb.getItems().addAll("UnitOwner","MR","FinancialManager","MedicalResponseCoordinator","RuelsAndPolicyManager","SecurityControlOfficer","EventManager","CommercialOwner");
    }    

    @FXML
    private void signUpButtonOnClick(ActionEvent event) {
        String username = newUsername_TextField.getText();
        String password = newPassword_PasswordField.getText();
        String userType = signUP_Cb.getValue().toString(); // Assuming ComboBox is populated with String items

        if (username.isEmpty() || password.isEmpty() || userType.isEmpty()) {
            // Display an error message if any field is empty
            System.out.println("Please fill in all fields");
            return;
        }

        try {
            // Check if the user already exists
            if (userExists(username)) {
                System.out.println("Username already exists");
            } else {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
                writer.write(username + "," + password + "," + userType + "\n");
                    System.out.println("Registration successful");
}

                System.out.println("Registration successful");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error occurred");
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
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
    private boolean userExists(String username) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 1 && parts[0].equals(username)) {
                    return true; // User found
                }
            }
        }
        return false; // User not found
    } 
}
