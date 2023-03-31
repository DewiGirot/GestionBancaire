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
    
    
    /*
     * Constructor
     * */
	public Taux(double seuilInf, double seuilSup, double taux, String tauxNom) throws IllegalArgumentException {
		if(seuilInf < 0 || seuilSup <0) {
			throw new IllegalArgumentException("Les taux ne peuvent être inférieurs à 0");
		}
		if(seuilInf > seuilSup) {
			throw new IllegalArgumentException("Le seuilInf ne peut pas être supérieur au seuilSup");
		}
		if(taux < 0) {
			throw new IllegalArgumentException("Le taux est négatif");
		}
		if(tauxNom.equals("")) {
			throw new IllegalArgumentException("Le nom du taux est invalide, il st obligatoire de le renseigner");
		}
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
		if(seuilInf < 0) {
			throw new IllegalArgumentException("Les taux ne peuvent être inférieurs à 0");
		}
		if(seuilInf > this.seuilSup) {
			throw new IllegalArgumentException("Le seuilInf ne peut pas être supérieur au seuilSup");
		}
		this.seuilInf = seuilInf;
	}

	public double getSeuilSup() {
		return this.seuilSup;
	}

	public void setSeuilSup(double seuilSup) {
		if(seuilSup <0) {
			throw new IllegalArgumentException("Les taux ne peuvent être inférieurs à 0");
		}
		if(this.seuilInf > seuilSup) {
			throw new IllegalArgumentException("Le seuilInf ne peut pas être supérieur au seuilSup");
		}
		this.seuilSup = seuilSup;
	}

	public double getTauxApplique() {
		return this.tauxApplique;
	}

	public void setTauxApplique(double taux) {
		if(taux < 0) {
			throw new IllegalArgumentException("Le taux est négatif");
		}
		this.tauxApplique = taux;
	}

	public String getTauxNom() {
		return this.tauxNom;
	}

	public void setTauxNom(String tauxNom) {
		if(tauxNom.equals("")) {
			throw new IllegalArgumentException("Le nom du taux est invalide, il st obligatoire de le renseigner");
		}
		this.tauxNom = tauxNom;
	}
    
    

}
