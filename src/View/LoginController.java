/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Jorge
 */
public class LoginController implements Initializable {

    Button btn = new Button();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btn.setText("Say 'Hello Jorge'");
        
        // Agregar una acción al hacer clic en el botón
        btn.setOnAction(event -> {
            System.out.println("Button clicked!");
        });
    }    
    
}
