package views;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        // TODO Auto-generated method stub
        
    }
    @FXML
    private ComboBox<?> comboBox;

    @FXML
    private Label lblComboBox;

    @FXML
    void selectText(ActionEvent event) {

    }

}
