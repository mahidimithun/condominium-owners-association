/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedReader;
import java.io.FileReader;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import modelPack.LogInModel;

/**
 *
 * @author HP
 */
public class LogInUIController implements Initializable {

    @FXML
    private Label label;

    //@FXML
    @FXML
    private TextField tf_userId;
    @FXML
    private PasswordField pw_userPass;
    @FXML
    private ComboBox<String> cb_userType;

//    private static final String USERS_FILE = "C:\\Users\\HP\\Desktop\\users.txt";
    private static final String USERS_FILE = "users.txt";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_userType.getItems().addAll("UnitOwner", "MR", "MedicalResponseCoordinator", "FinancialManager","RuelsAndPolicyManager","SecurityControlOfficer","EventManager","CommercialOwner");
    }

    @FXML
    private void userRegistraionOnClick(ActionEvent event) {
    }

    @FXML
    private void logInOnClick(ActionEvent event) throws IOException {

        String userId = tf_userId.getText();
        String password = pw_userPass.getText();
        String userType = cb_userType.getValue();

        BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE));
        String line;
        boolean valid = false;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3 && parts[0].equals(userId) && parts[1].equals(password) && parts[2].equals(userType)) {
                valid = true;
                break;
            }
        }
        reader.close();

        if (valid) {

            if (userType.equals("UnitOwner")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("UnitOwnerDashboard.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            } else if (userType.equals("MR")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("MRcoordinator.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            } else if (userType.equals("MedicalResponseCoordinator")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("MRCDashboard.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            } else if (userType.equals("FinancialManager")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("FMDashboard.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            }
            
            else if (userType.equals("RuelsAndPolicyManager")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("RuelsAndPolicyManagerDashboard.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            }
            else if (userType.equals("SecurityControlOfficer")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("SecurityControlOfficerDashboard.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            }
            else if (userType.equals("EventManager")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("EventManagerDashboard.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            }
            else if (userType.equals("CommercialOwner")) {

                System.out.println("Login successful!");

                FXMLLoader loader = new FXMLLoader(getClass().getResource("CommercialOwnerDashboard.fxml"));
                Parent parent = loader.load();

                Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                Scene studentScene = new Scene(parent);

                currentStage.setScene(studentScene);
                currentStage.show();
            }
            
            

        } else {
            System.out.println("Invalid username or password!");
        }

    }

}
