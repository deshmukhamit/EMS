import java.util.Scanner;


public class BankClient
{

	/*public static void main(String[] args)
	{
		BankServiceImpl objBS=new BankServiceImpl();
		byte choice;
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		
		do
		{
		System.out.println("Welcome to Dena Bank");
		
		System.out.println("********Menu*******");
		System.out.println("1.Create Account");
		System.out.println("2.Show Balance");
		System.out.println("3.Withdraw");
		System.out.println("4.Deposit");
		System.out.println("Enter your choice");
		
		 choice=scn.nextByte();
		
		switch (choice)
		{
		case 1:System.out.println("Enter your first name:");
		String fname=scn.next();
		
		System.out.println("Enter your Last name:");
		String lname=scn.next();
		
		System.out.println("Enter your address:");
		String address=scn.next();
		
		System.out.println("Enter amount to create account");
		float amount=scn.nextFloat();
		
		
		Customer objCust=new Customer(fname,lname,address);
				
	
		//Create Account
		objBS.createAccount(objCust, amount);
	
			break;

			case 2:
				System.out.println("Please enter Account number to Check the balance:");
			
				int acc=scn.nextInt();
				
				objBS.showbalance(acc);
			break;
			
			case 3:
				System.out.println("3.Withdraw");
				
				System.out.println("Please Enter Account number:");
				int account=scn.nextInt();
							
				System.out.println("Please Enter amount:");
				float amnt=scn.nextFloat();
				
				objBS.withdraw(account, amnt);
			break;
			
			case 4:
				
				System.out.println("Please Enter Account number:");
				int accountDepo=scn.nextInt();
				
				System.out.println("Please Enter amount to Deposit:");
				float amountDepo=scn.nextFloat();
			
				objBS.deposit(accountDepo, amountDepo);
				
			break;
				
		default:
			System.out.println("Please Enter valid Choice!!!!");
			break;
		}
		}while (choice!=5);
		
		
		
		
			}*/

}
