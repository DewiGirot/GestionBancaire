package model;

import java.io.Serializable;

public class Transaction implements Serializable {

	private String nom;
	private String type;
	private double montant;
	
	public Transaction(String nom, String type, double montant) throws IllegalArgumentException{
		if(montant <= 0 ) {
			throw new IllegalArgumentException("Le montant doit être supérieur à 0");
		}
		if(nom.equals("")) {
			throw new IllegalArgumentException("Le nom de la transaction est vide");
		}
		if(!type.equals("c") && (!type.equals("d"))) {
				throw new IllegalArgumentException("Le type doit être 'c' pour crédit ou 'd' pour débit");
		}
		this.nom = nom;
		this.type = type;
		this.montant = montant;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) throws IllegalArgumentException {
		if(!type.equals("c") || type.equals("d")) {
			throw new IllegalArgumentException("Le type doit être 'c' pour crédit ou 'd' pour débit");
		}
		this.nom = nom;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) throws IllegalArgumentException {
		if(!type.equals("c") && (!type.equals("d"))) {
			throw new IllegalArgumentException("Le type doit être 'c' pour crédit ou 'd' pour débit");
	}
		this.type = type;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) throws IllegalArgumentException {
		if(montant <= 0 ) {
			throw new IllegalArgumentException("Le montant doit être supérieur à 0");
		}
		this.montant = montant;
	}
	
	
	
}
