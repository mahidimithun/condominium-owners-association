/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package group_24_condominium_owners_association;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FMBudgetController implements Initializable {

    @FXML
    private TextField tf_FMBudget;
    @FXML
    private TextField tf_FMtransId;
    @FXML
    private TextField tf_FMtransAmount;
    @FXML
    private TextField tf_FMcurBudget;
    @FXML
    private TextField tf_FMexpAmount;
    @FXML
    private TextField tf_FMgymBudget;
    @FXML
    private TextField tf_FMswimBudget;
    @FXML
    private TableView<?> fmBudgetTableView;
    @FXML
    private TableColumn<?, ?> tc_fmBudget;
    @FXML
    private TableColumn<?, ?> tc_fmId;
    @FXML
    private TableColumn<?, ?> tc_fmcurBudget;
    @FXML
    private TableColumn<?, ?> tc_fmexpAmount;
    @FXML
    private TableColumn<?, ?> tc_fmgymBudget;
    @FXML
    private TableColumn<?, ?> tc_fmswimBudget;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addFMBudgetOnClick(ActionEvent event) {
    }

    @FXML
    private void View(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FMviewMRbudget.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
        
    }

    @FXML
    private void backFMBudgetOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FMDashboard.fxml"));
        Parent parent = loader.load();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Scene studentScene = new Scene(parent);

        currentStage.setScene(studentScene);
        currentStage.show();
    }
    
}
