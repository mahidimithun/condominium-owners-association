/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package group_24_condominium_owners_association;

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
    private ComboBox<?> cb_userType;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void userRegistraionOnClick(ActionEvent event) {
    }

    @FXML
    private void logInOnClick(ActionEvent event) throws IOException{
//        Not parmanet it's for only Demonstration
    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UnitOwnerDashboard.fxml")); 
        Parent parent = loader.load();

       Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene); 
        currentStage.show();
        
//       Alret Its not parment 
        
        
    }
    
}
