//import java.util.ArrayList;


public interface AccountDao
{
	//ArrayList<Account> accountArray=new ArrayList<Account>();
	 Account [] accountArray= new Account[5];
	
	public boolean saveAccount(Account account);
	
	public Account findAccount(int accountNo);


	


}
