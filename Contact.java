package contactService;
//Zachary Mohler 7/12/22
//This class stores a contact for use with the ContactService class
public class Contact
{
	
//data
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	
//constructor
	public Contact(String id, String firstName, String lastName, String phone, String address)
	{
		//verify and set id
		if(id == null || id.length() > 10)
		{
			throw new IllegalArgumentException("invalid value for: id");
		}
		this.id = id;
		
		//verify and set firstName
		if(firstName == null || firstName.length() > 10)
		{
			throw new IllegalArgumentException("invalid value for: firstName");
		}
		this.firstName = firstName;
		
		
		//verify and set lastName
		if(lastName == null || lastName.length() > 10)
		{
			throw new IllegalArgumentException("invalid value for: lastName");
		}		
		this.lastName = lastName;
		
		//verify and set phone
		if(phone == null || phone.length() != 10)
		{
			throw new IllegalArgumentException("invalid value for: phone");
		}
		this.phone = phone;
		
		//verify and set address
		if(address == null || address.length() > 30)
		{
			throw new IllegalArgumentException("invalid value for: address");
		}
		this.address = address;
	}
	

//getters for info
	public String getId()
	{
		return this.id;
	}

	public String getFirstName()
	{
		return this.firstName;
	}
	
	
	public String getLastName()
	{
		return this.lastName;
	}

	public String getPhone()
	{
		return this.phone;
	}
	
	public String getAddress()
	{
		return this.address;
	}	
	
	
//setters for info allowing updates
	public void setFirstName(String newFirst)
	{
		//verify and set firstName
		if(newFirst == null || newFirst.length() > 10)
		{
			throw new IllegalArgumentException("invalid value for: firstName");
		}
		this.firstName = newFirst;
	}
	
	
	public void setLastName(String newLast)
	{
		//verify and set lastName
		if(newLast == null || newLast.length() > 10)
		{
			throw new IllegalArgumentException("invalid value for: lastName");
		}
		this.lastName = newLast;
	}

	public void setPhone(String newPhone)
	{
		//verify and set phone
		if(newPhone == null || newPhone.length() != 10)
		{
			throw new IllegalArgumentException("invalid value for: phone");
		}
		this.phone = newPhone;
	}
	
	public void setAddress(String newAddress)
	{
		//verify and set address
		if(newAddress == null || newAddress.length() > 30)
		{
			throw new IllegalArgumentException("invalid value for: address");
		}
		this.address = newAddress;
	}
	
}
