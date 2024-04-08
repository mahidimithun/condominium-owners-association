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
import java.time.LocalDate;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import modelPack.MRrepairOrder;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MRcoordinatorController implements Initializable {

    @FXML
    private TableView<MRrepairOrder> repairTable;
    @FXML
    private TableColumn<MRrepairOrder, String> tc_repairUnitOwnerId;
    @FXML
    private TableColumn<MRrepairOrder, String> tc_repairProduct;
    @FXML
    private TableColumn<MRrepairOrder, LocalDate> tc_repairDate;
    @FXML
    private TableView<?> maintenanceTable;
    @FXML
    private TableColumn<?, ?> tc_maintenance;
    @FXML
    private ComboBox<?> cb_equipmentList;
    @FXML
    private TableView<?> equipmentTable;
    @FXML
    private TableColumn<?, ?> tc_equipmentId;
    @FXML
    private TableColumn<?, ?> tc_equipmentName;
    @FXML
    private TextField tf_equipmentId;

    ObservableList<MRrepairOrder> repairList;
    private String filename = "repairOrder.txt";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tc_repairUnitOwnerId.setCellValueFactory(new PropertyValueFactory("yourId"));
        tc_repairProduct.setCellValueFactory(new PropertyValueFactory("repairType"));
        tc_repairDate.setCellValueFactory(new PropertyValueFactory("date"));

        repairList = repairTable.getItems();
    }

    @FXML
    private void cleanerAndCareTakerOnClick(ActionEvent event) {
    }

    @FXML
    private void technicianOnClick(ActionEvent event) {
    }

    @FXML
    private void budgetOnClick(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MrBudget.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }

    @FXML
    private void makePaymentOnClick(ActionEvent event) {
    }

    @FXML
    private void maintenanceDashboradBack(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LogInUI.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }

    @FXML
    private void veiwReapirOrderOnClick(ActionEvent event) {
        StringBuilder data = new StringBuilder();
        Scanner s = null;
        
         
        try {

            s = new Scanner(new BufferedReader(new FileReader(filename)));
            repairList.clear();

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] parts = line.split(","); 
                if (parts.length == 3) {
                    String yourId = parts[0];
                    String repairType = parts[1];
                    String dateString = parts[2];
                    LocalDate date = LocalDate.parse(dateString);
                    repairList.add(new MRrepairOrder(yourId, repairType, date));
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
    private void removeRepairListOnClick(ActionEvent event) {
        
        try {
            File file = new File(filename);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(""); 
            fileWriter.close();
            repairList.clear();
//            lbl_recieve.setText("File cleared successfully.");
        } catch (IOException e) {
//            lbl_recieve.setText("Error while clearing file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
