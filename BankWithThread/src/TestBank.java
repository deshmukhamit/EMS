import java.util.Scanner;


public class TestBank
	{

		public static void main(String[] args)
			{

				BankService service=new BankServiceImpl();
				Scanner scn=new Scanner(System.in);
				
				System.out.println("Welcome to Dena Bank");
				
				System.out.println("********Menu*******");
				System.out.println("1.Create Account");
				System.out.println("2.Show Balance");
				System.out.println("3.Withdraw");

				System.out.println("Enter your first name:");
				String fname=scn.next();
				
				System.out.println("Enter your Last name:");
				String lname=scn.next();
				
				System.out.println("Enter your address:");
				String address=scn.next();
				
				System.out.println("Enter amount to create account");
				float amount=scn.nextFloat();
				
				
				Customer objCust=new Customer(fname,lname,address);
							
							
				service.createAccount(objCust, amount);
				
				BankRunner br=new BankRunner(service);
				
				Thread t1=new Thread(br);
		
				Thread t2=new Thread(br);
				
				t1.start();
				t2.start();
				
			}

	}
