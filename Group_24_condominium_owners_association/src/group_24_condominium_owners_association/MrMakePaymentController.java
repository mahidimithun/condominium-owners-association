/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import modelPack.MRmakePayment;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class MrMakePaymentController implements Initializable {

    @FXML
    private TextField tf_paymentCode;
    @FXML
    private ComboBox<String> cb_paymentType;
    @FXML
    private TextField tf_amount;
    @FXML
    private TextField tf_unitOwnerId;
    @FXML
    private TableView<MRmakePayment> makePaymentTable;
    @FXML
    private TableColumn<MRmakePayment, String> tc_paymentCode;
    @FXML
    private TableColumn<MRmakePayment, String> tc_paymentType;
    @FXML
    private TableColumn<MRmakePayment, String> tc_amount;
    @FXML
    private TableColumn<MRmakePayment, String> tc_unitOwnerId;
    @FXML
    private Label lbl_notify;

    ObservableList<MRmakePayment> makePaymentList;

    private String filename = "mrMakePayment.txt";

    private String dest = "MRmakePayment.pdf";
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cb_paymentType.getItems().addAll("Utility", "Repair", "Maintenance", "Gym", "Swmmingpool");

        tc_paymentCode.setCellValueFactory(new PropertyValueFactory("paymentCode"));
        tc_paymentType.setCellValueFactory(new PropertyValueFactory("paymentType"));
        tc_amount.setCellValueFactory(new PropertyValueFactory("amount"));
        tc_unitOwnerId.setCellValueFactory(new PropertyValueFactory("unitOwnerId"));

        makePaymentList = makePaymentTable.getItems();
    }

    @FXML
    private void makePaymentOnClick(ActionEvent event) {

        StringBuilder data = new StringBuilder();
        Scanner s = null;

        try {

            s = new Scanner(new BufferedReader(new FileReader(filename)));
            makePaymentList.clear();

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String paymentCode = parts[0];
                    String paymentType = parts[1];
                    String amount = parts[2];
                    String unitOwnerId = parts[3];
                    makePaymentList.add(new MRmakePayment(paymentCode, paymentType, unitOwnerId, amount));
                    lbl_notify.setText("Add succesfully");
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
    private void backOnClick(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("MRcoordinator.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }

    @FXML
    private void saveTextOnClick(ActionEvent event) {

        String paymentCode = tf_paymentCode.getText();
        String paymentType = cb_paymentType.getValue();
        String unitOwnerId = tf_unitOwnerId.getText();
        String amount = tf_amount.getText();

        if (paymentCode == null || paymentCode.isEmpty()) {
            lbl_notify.setText("You must fill Payment Code...");
            return;
        }

        if (paymentType == null || paymentType.isEmpty()) {
            lbl_notify.setText("You must selected Payment Type...");
            return;
        }

        if (unitOwnerId == null || unitOwnerId.isEmpty()) {
            lbl_notify.setText("You must fill up Unit Owner Id...");
            return;
        }

        if (amount == null || amount.isEmpty()) {
            lbl_notify.setText("Please input amount...");
            return;
        }

        MRmakePayment makePayment = new MRmakePayment(paymentCode, paymentType, unitOwnerId, amount);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(makePayment.getPaymentCode() + "," + makePayment.getPaymentType() + "," + makePayment.getAmount() + "," + makePayment.getUnitOwnerId());
            writer.newLine();
            lbl_notify.setText("Save succesfully");
        } catch (IOException e) {
            e.printStackTrace();

        }

        cb_paymentType.setValue(null);
        tf_paymentCode.clear();
        tf_unitOwnerId.clear();
        tf_amount.clear();
    }

    @FXML
    private void savePdfOnClick(ActionEvent event) {
        
        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

           
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.replace(",", " - ");
                    document.add(new Paragraph(line));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            document.close();
            lbl_notify.setText("Pdf generate succesfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        
    }
        
    }

}
