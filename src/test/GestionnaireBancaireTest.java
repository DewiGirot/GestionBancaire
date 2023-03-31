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
	void testConstructor() {
		GestionnaireBancaire gestionnaire = new GestionnaireBancaire(10.0);
	}
	
	@Test
    public void testInvalidSeuilInf() {
		Assertions.assertThrows(IllegalArgumentException.class,
	            () -> new GestionnaireBancaire(-1.0));
    }

}
