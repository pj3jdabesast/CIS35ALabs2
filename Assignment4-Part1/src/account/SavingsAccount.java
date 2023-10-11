/**	
 * Name - Pranav Janjanam
 * Class - CIS 035A
 * Assignment- Assignment 4 Part 1
 * Due Date - 5/25/21
 * Date Submitted -  5/24/21
 */

package account;
/**
 * This is a parent class which calculates the monthly interest of an account using the balance and annual interest rate.
 * @author Pranav Janjanam
 */
public class SavingsAccount {
	private double savingsBalance;
	private static double annualInterestRate;
	/**
	 * Default Constructor
	 */
	public SavingsAccount() {
		
	}
	/**
	 * Overrided Constructor
	 * @param savingsBalance
	 */
	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	/**
	 * @return the savingsBalance
	 */
	public double getSavingsBalance() {
		return savingsBalance;
	}

	/**
	 * @param sets the savingsBalance
	 */
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	/**
	 * @return the annualInterestRate
	 */
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * @param sets the annualInterestRate
	 */
	public static void setAnnualInterestRate(int annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	/**
	 * Prints the current balance and the annual interest for each account.
	 */
	public void print() {
		System.out.printf("The current balance in the account is: %.2f %n", savingsBalance);
		System.out.printf("The current annual interest rate is: %.2f %n",annualInterestRate);
	}
	
	/**
	 * Calculates the amount in balance after one month.
	 * @return - the balance in the bank after one month of interest.
	 */
	public double calculateMonthlyInterest() {
		double monthlyInterest =  savingsBalance * (annualInterestRate/100/12.0);
		savingsBalance = savingsBalance + monthlyInterest;
		return savingsBalance;
	}
	
	/**
	 * Changes the interest rate from the current one to a new one.
	 * @param newInterestRate - the new interest rate wanted by the user.
	 * @return - the new interest rate.
	 */
	public static double modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
		return annualInterestRate;
	}
	
	/**
	 * Deposits money inputted by the user
	 * @param depositMoney - The amount of money wanted deposited.
	 * @return - the new balance with the deposited money.
	 */
	public double depositBalance (double depositMoney) {
		savingsBalance = savingsBalance + depositMoney;
		return savingsBalance;
	}
	
	/**
	 * Withdraws money from the account 
	 * @param withdrawAmount - the amount of money withdrew
	 * @return - the balance with the money withdrew
	 */
	public double withdrawBalance (double withdrawAmount) {
		savingsBalance = savingsBalance - withdrawAmount;
		return savingsBalance;
		
	}
}
