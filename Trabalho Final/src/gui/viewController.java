package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import util.Alerta;

public class viewController implements Initializable {

	@FXML
	private MenuItem menuItemSaudacao;
	@FXML 
	private MenuItem menuItemOlaMundo;
	
	
	@FXML
	private MenuItem menuItemAutores;
	@FXML
	private MenuItem menuItemVersao;
	
	
	@FXML 
	private MenuItem menuItemBaskara;
	@FXML 
	private MenuItem menuItemCalculadora;
	
	@FXML
	private MenuItem sair;
	
	@FXML
	public void Sair() {
		System.exit(1);
	}
	
	@FXML
	public void onMenuItemAutores() {
		loadView("/gui/Autores.fxml");
	}	
	
	@FXML
	public void onMenuItemVersao() {
		loadView("/gui/Version.fxml");
	}
	
	@FXML
	public void onMenuSaudacaoItem() {
		loadView("/gui/Saudacao.fxml");
	}
	
	@FXML
	public void onMenuBaskaraItem() {
		loadView("/gui/Bhaskara.fxml");
	}
	
	@FXML
	public void onMenuCalculadoraItem() {
		loadView("/gui/Calculadora.fxml");
	}
	
	@FXML
	public void onMenuOlaMundoItem() {
		loadView("/gui/OlaMundo.fxml");
	}
	
		
		
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
/*
 O objetivo do m�todo de loadView � carregar uma view na janela principal da aplica��o.
 Para isso precisamos pegar uma refer�ncia da ca cena principal, que foi criada na classe 
 Main.
 Uma vez a refer�ncia da Cena principal tenha sido exposta na classe Main, podemos obter 
  uma refer�ncia aqui no m�todo de loadView para manipularmos a janela principal da 
  aplica��o.
 */
	
	public synchronized void loadView(String absolutName) {
		try {
			//carregando uma view, passando como par�metro a localiza��o (absolutName)
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absolutName));
			VBox newVBox = loader.load();
			
			//obtendo uma refer�ncia da cena principa, criada e exposta na classe Main
			Scene mainScene = Main.getMainScene();
			
			//fazendo o casting de scrooPane que � o componente da cena principal, para o VBox
			//que � o componente na nova tela a ser carregada na cena principal 
			VBox mainVBox = (VBox)((ScrollPane) mainScene.getRoot()).getContent();
			
			//guardando o componente MenuBar que dever ser carregado junto com todas as views
			//do sistema
			Node mainMenu = mainVBox.getChildren().get(0);
			
			//limpando todos os componentes da view principal
			mainVBox.getChildren().clear();
			
			//adicionando o mainMenu porque deve estar presente em todas as views
			mainVBox.getChildren().add(mainMenu);
			
			//adicionando todos os componente filhos do layout newVBox (� o layout da tela
			//a ser carregada na janela principal)
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		}
		catch (IOException e) {
			//caso acontece algum erro, emitir� um alerta, conforme implementado anteriormente
			//poss�veis erros aqui � 1) n�o conseguir obter uma refer�ncia da cena principal,
			//2)n�o conseguir carregar alguma tela, 3) n�o encontrar os componentes da VBox principal
			Alerta.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
}