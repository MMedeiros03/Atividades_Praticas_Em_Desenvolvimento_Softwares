package gui;


import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Alerta;

public class BhaskaraController {
	
	@FXML
	private Button Limpar;
	@FXML
	private Button Calcular;
	@FXML
	private TextField a;
	@FXML
	private TextField b;
	@FXML
	private TextField c;
	@FXML
	private Label resultado;
	
	@FXML
	public void onCalcularAction() {
		try {
		double valorA = Double.parseDouble(a.getText());
		double valorB = Double.parseDouble(b.getText());
		double valorC = Double.parseDouble(c.getText());
		double delta = ((Math.pow(valorB, 2.0)) - 4 * valorA * valorC);
		double x1 = (- valorB + Math.sqrt(delta)) / (2.0 * valorA);
		double x2 = (- valorB - Math.sqrt(delta)) / (2.0 * valorA);
		resultado.setText(String.format("Delta: %.2f\nX1: %.2f\nX2: %.2f",delta,x1,x2));
		if ((a.getText() == "") || (b.getText() == "") || (c.getText() == "")) {
			Alerta.showAlert("Erro!!!", "Não há valores em alguns dos campos",
					"Você não inseriu o valor em alguns dos campos solicitados", AlertType.ERROR);
		}
			
		else if (delta < 0 ) {
			resultado.setText("Não há raizes reais");
		}
		else if (delta == 0) {
			double x = -valorB / (2.0 * valorA);
			resultado.setText(String.format("X: %.2f",x));
			
		}
			
		} 
		catch (NumberFormatException e) {
			Alerta.showAlert("Erro!!!", "Incompatibilidade",
					"Você inseriu alguma letra, sinal ou símbolo em algum dos campos", AlertType.ERROR);
		}
	}

	@FXML
	public void onLimparAction() {
		a.setText("");
		b.setText("");
		c.setText("");
		resultado.setText("");
	}
}
