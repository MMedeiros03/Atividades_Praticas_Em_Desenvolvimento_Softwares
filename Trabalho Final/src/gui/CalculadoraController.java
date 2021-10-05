package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {
	
	@FXML
	private Button Limpar;
	@FXML
	private Button Somar;
	@FXML
	private Button Subtrair;
	@FXML
	private Button Multiplicar;
	@FXML
	private Button Dividir;
	@FXML
	private TextField num1;
	@FXML
	private TextField num2;
	@FXML
	private Label resultado;
	@FXML
	public void Somar() {
		double valor1 = Double.parseDouble(num1.getText());
		double valor2 = Double.parseDouble(num2.getText());
		double resposta = (valor1 + valor2); 
		resultado.setText(String.format("%.2f", resposta));
	}
	@FXML
	public void Subtrair() {
		double valor1 = Double.parseDouble(num1.getText());
		double valor2 = Double.parseDouble(num2.getText());
		double resposta = (valor1 - valor2); 
		resultado.setText(String.format("%.2f", resposta));
	}
	@FXML
	public void Multiplicar() {
		double valor1 = Double.parseDouble(num1.getText());
		double valor2 = Double.parseDouble(num2.getText());
		double resposta = (valor1 * valor2); 
		resultado.setText(String.format("%.2f", resposta));
	}
	@FXML
	public void Dividir() {
		double valor1 = Double.parseDouble(num1.getText());
		double valor2 = Double.parseDouble(num2.getText());
		double resposta = (valor1 / valor2); 
		resultado.setText(String.format("%.2f", resposta));
	}
	
	@FXML
	public void Limpar() {
		num1.setText("");
		num2.setText("");
		resultado.setText("");
	}
	
}
