/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
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
public class VisitorListUI_SCOController implements Initializable {

    @FXML
    private TableView<Visitor> Visitor_tv;
    @FXML
    private TableColumn<Visitor, String> visitorName_tc;
    @FXML
    private TableColumn<Visitor, String> visitingDate_tc;
    @FXML
    private TextField VisitorName_tf;
    @FXML
    private DatePicker visitorDate_dp;

    private final String FILE_PATH = "VisitorList.txt";

    private ObservableList<Visitor> visitorList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        visitorList = FXCollections.observableArrayList();
        Visitor_tv.setItems(visitorList);
        visitorName_tc.setCellValueFactory(new PropertyValueFactory<>("name"));
        visitingDate_tc.setCellValueFactory(new PropertyValueFactory<>("date"));
        loadVisitorListFromFile();
    }

    @FXML
    private void gOBackOnButtonClick(ActionEvent event) {
        // Handle "Go Back" button click
    }

    @FXML
    private void cancelOnButtonClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("VisitorListUI_SCO.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void removeVisitorOnButtonClick(ActionEvent event) {
        // Handle "View Visitor" button click
        loadVisitorListFromFile();
}

    @FXML
    private void viewVisitorOnButtonClick(ActionEvent event) {
    try {
        List<Visitor> visitors = Files.lines(Paths.get("VisitorList.txt"))
                .map(line -> {
                    String[] parts = line.split(",");
                    return new Visitor(parts[0], parts[1]);
                })
                .collect(Collectors.toList());

        ObservableList<Visitor> visitorList = FXCollections.observableArrayList(visitors);
        Visitor_tv.setItems(visitorList);

        System.out.println("Visitors loaded successfully");
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Error occurred while loading visitors");
    }

    // Set up cell value factory for date column
    visitingDate_tc.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVisitingDate()));
    }

    @FXML
    private void addVisitorOnButtonClick(ActionEvent event) {
    String visitorName = VisitorName_tf.getText();
    String visitingDate = visitorDate_dp.getValue().toString();

    if (visitorName.isEmpty() || visitingDate.isEmpty()) {
        System.out.println("Please fill in all fields");
        return;
    }

    Visitor visitor = new Visitor(visitorName, visitingDate);
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("VisitorList.txt", true))) {
        writer.write(visitor.getName() + "," + visitor.getVisitingDate() + "\n");
        System.out.println("Visitor added successfully");
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Error occurred while adding visitor");
    }
}

    private void saveVisitorListToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            outputStream.writeObject(new ArrayList<>(visitorList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadVisitorListFromFile() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            List<Visitor> list = (List<Visitor>) inputStream.readObject();
            visitorList.setAll(list);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
