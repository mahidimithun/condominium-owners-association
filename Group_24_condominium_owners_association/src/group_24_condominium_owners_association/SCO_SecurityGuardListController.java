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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class SCO_SecurityGuardListController implements Initializable {

    @FXML
    private TextField securityGuardName_tf;
    @FXML
    private DatePicker guardJoiningDate_dp;
    @FXML
    private TableView<SecurityGuard> Security_tv;
    @FXML
    private TableColumn<SecurityGuard, String> guardName_tc;
    @FXML
    private TableColumn<SecurityGuard, String> guardID_tc;
    @FXML
    private TableColumn<SecurityGuard, String> guardType_tc;
    @FXML
    private TableColumn<SecurityGuard, LocalDate> guardJoiningDate_tc;
    @FXML
    private TableColumn<SecurityGuard, String> dutyTime_tc;
    @FXML
    private TextField securityGuardID_tf;
    @FXML
    private ComboBox<String> securityGuardType_cb;
    @FXML
    private TextField dutytime_tf;
    @FXML
    private RadioButton AM_rb;
    @FXML
    private RadioButton PM_rb;

    private ObservableList<SecurityGuard> guardList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        guardList = FXCollections.observableArrayList();
        
    guardName_tc.setCellValueFactory(new PropertyValueFactory<>("name"));
    guardID_tc.setCellValueFactory(new PropertyValueFactory<>("id"));
    guardType_tc.setCellValueFactory(new PropertyValueFactory<>("type"));
    guardJoiningDate_tc.setCellValueFactory(new PropertyValueFactory<>("joiningDate"));
    dutyTime_tc.setCellValueFactory(new PropertyValueFactory<>("dutyTime"));
    
 
    securityGuardType_cb.getItems().addAll("Senior guard", "Junior guard", "Emergency guard");
    }    

    @FXML
    private void goBackButtonOnClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("SecurityControlOfficerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           someStage.setScene(someScene);
           someStage.show();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    @FXML
    private void viewOnButtonClick(ActionEvent event) {
         readGuardDetailsFromFile();
    }

    @FXML
    private void CancelSecurityOnButtonClick(ActionEvent event) {
        
    securityGuardName_tf.clear();
    securityGuardID_tf.clear();
    securityGuardType_cb.getSelectionModel().clearSelection();
    guardJoiningDate_dp.setValue(null);
    dutytime_tf.clear();
    AM_rb.setSelected(false);
    PM_rb.setSelected(false);
    
    
    guardList.clear();
    }

    @FXML
    private void addGuardDetailsOnButtonClick(ActionEvent event) {
        String name = securityGuardName_tf.getText();
        String id = securityGuardID_tf.getText();
        String type = securityGuardType_cb.getValue();
        LocalDate joiningDate = guardJoiningDate_dp.getValue();
        String dutyTime = dutytime_tf.getText();

        SecurityGuard guard = new SecurityGuard(name, id, type, joiningDate, dutyTime);
        guardList.add(guard);

        writeGuardDetailsToFile(guard);
    }
        private void writeGuardDetailsToFile(SecurityGuard guard) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SecurityGuardDetails.txt", true))) {
            writer.write(guard.getName() + "," + guard.getId() + "," + guard.getType() + "," +
                         guard.getJoiningDate().toString() + "," + guard.getDutyTime() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

private void readGuardDetailsFromFile() {
    guardList.clear();
    try (BufferedReader reader = new BufferedReader(new FileReader("SecurityGuardDetails.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 5) {
                SecurityGuard guard = new SecurityGuard(parts[0], parts[1], parts[2],
                        LocalDate.parse(parts[3]), parts[4]);
                guardList.add(guard);
            }
        }
        
        
        Security_tv.setItems(guardList);
    } catch (IOException e) {
        e.printStackTrace();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
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
}