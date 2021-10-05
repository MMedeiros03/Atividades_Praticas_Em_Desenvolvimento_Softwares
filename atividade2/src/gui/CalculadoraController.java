package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {
	@FXML
	private Button btnSomar;
	@FXML
	private Button btnSubtrair;
	@FXML
	private Button btnMultiplicar;
	@FXML
	private Button btnDividir;
	@FXML
	private TextField valor1;
	@FXML
	private TextField valor2;
	@FXML
	private Label texto;
	@FXML
	private Button btnSair;
	@FXML
	private Button btnLimpar;
	@FXML
	public void onSairAction() {
		System.exit(1);
	}
	@FXML
	public void onLimparAction() {
		valor1.setText("");
		valor2.setText("");
		texto.setText("");
	}
	@FXML
	public void onSomarAction() {
		double x1 = Double.parseDouble(valor1.getText());
		double x2 = Double.parseDouble(valor2.getText());
		double resultado = (x1 + x2); 
		texto.setText(String.format("%.2f", resultado));
	}
	@FXML
	public void onSubtrairAction() {
		double x1 = Double.parseDouble(valor1.getText());
		double x2 = Double.parseDouble(valor2.getText());
		double resultado = (x1 - x2); 
		texto.setText(String.format("%.2f", resultado));
	}
	@FXML
	public void onMultiplicarAction() {
		double x1 = Double.parseDouble(valor1.getText());
		double x2 = Double.parseDouble(valor2.getText());
		double resultado = (x1 * x2); 
		texto.setText(String.format("%.2f", resultado));
	}
	@FXML
	public void onDividirAction() {
		double x1 = Double.parseDouble(valor1.getText());
		double x2 = Double.parseDouble(valor2.getText());
		double resultado = (x1 / x2); 
		texto.setText(String.format("%.2f", resultado));
	}
}
