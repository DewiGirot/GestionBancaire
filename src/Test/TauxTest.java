package Test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import model.Taux;

class TauxTest {
	
	
	/*
	 * Test creation of a taux
	 * */
	@Test
	public void testCreationTransaction() {
		Taux t = new Taux(0.0, 100.0, 3.0, "Taux 1");
	}
	
	/*
	 * Tests for the constructor exceptions
	 * */
	
	@Test
    public void testInvalidSeuilInf() {
		Assertions.assertThrows(IllegalArgumentException.class,
	            () -> new Taux(-1.0, 100.0, 3.0, "Taux 1"));
    }
	
	/*
	 * Test to all setters
	 * */
	
	@Test
    public void testSetNom() {
		//TODO
    }	
	

}
