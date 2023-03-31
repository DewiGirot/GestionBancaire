package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.Transaction;

class TransactionTest {

	@Test
	void testCreationTransaction() {
		String type = "c";
		Transaction t = new Transaction("Transaction 1", type, 150.0);
	}

}
