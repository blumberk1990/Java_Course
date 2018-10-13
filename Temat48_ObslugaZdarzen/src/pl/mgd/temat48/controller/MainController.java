package pl.mgd.temat48.controller;


import javafx.scene.input.KeyEvent;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;


public class MainController implements Initializable {

	   @FXML
	    private Button clearButton;

	    @FXML
	    private TextArea leftTextArea;

	    @FXML
	    private TextArea rightTextArea;
	    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		clearButton.setText("Clear windows");
		clearButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Czyszczenie okien tekstowych.");
				leftTextArea.clear();
				rightTextArea.clear();				
			}
		});

		leftTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> rightTextArea
				.setText(new StringBuilder()
						.append(leftTextArea.getText())
						.reverse()
						.toString()));
		
		rightTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> leftTextArea
				.setText(new StringBuilder()
						.append(rightTextArea.getText())
						.reverse()
						.toString()));
		
	}

}
