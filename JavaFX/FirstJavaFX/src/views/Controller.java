package views;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        ObservableList<String> list = FXCollections.observableArrayList("Texto1", "Texto2", "Texto3");
        comboBox.setItems(list);

        ObservableList<String> list2 = FXCollections.observableArrayList("Escolha1", "Escolha2", "Escolha3");
        choiceBox.setItems(list2);
        choiceBox.setOnAction(this::getChoice);
    }

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Label lblChoiceBox;

    @FXML
    private Label lblComboBox;

    @FXML
    private Label lblTextField;

    @FXML
    private TextField tfText;

    @FXML
    void inputText(ActionEvent event) {
        String text1 = tfText.getText();
        lblTextField.setText(text1);
    }

    @FXML
    void selectText(ActionEvent event) {
        String text2 = comboBox.getSelectionModel().getSelectedItem().toString();
        lblComboBox.setText(text2);
        if(text2 == "Texto2" || text2 == "Texto3") {
            tfText.clear();
            tfText.setEditable(false);
        } else {
            tfText.setEditable(true);
        }

    }

    public void getChoice(ActionEvent event) {
        String text3 = choiceBox.getValue();
        lblChoiceBox.setText(text3);
    }

}
