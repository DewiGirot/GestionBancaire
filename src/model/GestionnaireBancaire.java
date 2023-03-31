/*
 * @Author : Déwi Girot
 * */

package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
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
		
		this.chargerTaux();
		//this.chargerTransactions();
	}


	public void chargerTaux() {
	    try (BufferedReader br = new BufferedReader(new FileReader("../GestionBancaire/src/data/taux.txt"))) {
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
	
//	public void chargerTransactions() {
//	    Path filePath = Paths.get("../GestionBancaire/src/data", "SaveList.bin");
//	    try (FileInputStream fis = new FileInputStream(filePath.toFile());
//	        ObjectInputStream ois = new ObjectInputStream(fis)) {
//	    	List<Transaction> loadedList = (LinkedList<Transaction>) ois.readObject();
//	    	listTransaction.clear();
//	        if(loadedList != null && !loadedList.isEmpty()) {
//	            listTransaction.addAll(loadedList);
//	        }
//	    } catch (IOException | ClassNotFoundException e) {
//	        System.err.println("Erreur lors du chargement des transactions : " + e.getMessage());
//	    }
//	}
	
//	public void sauvegarderTransactions() {
//		try {
//	        FileOutputStream fos = new FileOutputStream("../GestionBancaire/src/data/SaveList.bin");
//	        ObjectOutputStream oos = new ObjectOutputStream(fos);
//	        List<Transaction> saveList = new LinkedList<>(listTransaction);
//	        oos.writeObject(saveList);
//	        oos.close();
//	        fos.close();
//	    } catch (Exception e) {
//	        System.err.println("Erreur lors de la sauvegarde des transactions : " + e.getMessage());
//	    }
//	}
	
	public void sauvegarderTransactions() {
	    Path filePath = Paths.get("../GestionBancaire/src/data", "SaveList.bin");
	    List<Transaction> saveList = new LinkedList<>(listTransaction);
	    try (FileOutputStream fos = new FileOutputStream(filePath.toFile());
	        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
	        oos.writeObject(saveList);
	    } catch (IOException e) {
	        System.err.println("Erreur lors de la sauvegarde des transactions : " + e.getMessage());
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
