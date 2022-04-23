import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//creating contact and test
	@Test
	void testContactServiceClass() {
		ContactService.addContact("Christopher", "Glen", "6197460121", "1409 Venters Drive, Chula Vista CA 92123");
		//System.out.println(ContactService.contactList.get(0).getId());	used for debugging
		assertTrue(ContactService.contactList.get(0).getId().equals("2"));
		assertTrue(ContactService.contactList.get(0).getFirstName().equals("Christopher"));
		assertTrue(ContactService.contactList.get(0).getLastName().equals("Glen"));
		assertTrue(ContactService.contactList.get(0).getPhone().equals("6197460121"));
		assertTrue(ContactService.contactList.get(0).getAddress().equals("1409 Venters Drive, Chula Vista CA 92123"));
	}
	
	// delete contact test
	@Test
	void testContactServiceDelete() {
		ContactService.addContact("Christopher", "Glen", "6197460121", "1409 Venters Drive, Chula Vista CA 92123");
		int size = ContactService.contactList.size();
		//System.out.println(ContactService.contactList.get(size - 1).getId());
		ContactService.deleteContact("3");
	}};
	