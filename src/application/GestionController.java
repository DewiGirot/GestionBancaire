/*
 * @Author : Déwi Girot
 * */

package application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.GestionnaireBancaire;

public class GestionController {
	
	/*
	 * GestionnaireBancaire permettant d'utiliser l'interface
	 * */
	private GestionnaireBancaire gestionnaire = new GestionnaireBancaire(0);
	
	/*
	 * Correspond au grid pane (fenetre principale)
	 * */
	@FXML
	public GridPane root;
	
	/*
	 * TextField représentant le solde de l'utilisateur
	 * */
	@FXML
	public TextField solde;
	
	
	/*
	 * TextField représentant le solde de l'utilisateur
	 * */
	@FXML
	public TextField compte;
	
	/*
	 * ListView représentant la liste des transactions de l'utilisateur
	 * */
	@FXML
	public ListView listeTransactions;
	
	/*
	 * ObservableList permettant d'afficher la liste des transactions de l'utilisateur
	 * */
	@FXML
	public ObservableList<String> oList;
	
	/*
	 * Button représentant la validation de la transaction
	 * */
	@FXML
	public Button validerTransaction;
	
	
	/*
	 * Fonction qui va permettre de sauvegarder les transaction
	 * 
	 * @param : event when user clic on validate button
	 * */
	@FXML
	public void actionEnregistrer(ActionEvent evt) {
		if(evt.getSource().equals(validerTransaction)) {
			this.gestionnaire.sauvegarderTransactions();
		}
	}
	
	
	/*
	 * Permet de mettre les choix dans la ChoiceBox
	 * */
	@FXML
	public void setChoiceBox() {
		ChoiceBox<String> choiceBox = new ChoiceBox<String>();
		choiceBox.getItems().add("Crédit");
		choiceBox.getItems().add("Débit");
	}
	
}
