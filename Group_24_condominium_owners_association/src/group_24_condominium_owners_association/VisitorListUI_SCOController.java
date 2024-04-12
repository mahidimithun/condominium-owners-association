/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class VisitorListUI_SCOController implements Initializable {
    @FXML
    private TableView<Visitor> Visitor_tv;
    @FXML
    private TableColumn<Visitor, String> visitorName_tc;
    @FXML
    private TableColumn<Visitor, LocalDate> visitingDate_tc;
    @FXML
    private TableColumn<Visitor, String> visitingTime_TC;
    @FXML
    private TableColumn<Visitor, String> visitorDesignation_TC;
    @FXML
    private TableColumn<Visitor, String> visitingUnitNumbers_TC;
    @FXML
    private TextField VisitorName_tf;
    @FXML
    private DatePicker visitorDate_dp;
    @FXML
    private TextField visitorTime_tf;
    @FXML
    private TextField visitorDesignation_tf;
    @FXML
    private TextField visitingUnitNumber_tf;

    private ObservableList<Visitor> visitorList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        visitorList = FXCollections.observableArrayList();

       
        visitorName_tc.setCellValueFactory(new PropertyValueFactory<>("name"));
        visitingDate_tc.setCellValueFactory(new PropertyValueFactory<>("visitingDate"));
        visitingTime_TC.setCellValueFactory(new PropertyValueFactory<>("visitingTime"));
        visitorDesignation_TC.setCellValueFactory(new PropertyValueFactory<>("designation"));
        visitingUnitNumbers_TC.setCellValueFactory(new PropertyValueFactory<>("unitNumbers"));

        
        Visitor_tv.setItems(visitorList);
    }

    @FXML
    private void gOBackOnButtonClick(ActionEvent event) {
      
    }

    @FXML
    private void cancelOnButtonClick(ActionEvent event) {
    VisitorName_tf.clear();
    visitorDate_dp.getEditor().clear();
    visitorTime_tf.clear();
    visitorDesignation_tf.clear();
    visitingUnitNumber_tf.clear();
    }

    @FXML
    private void viewVisitorOnButtonClick(ActionEvent event) {
        
       visitorList.clear();
       readVisitorsFromFile();
      
}
    

    @FXML
    private void addVisitorOnButtonClick(ActionEvent event) {
    String visitorName = VisitorName_tf.getText();
    LocalDate visitingDate = visitorDate_dp.getValue();
    String visitingTime = visitorTime_tf.getText();
    String visitorDesignation = visitorDesignation_tf.getText();
    String visitingUnitNumbers = visitingUnitNumber_tf.getText();

   
    Visitor visitor = new Visitor(visitorName, visitingDate, visitingTime, visitorDesignation, visitingUnitNumbers);

  
    writeVisitorToFile(visitor);

    
    
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        
    }

    private void writeVisitorToFile(Visitor visitor) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("VisitorDetails.txt", true))) {
        writer.write(visitor.getName() + "," +
                     visitor.getVisitingDate() + "," +
                     visitor.getVisitingTime() + "," +
                     visitor.getDesignation() + "," +
                     visitor.getUnitNumbers());
        writer.newLine();
    } catch (IOException e) {
        e.printStackTrace();
    }
}


private void readVisitorsFromFile() {
    visitorList.clear();
    try (BufferedReader reader = new BufferedReader(new FileReader("VisitorDetails.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 5) {
                String name = parts[0];
                LocalDate visitingDate = LocalDate.parse(parts[1]);
                String visitingTime = parts[2];
                String designation = parts[3];
                String unitNumbers = parts[4];

                Visitor visitor = new Visitor(name, visitingDate, visitingTime, designation, unitNumbers);
                visitorList.add(visitor);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
   
}
}