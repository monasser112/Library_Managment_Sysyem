/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librarian;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author mahmoud
 */
public class StudentsController implements Initializable {

    @FXML
    private JFXTextField studnetname;
    @FXML
    private JFXTextField studentnumber;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSaveButton(ActionEvent event) {
    }

    @FXML
    private void handleCancelButton(ActionEvent event) {
    }
    
}
