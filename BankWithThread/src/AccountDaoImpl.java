


public class AccountDaoImpl implements AccountDao
{
	private int counter=0;
	private int index=0;		
	@Override
	public boolean saveAccount(Account account)
	{
		if (index<5)
		{

			accountArray[index]=account;
			System.out.println(accountArray[0]);
			index++;
			counter++;
		
			return true;
			
		}
		else
		{
			System.out.println("Can not create account,Please try later..!");
			return false;
		}
		
		
	}

	@Override
	public Account findAccount(int accountNo)
	{
	//	System.out.println(index);
		for (int i = 0; i <=counter; i++)
		{
			if (accountArray[i].getAccountNo()==accountNo)
			{
				
				System.out.println(accountArray[i].getAccountNo()+"Account is found");
				
				//Account acc=accountArray[i].getBalance();
					
			//	System.out.println("Balance is"+accountArray[i].getBalance());
			
				return accountArray[i];
				
			}
		}
		
	
		
		return null;
		
		/*
			else
			{
				System.out.println("Account not found..");
				return null;
			}
		*/
	//	return accountArray[index];
		
	}


}
