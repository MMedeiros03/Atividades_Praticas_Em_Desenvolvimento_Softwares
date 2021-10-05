package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OlaMundoController {
	
	@FXML
	private Button run;
	@FXML
	private Label result;
	@FXML
	public void Run() {
		result.setText("Olá Mundo");
	}
}
