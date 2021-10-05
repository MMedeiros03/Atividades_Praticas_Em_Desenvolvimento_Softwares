package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SaudacaoController {
	@FXML
	private Button run;
	@FXML
	private TextField nome;
	@FXML
	private TextField mensagem;
	@FXML
	private Label resultado;
	
	@FXML
	public void onSaudacao() {
		String name = nome.getText();
		String mensage = mensagem.getText();
		resultado.setText(" " + mensage +" " + name);
	}
	
}
