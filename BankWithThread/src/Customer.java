
public class Customer 
{
	private String fName;
	private String lName;
	private String address;
	
	
	
	
	
	public Customer()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String fName, String lName, String address)
	{
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	public String getfName()
	{
		return fName;
	}
	public void setfName(String fName)
	{
		this.fName = fName;
	}
	public String getlName()
	{
		return lName;
	}
	public void setlName(String lName)
	{
		this.lName = lName;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	

}
