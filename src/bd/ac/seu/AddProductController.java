/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    Statement statement;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String DB_URL = "jdbc:mysql://127.0.0.1/posdb";
        String DB_USER = "ahmad";
        String DB_PASS = "easypassword";
        
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            statement = connection.createStatement();
            System.out.println("Connected To Database");
        } catch (SQLException ex) {
            Logger.getLogger(AddProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void handleAddProductAction(ActionEvent event) {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String category = categoryField.getText();
        double unitPrice = Double.parseDouble(unitPriceField.getText());
        Product p = new Product(id, name, category, unitPrice);
        String query = "insert into Product values(" + p.getProductId() + ", "
                + "'" + p.getProductName() + "', " 
                + "'" + p.getCategory() + "', "
                + p.getUnitPrice() + ")";
        try {
            statement.execute(query);
        } catch (SQLException ex) {
            Logger.getLogger(AddProductController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
