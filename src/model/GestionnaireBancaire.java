/*
 * @Author : Déwi Girot
 * */

package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class GestionnaireBancaire {

	private List<Transaction> listTransaction = new LinkedList<>();
	private List<Taux> listTaux = new LinkedList<>();
	
	public void chargerTaux() {
	    try (BufferedReader br = new BufferedReader(new FileReader("Data/taux.txt"))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] values = line.split(" ");
	            Taux t = new Taux(Double.parseDouble(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]), values[0]);
	            listTaux.add(t);
	        }
	    } catch (IOException e) {
	        System.err.format("Erreur de lecture de fichier: %s%n", e);
	    } catch (IllegalArgumentException e) {
	        System.err.format("Erreur dans le fichier taux.txt: %s%n", e);
	    }
	}
	
}
