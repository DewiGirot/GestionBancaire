package Test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import model.Transaction;

class TransactionTest {
	
	
	/*
	 * Test creation of a transaction
	 * */
	@Test
	public void testCreationTransaction() {
		Transaction t = new Transaction("Transaction 1", "c", 150.0);
	}
	
	/*
	 * Tests for the constructor exceptions
	 * */
	
	@Test
    public void testInvalidNom() {
		Assertions.assertThrows(IllegalArgumentException.class,
            () -> new Transaction("", "d", 100.0));
    }
	
	@Test
    public void testInvalidType() {
		Assertions.assertThrows(IllegalArgumentException.class,
            () -> new Transaction("Transaction 1", "debit", 100.0));
    }
	
	@Test
    public void testInvalidMontant() {
		Assertions.assertThrows(IllegalArgumentException.class,
            () -> new Transaction("Transaction 1", "d", 0.0));
    }
	
	/*
	 * Test to all setters
	 * */
	
	@Test
    public void testSetNom() {
		Transaction t = new Transaction("Transaction 1", "d", 100.0);
		Assertions.assertThrows(IllegalArgumentException.class,
            () -> t.setNom(""));
    }
	
	@Test
    public void testSetType() {
		Transaction t = new Transaction("Transaction 1", "d", 100.0);
		Assertions.assertThrows(IllegalArgumentException.class,
            () -> t.setType("debit"));
    }
	
	@Test
    public void testSetMontant() {
		Transaction t = new Transaction("Transaction 1", "d", 100.0);
		Assertions.assertThrows(IllegalArgumentException.class,
            () -> t.setMontant(0));
    }	
	

}
