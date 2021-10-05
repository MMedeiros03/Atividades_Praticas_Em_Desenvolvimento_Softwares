package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML
	private Button Logar;
	@FXML
	private TextField Nome;
	@FXML
	private PasswordField Senha;
	@FXML
	private Label texto;
	@FXML
	public void onEntrarAction() {
		String nome = Nome.getText();
		String senha = Senha.getText();
		texto.setText("Usuário: " + nome +" \nSenha: " + senha);
	}
	
}

