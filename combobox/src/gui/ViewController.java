package gui;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Person;

public class ViewController implements Initializable {
	@FXML
	private ComboBox<Person> ComboBox;
	@FXML
	private Button btnListarTodos ;
	@FXML
	private Button btnSair;
	private ObservableList<Person> ObsList;
	
	@FXML
	public void onComboBoxPersonAction() {
		Person person = ComboBox.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}
	
	@FXML
	public void onTodosAction() {
		System.out.println("--------------------------------------------------");
		for (Person person : ComboBox.getItems()) {
			System.out.println(person);
		}
		System.out.println("--------------------------------------------------");
	}
	
	@FXML
	public void onSairAction() {
		System.exit(1);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Exemplo1", "Exemplo1@gmail.com"));
		list.add(new Person(2, "Exemplo2", "Exemplo2@gmail.com"));
		list.add(new Person(3, "Exemplo3", "Exemplo3@gmail.com"));
		list.add(new Person(4, "Exemplo4", "Exemplo4@gmail.com"));
		list.add(new Person(5, "Exemplo5", "Exemplo5@gmail.com"));
		list.add(new Person(6, "Exemplo6", "Exemplo6@gmail.com"));
		list.add(new Person(7, "Exemplo7", "Exemplo7@gmail.com"));
		list.add(new Person(8, "Exemplo8", "Exemplo8@gmail.com"));
		list.add(new Person(9, "Exemplo9", "Exemplo9@gmail.com"));
		list.add(new Person(10,"Exemplo10", "Exemplo10@gmail.com"));
		
		ObsList = FXCollections.observableArrayList(list);
		
		ComboBox.setItems(ObsList);
		
		Callback<ListView<Person>, ListCell<Person>> factory = lv -> new
				ListCell<Person>() {
			@Override
			protected void updateItem(Person item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? "" : item.getName());
			}
		};
		ComboBox.setCellFactory(factory);
		ComboBox.setButtonCell(factory.call(null));
	}
	
}