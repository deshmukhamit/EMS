package fi.bankserver;


public class Account 
{
	private float balance;
	private int accountNo;
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
		return balance;
	}
	public void setBalance(float balance) 
	{
		this.balance = balance;
	}
	
	private Customer customer;
	
	
}
