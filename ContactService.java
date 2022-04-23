import java.util.ArrayList;	
public class ContactService {
	
	// variables
	public static String publicId;
	public String publicFirstName;
	public String publicLastName;
	public String publicPhone;
	public String publicAddress;
	
	
	static ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	
	
	public static String generateUniqueId() {
		
		String uniqueId;
		if (contactList.isEmpty()) {
			publicId = "1";
		}
		
		else {
			int arraySize = contactList.size();
			publicId = contactList.get(arraySize - 1).getId();
		}
		
		int tempInt = Integer.valueOf(publicId);
		tempInt += 1;
		uniqueId = Integer.toString(tempInt);
		return uniqueId;
	}
	
	// adding contact
	public static void addContact(String fName, String lName, String phone, String address) {
		String ID = generateUniqueId();
		Contact Contact1 = new Contact(ID, fName, lName, phone, address);
		contactList.add(Contact1);
	}
	public static void addContact(Contact newContact) {
		String tempId = newContact.getId();
		for (int i = 0; i < contactList.size(); i++) {
			if (tempId.equals(contactList.get(i).getId())) {
				throw new IllegalArgumentException("Contact ID not Unique");
			}
		}
		contactList.add(newContact);
	}

	public static void updateFirstName(String uniqueId, String publicFirstName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setFirstName(publicFirstName);
			}
		}
	}
	public static void updateLastName(String uniqueId, String publicLastName) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setLastName(publicLastName);
			}
		}
	}
	public static void updatePhoneNum(String uniqueId, String publicPhone) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setPhone(publicPhone);
			}
		}
	}
	public static void updateAddress(String uniqueId, String publicAddress) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
			contactList.get(i).setAddress(publicAddress);
			}
		}
	}
	// delete contact method
	public static void deleteContact(String uniqueId) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				int position = i;
				contactList.remove(position);
			}
		}
	}
}