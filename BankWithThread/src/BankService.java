
public interface BankService
{
	public int createAccount(Customer c,float amount);
	
	public float showbalance(int accountNo);
	
	public float withdraw(int accountNo,float amount);
	
	public float deposit(int accountNo,float amount);
}
