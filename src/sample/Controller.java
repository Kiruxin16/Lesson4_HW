package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField mesTextField;
    @FXML
    public TextArea textAreaChat;



    @FXML
    public void sendMsg(ActionEvent actionEvent) {
        textAreaChat.appendText(mesTextField.getText()+"\n");
        mesTextField.clear();
        mesTextField.requestFocus();

    }
}
