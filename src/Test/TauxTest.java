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
	
	@Test
    public void testInvalidSeuilSup() {
		Assertions.assertThrows(IllegalArgumentException.class,
	            () -> new Taux(1.0, -100.0, 3.0, "Taux 1"));
    }
	
	/*
	 * Test when seuilInf is greater than seuilSup
	 * */
	@Test
    public void testInvalidSeuilInfSupThanSeuilSup() {
		Assertions.assertThrows(IllegalArgumentException.class,
	            () -> new Taux(100.0, 1.0, 3.0, "Taux 1"));
    }
	
	@Test
    public void testInvalidTauxApplique() {
		Assertions.assertThrows(IllegalArgumentException.class,
	            () -> new Taux(1.0, 100.0, -3.0, "Taux 1"));
    }
	
	/*
	 * Test to all setters
	 * */
	
	@Test
    public void testSetNom() {
		//TODO
    }	
	

}
