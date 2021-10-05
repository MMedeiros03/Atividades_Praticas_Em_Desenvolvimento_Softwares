package gui;


import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Alerta;

public class BhaskaraController {
	
	@FXML
	private Button btnSair;
	@FXML
	private Button btnLimpar;
	@FXML
	private Button btnCalcular;
	@FXML
	private TextField valora;
	@FXML
	private TextField valorb;
	@FXML
	private TextField valorc;
	@FXML
	private Label texto;
	
	@FXML
	public void onCalcularAction() {
		try {
		double a = Double.parseDouble(valora.getText());
		double b = Double.parseDouble(valorb.getText());
		double c = Double.parseDouble(valorc.getText());
		double d = ((Math.pow(b, 2.0)) - 4 * a * c);
		double x1 = (- b + Math.sqrt(d)) / (2.0 * a);
		double x2 = (- b - Math.sqrt(d)) / (2.0 * a);
		texto.setText(String.format("X1: %.2f\nX2: %.2f",x1,x2));
		if ((valora.getText() == "") || (valorb.getText() == "") || (valorc.getText() == "")) {
			Alerta.showAlert("Erro!", "Campos nao foram preenchidos corretamente","Voce provavelmente esqueceu de adicionar valor a algum dos campos", AlertType.ERROR);
		}else if (d < 0 ) {
			texto.setText("Não há raizes reais");
		}else if (d == 0) {
			double r1 = -b / (2.0 * a);
			texto.setText(String.format("X: %.2f",r1));
			
		}
			
		} 
		catch (NumberFormatException e) {
			Alerta.showAlert("Erro!!!", "Dados incorretos.",
					"Voce provavelmente inseriu algo diferente em algum dos campos", AlertType.ERROR);
		}
	}

	@FXML
	public void onSairAction() {
		System.exit(1);
	}
	@FXML
	public void onLimparAction() {
		valora.setText("");
		valorb.setText("");
		valorc.setText("");
		texto.setText("");
	}
}
