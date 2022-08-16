package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

class ContactServiceTest
{

//test initialization is working, also tests getContacts method
	@Test
	void testInitialized()
	{
		ContactService contacts = new ContactService();
		
		assertTrue(contacts.getContacts().size() == 0);
	}
	
//test add (shallow test)
	@Test
	void testAdd()
	{
		ContactService contacts = new ContactService();
		Contact toAdd = new Contact("13", "Wilt", "Chamberln", "1231231234", "some place");
		
		contacts.addContact(toAdd);
		
		assertTrue(contacts.getContacts().size() != 0);
	}
	
//test edits of info (ContactService uses Contact's setter methods, so no need to test them here, only need to test that changes were made)
	@Test
	void testChangeFirst()
	{
		//init stuff
		ContactService contacts = new ContactService();
		Contact toAdd = new Contact("13", "Wilt", "Chamberln", "1231231234", "some place");
		contacts.addContact(toAdd);

		//make change
		contacts.changeFirstName("13", "some other");
		//test
		assertTrue(contacts.getContacts().get(0).getFirstName().equals("some other"));
	}
	
	@Test
	void testChangeLast()
	{
		//init stuff
		ContactService contacts = new ContactService();
		Contact toAdd = new Contact("13", "Wilt", "Chamberln", "1231231234", "some place");
		contacts.addContact(toAdd);

		//make change
		contacts.changeLastName("13", "some other");
		//test
		assertTrue(contacts.getContacts().get(0).getLastName().equals("some other"));
	}
	
	@Test
	void testChangePhone()
	{
		//init stuff
		ContactService contacts = new ContactService();
		Contact toAdd = new Contact("13", "Wilt", "Chamberln", "1231231234", "some place");
		contacts.addContact(toAdd);

		//make change
		contacts.changePhone("13", "someotherp");
		//test
		assertTrue(contacts.getContacts().get(0).getPhone().equals("someotherp"));
	}
	
	@Test
	void testChangeAddress()
	{
		//init stuff
		ContactService contacts = new ContactService();
		Contact toAdd = new Contact("13", "Wilt", "Chamberln", "1231231234", "some place");
		contacts.addContact(toAdd);

		//make change
		contacts.changeAddress("13", "some other place");
		//test
		assertTrue(contacts.getContacts().get(0).getAddress().equals("some other place"));
	}
	
	@Test
	void testDeleteMethod()
	{
		//init stuff
		ContactService contacts = new ContactService();
		Contact toAdd = new Contact("13", "Wilt", "Chamberln", "1231231234", "some place");
		contacts.addContact(toAdd);
		
		//remove contact
		contacts.deleteContact(toAdd);
		
		assertFalse(contacts.getContacts().contains(toAdd));
		
	}
}
