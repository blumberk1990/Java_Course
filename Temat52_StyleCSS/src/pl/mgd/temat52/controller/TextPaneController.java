package pl.mgd.temat52.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class TextPaneController {

    @FXML
    private TextArea leftTextArea;

    @FXML
    private TextArea rightTextArea;

	public TextArea getLeftTextArea() {
		return leftTextArea;
	}

	public void setLeftTextArea(TextArea leftTextArea) {
		this.leftTextArea = leftTextArea;
	}
	
	public TextArea getRightTextArea() {
		return rightTextArea;
	}

	public void setRightTextArea(TextArea rightTextArea) {
		this.rightTextArea = rightTextArea;
	}
 	
}
