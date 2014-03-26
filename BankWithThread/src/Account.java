
public class Account
{
	private int accountNo;
	private float amount;
	private Customer customer;
	private Transaction trans;
	
		
	public Account()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Account(int accountNo, float amount, Customer customer)
	{
		super();
		this.accountNo = accountNo;
		this.amount = amount;
		this.customer = customer;
	}





	public int getAccountNo()
	{
		return accountNo;
	}
	public void setAccountNo(int accountNo)
	{
		this.accountNo = accountNo;
	}
	public float getBalance()
	{
		return amount;
	}
	public void setBalance(float balance)
	{
		this.amount = balance;
	}
	public Customer getCustomer()
	{
		//Customer cust=new Customer();
		return customer;
	}
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	
}
