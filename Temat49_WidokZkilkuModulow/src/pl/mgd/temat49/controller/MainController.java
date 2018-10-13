package pl.mgd.temat49.controller;

import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
 


public class MainController implements Initializable {

	   @FXML
	    private Button clearButton;

	    @FXML
	    private TextPaneController textPaneController;

	    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TextArea leftTextArea = textPaneController.getLeftTextArea();
		TextArea rightTextArea = textPaneController.getRightTextArea();
		
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
		
		clearButton.setText("Clear windows");
		clearButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Czyszczenie okien tekstowych.");
				leftTextArea.clear();
				rightTextArea.clear();				
			}
		});
		
	}

}
