/**	
 * Name - Pranav Janjanam
 * Class - CIS 035A
 * Assignment- Assignment 4 Part 1
 * Due Date - 5/25/21
 * Date Submitted -  5/24/21
 */

package account;
/**
 * Child class of SavingsAccount to implement a different interest rate when balance is above 10k.
 * @author Pranav Janjanam
 *
 */
public class SpecialSavings extends SavingsAccount {
	
	private static double specialInterestRate = 10;
	/**
	 * Default Constructor
	 */
	public SpecialSavings() {
		super();
	}
	/**
	 * Overloaded Constructor
	 * @param balance
	 */
	public SpecialSavings(double balance) {
		super(balance);
	}
	/**
	 * Overridden Method that calculates the monthly interest with the new parameters
	 */
	public double calculateMonthlyInterest() {
		double interestRate = effectiveInterestRate();
		double monthlyInterest =  getSavingsBalance() * (interestRate/100/12.0);
		setSavingsBalance(getSavingsBalance() + monthlyInterest);
		return getSavingsBalance();		
	}
	/**
	 * Method to implement the change of the interest rate when balance is more than 10K
	 * @return - returns the new interest rate
	 */
	private double effectiveInterestRate() {
		double interestRate = super.getAnnualInterestRate();
		if(getSavingsBalance() >= 10000) {
			interestRate = specialInterestRate;
		}
		return interestRate;
	}
	/**
	 * Overriddden print function to print the new values.
	 */
	public void print() {
		
		System.out.printf("The current balance in the account is: %.2f %n", getSavingsBalance());
		System.out.printf("The current annual interest rate is: %.2f %n",effectiveInterestRate());
	}
	
}
