package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest
{

//test initialization 
	@Test
	void testContactConstructor()
	{
		//initialize correctly instantiated contact to test. This also tests the get methods in Contact
		Contact toTest = new Contact("44", "Jerry", "West", "3235550010", "3900 W Manchester Blvd");
		
		//test each data element to ensure it was assigned
		assertTrue(toTest.getId().equals("44"));
		assertTrue(toTest.getFirstName().equals("Jerry"));
		assertTrue(toTest.getLastName().equals("West"));
		assertTrue(toTest.getPhone().equals("3235550010"));
		assertTrue(toTest.getAddress().equals("3900 W Manchester Blvd"));
	}
	
//test setters actually set
	@Test
	void testSetters()
	{
		//initialize correctly instantiated contact to test
		Contact toTest = new Contact("6", "Jerry", "West", "3235550010", "3900 W Manchester Blvd");
	
		//reset setable data
		toTest.setFirstName("Bill");
		toTest.setLastName("Russell");
		toTest.setPhone("6175550010");
		toTest.setAddress("150 Causeway Street");
		
		//test that each element was indeed changed
		assertTrue(toTest.getFirstName().equals("Bill"));
		assertTrue(toTest.getLastName().equals("Russell"));
		assertTrue(toTest.getPhone().equals("6175550010"));
		assertTrue(toTest.getAddress().equals("150 Causeway Street"));
	}
	
	
//test lengths (initialization)
	@Test
	void testIdLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("01234567891", "ok", "ok", "okphonelen", "ok");});
	}
	
	@Test
	void testFirstLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "01234567891", "ok", "okphonelen", "ok");});		
	}
	
	@Test
	void testLastLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "ok", "01234567891", "okphonelen", "ok");});		
	}

	@Test
	void testPhoneTooShort()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "ok", "ok", "bad", "ok");});		
	}

	@Test
	void testPhoneTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "ok", "ok", "01234567891", "ok");});		
	}
	
	@Test
	void testAddressLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "ok", "ok", "okphonelen", "0123456789123456789123456789123");});		
	}
	
//null input tests (initialization)
	@Test
	void testIdNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact(null, "ok", "ok", "okphonelen", "ok");});
	}
	
	@Test
	void testFirstNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", null, "ok", "okphonelen", "ok");});		
	}
	
	@Test
	void testLastNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "ok", null, "okphonelen", "ok");});		
	}

	@Test
	void testPhoneNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "ok", "ok", null, "ok");});		
	}
	
	@Test
	void testAddressNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {new Contact("ok", "ok", "ok", "okphonelen", null);});		
	}

//initialize correctly instantiated contact to test with setters
Contact toTestSetters = new Contact("44", "Jerry", "West", "3235550010", "3900 W Manchester Blvd");	
	
//test lengths (setters)
	@Test
	void testSetFirstLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setFirstName("01234567891");});		
	}
	
	@Test
	void testSetLastLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setLastName("01234567891");});		
	}

	@Test
	void testSetPhoneTooShort()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setPhone("bad");});		
	}

	@Test
	void testSetPhoneTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setPhone("01234567891");});		
	}
	
	@Test
	void testSetAddressLength()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setAddress("1234567890123456789012345678901");});		
	}
	
//null input tests (setters)
	@Test
	void testSetFirstNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setFirstName(null);});		
	}
	
	@Test
	void testSetLastNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setLastName(null);});		
	}

	@Test
	void testSetPhoneNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setPhone(null);});		
	}
	
	@Test
	void testSetAddressNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {toTestSetters.setAddress(null);});		
	}
	

}
