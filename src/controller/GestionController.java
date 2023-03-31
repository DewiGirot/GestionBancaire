/*
 * @Author : Déwi Girot
 * */

package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.GridPane;
import model.GestionnaireBancaire;

public class GestionController {
	
	/*
	 * Correspond au grid pane -> fenetre principale
	 * */
	@FXML
	public GridPane root;
	
	
	/*
	 * Permet de mettre les choix dans la ChoiceBox
	 * */
	@FXML
	public void setChoiceBox() {
		ChoiceBox<String> choiceBox = new ChoiceBox<String>();
		choiceBox.getItems().add("Crédit");
		choiceBox.getItems().add("Débit");
	}
	
	
	/*
	 * 
	 * */
	
	
	private GestionnaireBancaire gestionnaire = new GestionnaireBancaire(0);
	
	
	
}
