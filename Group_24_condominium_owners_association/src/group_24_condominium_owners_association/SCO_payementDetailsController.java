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

public class SCO_payementDetailsController implements Initializable {

    @FXML
    private RadioButton paid_rb;
    @FXML
    private RadioButton unpaid_rb;
    @FXML
    private TextField guardName_TextField;
    @FXML
    private ComboBox<String> guardDesignation_Combobox;
    @FXML
    private TextField paymentAmount_TextField;
    @FXML
    private DatePicker payment_dp;
    @FXML
    private ComboBox<String> paymentApproval_Combobox;
    @FXML
    private TableView<SCO_Payement> paymentDetails_TV;
    @FXML
    private TableColumn<SCO_Payement, String> guardName_TC;
    @FXML
    private TableColumn<SCO_Payement, String> guardDesignation_TC;
    @FXML
    private TableColumn<SCO_Payement, String> paymentStatus_TC;
    @FXML
    private TableColumn<SCO_Payement, Double> paymentAmount_TC;
    @FXML
    private TableColumn<SCO_Payement, String> paymentDate_TC;
    @FXML
    private TableColumn<SCO_Payement, String> payemntApproval_TC;
    
    private ObservableList<SCO_Payement> payementList;
   

    @Override
   
    public void initialize(URL url, ResourceBundle rb) {
    payementList = FXCollections.observableArrayList();
    
    guardName_TC.setCellValueFactory(new PropertyValueFactory<>("guardName"));
    guardDesignation_TC.setCellValueFactory(new PropertyValueFactory<>("guardDesignation"));
    paymentStatus_TC.setCellValueFactory(new PropertyValueFactory<>("paymentStatus"));
    paymentAmount_TC.setCellValueFactory(new PropertyValueFactory<>("paymentAmount"));
    paymentDate_TC.setCellValueFactory(new PropertyValueFactory<>("paymentDate"));
    payemntApproval_TC.setCellValueFactory(new PropertyValueFactory<>("paymentApproval"));
    guardDesignation_Combobox.getItems().addAll("Senior Guard ", " Junior Guard ", "Emergency Guard ");
    paymentApproval_Combobox.getItems().addAll("Approved", "Pending", "Rejected");
        
      
        readPaymentDetailsFromFile();
        
       
        paymentDetails_TV.setItems(payementList);
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
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
    private void logOutOnButtonClick(ActionEvent event) {
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
    private void addDetailsOnButtonClick(ActionEvent event) {
       
    String guardName = guardName_TextField.getText();
    String guardDesignation = guardDesignation_Combobox.getValue();
    String paymentStatus = paid_rb.isSelected() ? "Paid" : "Unpaid";
    double paymentAmount = Double.parseDouble(paymentAmount_TextField.getText());
    String paymentDate = payment_dp.getValue().toString();
    String paymentApproval = paymentApproval_Combobox.getValue();

    writePaymentDetailsToFile(new SCO_Payement(guardName, guardDesignation, paymentStatus, paymentAmount, paymentDate, paymentApproval));

   
    }

    @FXML
    private void viewDetailsOnButtonClick(ActionEvent event) {
          payementList.clear();
          readPaymentDetailsFromFile();
          paymentDetails_TV.setItems(payementList);
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
    guardName_TextField.clear();
    guardDesignation_Combobox.getSelectionModel().clearSelection();
    paymentAmount_TextField.clear();
    payment_dp.getEditor().clear();
    paymentApproval_Combobox.getSelectionModel().clearSelection();

  
}
    

    private void writePaymentDetailsToFile(SCO_Payement payment) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Guard_payment_details.txt", true))) {
            writer.write(payment.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readPaymentDetailsFromFile() {
        payementList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("Guard_payment_details.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    SCO_Payement payment = new SCO_Payement(parts[0], parts[1], parts[2], Double.parseDouble(parts[3]), parts[4], parts[5]);
                    payementList.add(payment);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
