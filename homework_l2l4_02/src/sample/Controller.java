package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    public void sendMsg(){
        if (textField.getLength() != 0) {
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
        }
    }
}
