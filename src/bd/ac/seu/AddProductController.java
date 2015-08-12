/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ahmad
 */
public class AddProductController implements Initializable {
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField categoryField;
    @FXML
    private TextField unitPriceField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleAddProductAction(ActionEvent event) {
    }
    
}
