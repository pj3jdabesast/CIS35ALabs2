package account;

public class Driver2 {
	/**
	 * Driver to test the SavingsAccount class after implementing the new changes.
	 */
	public static void main(String args[]) {
		SavingsAccount saver1 = new SpecialSavings(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.setAnnualInterestRate(4);
		
		System.out.printf("Account information for Saver1:");
		saver1.print();
		System.out.printf("%n");
		
		System.out.printf("Account information for Saver2:");
		saver2.print();
		System.out.printf("%n");
		
		System.out.printf("The balance in Saver1's account after 1 month is: %.2f %n",saver1.calculateMonthlyInterest());
		System.out.printf("The balance in Saver2's account after 1 month is: %.2f %n",saver2.calculateMonthlyInterest());
		System.out.printf("%n");
		
		SavingsAccount.setAnnualInterestRate(5);
		
		System.out.printf("Account information for Saver1:");
		saver1.print();
		System.out.printf("%n");
		
		System.out.printf("Account information for Saver2:");
		saver2.print();
		System.out.printf("%n");
		
		System.out.printf("The balance in Saver1's account after 1 month is: %.2f %n",saver1.calculateMonthlyInterest());
		System.out.printf("The balance in Saver2's account after 1 month is: %.2f %n",saver2.calculateMonthlyInterest());
		System.out.printf("%n");
		
		saver1.depositBalance(10000);
		saver2.depositBalance(10000);
		
		System.out.printf("Account information for Saver1 after depositing 10000:%n");
		saver1.print();
		System.out.printf("%n");
		
		System.out.printf("Account information for Saver2  after depositing 10000: %n");
		saver2.print();
		System.out.printf("%n");
		
		saver1.withdrawBalance(1000);
		saver2.withdrawBalance(1000);
		
		System.out.printf("Account information for Saver1 after withdrawing 1000: %n");
		saver1.print();
		System.out.printf("%n");
		
		System.out.printf("Account information for Saver2  after depositing 1000: %n");
		saver2.print();
		System.out.printf("%n");
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		
		System.out.printf("Account information for Saver1 after calculating one month interest. Saver1 is SpecialSavings Account %n");
		saver1.print();
		System.out.printf("%n");
		
		System.out.printf("Account information for Saver2  after calculating one month interest. Saver2 is Regular Savings Account %n");
		saver2.print();
		System.out.printf("%n");
		
		
		
	}
	
	
}

/**
 *Test Case 1: Calculates the monthlyInterest for 4%, deposits money into the account, changes the annualInterestRate to 10% for saver 1, withdraws money from the account.
 *+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Account information for Saver1:
The current balance in the account is: 2000.00 
The current annual interest rate is: 4.00 

Account information for Saver2:
The current balance in the account is: 3000.00 
The current annual interest rate is: 4.00 

The balance in Saver1's account after 1 month is: 2006.67 
The balance in Saver2's account after 1 month is: 3010.00 

Account information for Saver1:
The current balance in the account is: 2006.67 
The current annual interest rate is: 5.00 

Account information for Saver2:
The current balance in the account is: 3010.00 
The current annual interest rate is: 5.00 

The balance in Saver1's account after 1 month is: 2015.03 
The balance in Saver2's account after 1 month is: 3022.54 

Account information for Saver1 after depositing 10000:
The current balance in the account is: 12015.03 
The current annual interest rate is: 10.00 

Account information for Saver2  after depositing 10000:
The current balance in the account is: 13022.54 
The current annual interest rate is: 5.00 

Account information for Saver1 after withdrawing 1000:
The current balance in the account is: 11015.03 
The current annual interest rate is: 10.00 

Account information for Saver2  after depositing 1000:
The current balance in the account is: 12022.54 
The current annual interest rate is: 5.00 

Account information for Saver1 after calculating one month interest. Saver1 is SpecialSavings Account 
The current balance in the account is: 11106.82 
The current annual interest rate is: 10.00 

Account information for Saver2  after calculating one month interest. Saver2 is Regular Savings Account 
The current balance in the account is: 12072.64 
The current annual interest rate is: 5.00 
*/