
public class BankRunner implements Runnable
	{
		BankService service;
		
		public BankRunner(BankService service)
		{
			super();
			this.service = service;
		}


		
		

		@Override
		public void run()
			{
				
				System.out.println(service.withdraw(1000, 1500));
				
				
			}

	}
