/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelPack.UwMedicalServices;





/**
 * FXML Controller class
 *
 * @author User
 */
public class MRCemergencyTreatmentRequestController implements Initializable {

    @FXML
    private TableColumn<UwMedicalServices, String> MRCemergencyTreatReq_UnitOwnerId;
    @FXML
    private TableColumn<UwMedicalServices, String> MRCemergencyTreatReq_ProblemType;
    @FXML
    private TableView<UwMedicalServices> MRCemergencyTreatReq_tableView;
    
    ObservableList<UwMedicalServices>UwMedicalServicesList;
    private String filename = "medicalServices.txt";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MRCemergencyTreatReq_UnitOwnerId.setCellValueFactory(new PropertyValueFactory("unitOwnerId"));
        MRCemergencyTreatReq_ProblemType.setCellValueFactory(new PropertyValueFactory("problemType"));
       

        UwMedicalServicesList = MRCemergencyTreatReq_tableView.getItems();
    }    

    @FXML
    private void MRCemergencyTreatReqBackOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MRCDashboard.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
        
    }

    @FXML
    private void MRCemergencyTreatReqViewOnClick(ActionEvent event) {
        StringBuilder data = new StringBuilder();
        Scanner s = null;
        
         
        try {

            s = new Scanner(new BufferedReader(new FileReader(filename)));
            UwMedicalServicesList.clear();

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] parts = line.split(","); 
                if (parts.length == 2) {
                    String unitOwnerId = parts[0];
                    String problemType = parts[1];
                                     
                    UwMedicalServicesList.add(new UwMedicalServices( problemType, unitOwnerId));
                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (s != null) {
                s.close();
            }

        }
        
    }

    @FXML
    private void MRCemergencyTreatReqClearOnClick(ActionEvent event) {
        try {
            File file = new File(filename);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(""); 
            fileWriter.close();
            UwMedicalServicesList.clear();

        } catch (IOException e) {

            e.printStackTrace();
        }
        
    }
    
}
