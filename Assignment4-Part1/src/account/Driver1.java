package account;

public class Driver1 {
	/**
	 * Driver to test the SavingsAccount class.
	 * @param args
	 */
	public static void main(String args[]) {
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		saver1.setAnnualInterestRate(4);
		saver2.setAnnualInterestRate(4);
		
		System.out.printf("Account information for Saver1: %n");
		saver1.print();
		System.out.printf("The balance in Saver1's account after 1 month is: %.2f %n", saver1.calculateMonthlyInterest());
		System.out.printf("%n");
		
		System.out.printf("Account information for Saver2: %n");
		saver2.print();
		System.out.printf("The balance in Saver2's account after 1 month is: %.2f %n", saver2.calculateMonthlyInterest());
		System.out.printf("%n");
		
		saver1.setAnnualInterestRate(5);
		saver2.setAnnualInterestRate(5);
		
		System.out.printf("Account information for Saver1: %n");
		saver1.print();
		System.out.printf("The balance in Saver1's account after 1 month is: %.2f %n", saver1.calculateMonthlyInterest());
		System.out.printf("%n");
		
		System.out.printf("Account information for Saver2: %n");
		saver2.print();
		System.out.printf("The balance in Saver2's account after 1 month is: %.2f %n", saver2.calculateMonthlyInterest());
		System.out.printf("%n");
		
	}
}

/**
 * Test Case 1: Calculates the monthlyInterestRate for 4% annualInterest and 5% annualInterest
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Account information for Saver1: 
The current balance in the account is: 2000.00 
The current annual interest rate is: 4.00 
The balance in Saver1's account after 1 month is: 2006.67 

Account information for Saver2: 
The current balance in the account is: 3000.00 
The current annual interest rate is: 4.00 
The balance in Saver2's account after 1 month is: 3010.00 

Account information for Saver1: 
The current balance in the account is: 2006.67 
The current annual interest rate is: 5.00 
The balance in Saver1's account after 1 month is: 2015.03 

Account information for Saver2: 
The current balance in the account is: 3010.00 
The current annual interest rate is: 5.00 
The balance in Saver2's account after 1 month is: 3022.54 


 */ 
