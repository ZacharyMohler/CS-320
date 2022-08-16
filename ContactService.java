package contactService;
import java.util.ArrayList;
import java.util.List;

//Zachary Mohler 7/12/22
//this class utilizes the Contact class to create a list of contacts of type Contact
public class ContactService
{
	
//data
	private List<Contact> contacts = new ArrayList<Contact>();  
	
	
//constructor (default empty contacts list)
	public ContactService()
	{
		
	}
	
	
//contact add method
	public void addContact(Contact toAdd)
	{
		this.contacts.add(toAdd);
	}
	
	
//contact delete method
	public void deleteContact(Contact toRemove)
	{
		//search list of contacts for id
		for(int i = 0; i < this.contacts.size(); i++)
		{
			//if found remove
			if(this.contacts.get(i).getId().equals(toRemove.getId()))
			{
				this.contacts.remove(i);
			}
		}
	}
	
	
//edit info based on id methods
	public void changeFirstName(String id, String newFirst)
	{
		//search list of contacts for id
		for(int i = 0; i < this.contacts.size(); i++)
		{
			//if found change
			if(this.contacts.get(i).getId().equals(id))
			{		
				this.contacts.get(i).setFirstName(newFirst);
			}
		}
	}
	

	public void changeLastName(String id, String newLast)
	{
		//search list of contacts for id
		for(int i = 0; i < this.contacts.size(); i++)
		{
			//if found change
			if(this.contacts.get(i).getId().equals(id))
			{		
				this.contacts.get(i).setLastName(newLast);
			}
		}
	}
	
	
	public void changePhone(String id, String newPhone)
	{
		//search list of contacts for id
		for(int i = 0; i < this.contacts.size(); i++)
		{
			//if found change
			if(this.contacts.get(i).getId().equals(id))
			{		
				this.contacts.get(i).setPhone(newPhone);
			}
		}
	}
	
	
	public void changeAddress(String id, String newAddress)
	{
		//search list of contacts for id
		for(int i = 0; i < this.contacts.size(); i++)
		{
			//if found change
			if(this.contacts.get(i).getId().equals(id))
			{		
				this.contacts.get(i).setAddress(newAddress);
			}
		}
	}
	
	public List<Contact> getContacts()
	{
		return contacts;
	}
	
}
