package pl.mgd.temat47.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class InitController  implements Initializable {

    @FXML
    private Label label1;

    @FXML
    private Button button1;

    @FXML
    private Label label2;

    @FXML
    private Button button2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		label1.setText("Etykieta 1");
		label2.setText("Etykieta 2");
		button1.setText("Przycisk 1");
        button2.setText("Przycisk 2");
	}

}
