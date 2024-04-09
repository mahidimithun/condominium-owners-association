/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RetailSpaceController implements Initializable {

   @FXML
    private TextField ProductNameTF;
    @FXML
    private TextField PriceTF;
    @FXML
    private TextField ExpiryDatesTF;
    @FXML
    private TableView<RetailSpace> ProductDetailsTV;
    @FXML
    private TableColumn<RetailSpace, String> Product_NameTC;
    @FXML
    private TableColumn<RetailSpace, Double> PriceTC;
    @FXML
    private TableColumn<RetailSpace, String> ExpiryDatesTC;

    // ObservableList 
    private ObservableList<RetailSpace> retailSpaces = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        Product_NameTC.setCellValueFactory(cellData -> cellData.getValue().productNameProperty());
        PriceTC.setCellValueFactory(cellData -> cellData.getValue().priceProperty().asObject());
        ExpiryDatesTC.setCellValueFactory(cellData -> cellData.getValue().expiryDatesProperty());


        ProductDetailsTV.setItems(retailSpaces);
    }

    @FXML
    private void DoneButtonOnClick(ActionEvent event) {
        
        String productName = ProductNameTF.getText();
        double price = Double.parseDouble(PriceTF.getText());
        String expiryDates = ExpiryDatesTF.getText();

       
        RetailSpace newProduct = new RetailSpace(productName, price, expiryDates);

   
        retailSpaces.add(newProduct);

      
        ProductNameTF.clear();
        PriceTF.clear();
        ExpiryDatesTF.clear();

       
    }

    @FXML
    private void LogoutButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackButtonOnClick(ActionEvent event) {
    }
}