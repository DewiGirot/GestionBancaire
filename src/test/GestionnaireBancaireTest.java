/*
 * @Author : Déwi Girot
 * */

package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.GestionnaireBancaire;

class GestionnaireBancaireTest {

	
	/*
	 * Tests constructor
	 * */
	@Test
    public void testInvalidSeuilInf() {
		Assertions.assertThrows(IllegalArgumentException.class,
	            () -> new GestionnaireBancaire(-1.0));
    }
	
	@Test
	void testConstructorLoadFileOk() {
		GestionnaireBancaire gestionnaire = new GestionnaireBancaire(10.0);
	}

}
