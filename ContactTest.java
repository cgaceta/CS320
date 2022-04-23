import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	@Test
	void testContactClass() {
		Contact newContact = new Contact("12345", "Christopher", "Glen", "6197460111", 
				"1409 Venters Drive, Chula Vista CA 92123");
		assertTrue(newContact.getFirstName().equals("Christopher"));
		assertTrue(newContact.getLastName().equals("Glen"));
		assertTrue(newContact.getId().equals("12345"));
		assertTrue(newContact.getPhone().equals("6197460111"));
		assertTrue(newContact.getAddress().equals("1409 Venters Drive, Chula Vista CA 92123"));
	}
	
	@Test
	void testContactClassIdLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10000000000", "Christopher", "Glen", "6197460111", "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Christopher", "Glen", "6197460111", "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassFirstNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10000000000", "Christophers", "Glen", "6197460111", "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("10000000000", null, "Glen", "6197460111", "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassLastNameLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Christopher", "Glenstopherson", "6197460111", "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Christopher", null, "6197460111", "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassPhone10() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Christopher", "Gaceta", "61974601111", "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactCalssPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Christopher", "Gaceta", null, "1409 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassAddressLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Christopher", "Gaceta", "6197460111", "1409231-143 Venters Drive, Chula Vista CA 92123");
		});
	}
	
	@Test
	void testContactClassAddressnull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Christopher", "Gaceta", "6197460111", null);
		});
	}}