package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.awt.*;

public class Controller {
    @FXML
    private TextArea mChat;
    @FXML
    private TextField eText;
    @FXML
    private Button btnSend;

    public void sendMessage() {
        if (!eText.getText().equals("")) {
            mChat.appendText("You say:" + eText.getText());
            mChat.appendText("\n");
            eText.setText("");
        }
    }

    public void btnSendClick() {
        sendMessage();
    }

    public void eTextKeyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sendMessage();
        }
    }
}
