package model;

import java.io.Serializable;

public class Transaction implements Serializable {

	private String nom;
	private String type;
	private double montant;
	
	public Transaction(String nom, String type, double montant) throws IllegalArgumentException{
		this.nom = nom;
		this.type = type;
		this.montant = montant;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
	
}
