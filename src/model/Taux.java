/*
 * @Author : Déwi Girot
 * 
 * */

package model;

public class Taux {
	
	private double seuilInf;
    private double seuilSup;
    private double tauxApplique;
    private String tauxNom;
    
	public Taux(double seuilInf, double seuilSup, double taux, String tauxNom) {
		this.seuilInf = seuilInf;
		this.seuilSup = seuilSup;
		this.tauxApplique = taux;
		this.tauxNom = tauxNom;
	}
	
	/*
	 * Getters and Setters
	 * */

	public double getSeuilInf() {
		return this.seuilInf;
	}

	public void setSeuilInf(double seuilInf) {
		this.seuilInf = seuilInf;
	}

	public double getSeuilSup() {
		return this.seuilSup;
	}

	public void setSeuilSup(double seuilSup) {
		this.seuilSup = seuilSup;
	}

	public double getTauxApplique() {
		return this.tauxApplique;
	}

	public void setTauxApplique(double taux) {
		this.tauxApplique = taux;
	}

	public String getTauxNom() {
		return this.tauxNom;
	}

	public void setTauxNom(String tauxNom) {
		this.tauxNom = tauxNom;
	}
    
    

}
