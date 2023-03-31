package Test;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import model.Transaction;

class TransactionTest {

	@Test
	public void testCreationTransaction() {
		Transaction t = new Transaction("Transaction 1", "c", 150.0);
	}
	
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

}
