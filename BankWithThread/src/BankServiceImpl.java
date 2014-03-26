import java.util.Random;


public class BankServiceImpl implements BankService
{
Account acc;
	@Override
	public int createAccount(Customer customer, float amount)
	{
	//	Random r = new Random();
		
		int accountNo = 1000; //+ r.nextInt(10000);
		//Creates Account
		Account objAccount=new Account(accountNo,amount,customer);
		
		AccountDaoImpl objADI=new AccountDaoImpl();
		
		objADI.saveAccount(objAccount);
		
		System.out.println("Account is Created with account number :"+accountNo);
		
		return 0;
	}

	@Override
	public float showbalance(int accountNo)
	{
		
		AccountDaoImpl objADImml=new AccountDaoImpl();
		
		acc=objADImml.findAccount(accountNo);
		if (acc!=null)
		{
		float currentbalance= acc.getBalance();
			
			System.out.println("Current balance is:"+currentbalance);
		}
		else
		{
			System.out.println("Account not found");
		//	System.exit(0);
		}
		
			
		
		return 0;
	}

	@Override
	public float  withdraw(int accountNo, float amount)
	{
		//System.out.println("Enter the Account number to withdraw the money:");
		AccountDaoImpl objADI=new AccountDaoImpl();
		synchronized (this ) {
		System.out.println("amt to be deducted:"+amount);
		
		acc=objADI.findAccount(accountNo);
		
		System.out.println("amunt1:"+amount);
		float balance=acc.getBalance();
		
		
		 
		float newBalance=balance-amount;
		
		try
			{
				Thread.sleep(1000);
			}
		catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		acc.setBalance(newBalance);
		}
		System.out.println("New balance is"+acc.getBalance());
		
		
		
		
		
		
		return 0;
		
	}

	@Override
	public float deposit(int accountNo, float amount)
	{
		System.out.println("Enter Account number to deposit the money:");
		
		AccountDaoImpl objADI=new AccountDaoImpl();
		
		acc=objADI.findAccount(accountNo);
		
		float balance=acc.getBalance();
		
		 balance=balance+amount;
		 
		 System.out.println("New balance is"+balance);
		return 0;
	}

}
