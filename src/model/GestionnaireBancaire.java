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

	private List<Transaction> listTransaction;
	private List<Taux> listTaux;
	private double solde;
	
	
	public GestionnaireBancaire(double solde) throws IllegalArgumentException {
		if(solde <= 0) {
			throw new IllegalArgumentException("Le solde ne peut pas être inférieur ou égal à 0");
		}
		this.listTransaction = new LinkedList<>();
		this.listTaux = new LinkedList<>();
		this.solde = solde;
	}


	public void chargerTaux() {
	    try (BufferedReader br = new BufferedReader(new FileReader("data/taux.txt"))) {
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


	/*
	 * Getters and Setters
	 * */
	
	public List<Transaction> getListTransaction() {
		return this.listTransaction;
	}


	public void setListTransaction(List<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}


	public List<Taux> getListTaux() {
		return this.listTaux;
	}


	public void setListTaux(List<Taux> listTaux) {
		this.listTaux = listTaux;
	}


	public double getSolde() {
		return this.solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
