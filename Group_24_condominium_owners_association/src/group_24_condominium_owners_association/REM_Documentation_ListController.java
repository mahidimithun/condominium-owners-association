/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class REM_Documentation_ListController implements Initializable {

    @FXML
    private TableView<REM_Documentation> Document_TableView;
    @FXML
    private TableColumn<REM_Documentation, String> DocumentName_TableColumn;
    @FXML
    private TableColumn<REM_Documentation, LocalDate> documentDate_TableColumn;
    @FXML
    private TableColumn<REM_Documentation, String> documentTopic_TableColumn;
    @FXML
    private TableColumn<REM_Documentation, String> file_TableColumn;
    @FXML
    private TextField documentName_TextField;
    @FXML
    private DatePicker document_dp;
    @FXML
    private TextField documentTopic_TextField;
    @FXML
    private ComboBox<String> fileType_Combobox;

    private ObservableList<REM_Documentation> documentList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fileType_Combobox.setItems(FXCollections.observableArrayList("PDF", "Word", "Excel"));
        documentList = FXCollections.observableArrayList();
        Document_TableView.setItems(documentList);

        DocumentName_TableColumn.setCellValueFactory(new PropertyValueFactory<>("documentName"));
        documentDate_TableColumn.setCellValueFactory(new PropertyValueFactory<>("documentDate"));
        documentTopic_TableColumn.setCellValueFactory(new PropertyValueFactory<>("documentTopic"));
        file_TableColumn.setCellValueFactory(new PropertyValueFactory<>("fileType"));
    }

    @FXML
    private void addDocumentButtonOnClick(ActionEvent event) {
        String documentName = documentName_TextField.getText();
        LocalDate documentDate = document_dp.getValue();
        String documentTopic = documentTopic_TextField.getText();
        String fileType = fileType_Combobox.getValue();

        REM_Documentation document = new REM_Documentation(documentName, documentDate, documentTopic, fileType);
        writeDocumentToFile(document);
    }

    @FXML
    private void viewDocumentButtonOnClick(ActionEvent event) {
        documentList.clear();
        readDocumentFromFile();
        Document_TableView.setItems(documentList);
    }

    @FXML
    private void cancelButtonOnClick(ActionEvent event) {
      
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("RuelsAndPolicyManagerDashboard.fxml"));
            Scene someScene = new Scene(root);

            Stage someStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            someStage.setScene(someScene);
            someStage.show();
        } catch (IOException e) {
            e.printStackTrace();
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeDocumentToFile(REM_Documentation document) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("DocumentDetails.txt", true))) {
            String documentName = document.getDocumentName() != null ? document.getDocumentName() : "";
            LocalDate documentDate = document.getDocumentDate() != null ? document.getDocumentDate() : null;
            String documentTopic = document.getDocumentTopic() != null ? document.getDocumentTopic() : "";
            String fileType = document.getFileType() != null ? document.getFileType() : "";

            writer.write(documentName + "," + documentDate + "," + documentTopic + "," + fileType + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readDocumentFromFile() {
        documentList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader("DocumentDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String documentName = parts[0];
                    LocalDate documentDate = LocalDate.parse(parts[1]);
                    String documentTopic = parts[2];
                    String fileType = parts[3];

                    REM_Documentation document = new REM_Documentation(documentName, documentDate, documentTopic, fileType);
                    documentList.add(document);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}