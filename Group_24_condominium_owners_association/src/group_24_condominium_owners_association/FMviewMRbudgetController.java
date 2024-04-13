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
import modelPack.MRbudget;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FMviewMRbudgetController implements Initializable {

    @FXML
    private TableView<MRbudget> mrBudgetTable;
    @FXML
    private TableColumn<MRbudget, String> tc_amount;
    @FXML
    private TableColumn<MRbudget, String> tc_budgetType;
    
    ObservableList<MRbudget> mrBudgetList;

    private String filename = "mrBudget.txt";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tc_amount.setCellValueFactory(new PropertyValueFactory("budgetAmount"));
        tc_budgetType.setCellValueFactory(new PropertyValueFactory("budgetType"));

        mrBudgetList = mrBudgetTable.getItems();
    }    

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FMBudget.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }

    @FXML
    private void ViewBudgetOnClick(ActionEvent event) {
        StringBuilder data = new StringBuilder();
        Scanner s = null;
        try {

            s = new Scanner(new BufferedReader(new FileReader(filename)));
            mrBudgetList.clear();

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] parts = line.split(","); // Split the line by comma
                if (parts.length == 2) {
                    String budgetType = parts[0];
                    String budgetAmount = parts[1];
                  
                    
                    mrBudgetList.add(new MRbudget(budgetType, budgetAmount));
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
    private void clearOnClick(ActionEvent event) {
        try {
            File file = new File(filename);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(""); // Clears the contents of the file
            fileWriter.close();
            // Clear the contents of the table
            mrBudgetList.clear();
//            lbl_recieve.setText("File cleared successfully.");
        }
catch (IOException e) {
//            lbl_recieve.setText("Error while clearing file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
