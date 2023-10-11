/**	
 * Name - Pranav Janjanam
 * Class - CIS 035A
 * Assignment- Assignment 1 Part 1
 * Due Date - 4/23/21
 * Date Submitted -  4/19/21
 */

package assignment1;
import java.util.Scanner;
/**
 * This is a class that creates a Loan Amortization Schedule based on the user inputting the loan amount, the number of years, and the Annual Interest as a percent.
 * @author Pranav Janjanam
 */
public class LoanAmortizationScedule {
	private int numberOfMonths;
	private double monthlyInterestRate;
	private double loanAmount;
	/**
	 * Constructor - assigns each input to a variable along with any changes needed.
	 * @param loanAmount - the amount of money loaned
	 * @param numberOfYears - The number of years in the loan
	 * @param annualInterestRatePercent - The interest rate given as a percent
	 */
	public LoanAmortizationScedule	(double loanAmount, int numberOfYears, double annualInterestRatePercent) {
		this.numberOfMonths = numberOfYears *12;
		this.monthlyInterestRate = annualInterestRatePercent/(12*100);
		this.loanAmount = loanAmount;
	}
	/**
	 * Prints the schedule and finds the monthly and total payment given each of the inputs.
	 */
	public void printSchedule() {
		// converts the inputs into the amount needed to pay each month
		double monthlyPayment =(loanAmount * monthlyInterestRate * Math.pow(monthlyInterestRate + 1, numberOfMonths))/(Math.pow(monthlyInterestRate + 1,numberOfMonths) - 1);
		//System.out.println("DEBUG: Monthly payment computed:" + monthlyPayment);
		double totalPayment = monthlyPayment * numberOfMonths;

		System.out.println();
		System.out.printf("Monthly Payment: $%.2f %n",monthlyPayment);
		System.out.printf("Total Payment: $%.2f %n",totalPayment);
		System.out.println();

		System.out.printf("The loan amortization schedule for the loan: %n");
		System.out.printf("%-20s %-20s %-20s %-20s %n","Payment #", "Interest","Principal", "Balance");
		System.out.printf("--------------------------------------------------------------------------------%n");
		double balance = loanAmount;
		for(int i = 1; i <= numberOfMonths; i++) {
			double monthlyInterest = monthlyInterestRate*balance;
			double monthlyPrincipal = monthlyPayment-monthlyInterest;
			balance = balance -  monthlyPrincipal;
			System.out.printf("%-20d $%-20.2f $%-20.2f $%-20.2f %n", i ,monthlyInterest,monthlyPrincipal,balance);
		}
	}//end of printSchedule

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double loanAmount = getDoubleInput(input, "Enter the loan amount:");
		int numberOfYears = getIntInput(input, "Enter the number of years:");
		double annualInterestRate = getDoubleInput(input, "Enter the annual interest rate as a percent:");
		LoanAmortizationScedule schedule = new LoanAmortizationScedule(loanAmount,numberOfYears,annualInterestRate);
		schedule.printSchedule();
	}// end of main
	/**
	 * A utility method that asks the user for an input, takes in the input, and returns it as an integer. It also checks if the input is an integer.
	 * @param input - the Scanner object that takes in the input given by the user
	 * @param prompt - The prompt which asks the user for input
	 * @return - Returns the the input as an integer.
	 */
	public static int getIntInput(Scanner input, String prompt) {
		System.out.printf(prompt);
		while (!input.hasNextInt()) {
			System.out.printf("Please enter an integer value");
			input.next();
		}
		int integerInput = input.nextInt();
		return integerInput;
	}// end of getIntInput
	/**
	 * A utility method that asks the user for an input, takes in the input, and returns it as a double. It also checks if the input is a double.
	 * @param input - the Scanner object that takes in the input given by the user
	 * @param prompt - The prompt which asks the user for input
	 * @return - Returns the the input as a double.
	 */
	public static double getDoubleInput(Scanner input, String prompt) {
		System.out.printf(prompt);
		while (!input.hasNextDouble()) {
			System.out.printf("Please enter a valid number");
			input.next();
		}
		double doubleInput = input.nextDouble();
		return doubleInput;
	}// end of getDoubleInput

}//end of class


/**
 * Test Case 1 : Inputs -> Loan Amount:100000/ Number of years: 1/ Interest rate: 7
 * -----------------------------------------------------------------------------------------
  Enter the loan amount:100000
  Enter the number of years:1
  Enter the annual interest rate as a percent:7

  Monthly Payment: $8652.67 
  Total Payment: $103832.10 
  The loan amortization schedule for the loan: 
  Payment #            Interest             Principal            Balance              
  --------------------------------------------------------------------------------
  1                    $583.33               $8069.34              $91930.66             
  2                    $536.26               $8116.41              $83814.25             
  3                    $488.92               $8163.76              $75650.49             
  4                    $441.29               $8211.38              $67439.11             
  5                    $393.39               $8259.28              $59179.83             
  6                    $345.22               $8307.46              $50872.37             
  7                    $296.76               $8355.92              $42516.45             
  8                    $248.01               $8404.66              $34111.79             
  9                    $198.99               $8453.69              $25658.10             
  10                   $149.67               $8503.00              $17155.10             
  11                   $100.07               $8552.60              $8602.49              
  12                   $50.18                $8602.49              $0.00                 

 * Test Case 2: Inputs -> Test Case 1 : Inputs -> Loan Amount:-100000/ Number of years: -1/ Interest rate: -7
 *  --------------------------------------------------------------------------------------------------------------
  Enter the loan amount:-100000
  Enter the number of years:-1
  Enter the annual interest rate as a percent:-7

  Monthly Payment: $8604.08 
  Total Payment: $-103249.00 
  The loan amortization schedule for the loan: 
  Payment #            Interest             Principal            Balance              
  --------------------------------------------------------------------------------


 * Test Case 2: Inputs -> Test Case 1 : Inputs -> Loan Amount:100000/ Number of years: 5/ Interest rate: 2
 *  --------------------------------------------------------------------------------------------------------------
  Enter the loan amount:100000
  Enter the number of years:5
  Enter the annual interest rate as a percent:2

  Monthly Payment: $1752.78 
  Total Payment: $105166.56 

  The loan amortization schedule for the loan: 
  Payment #            Interest             Principal            Balance              
  --------------------------------------------------------------------------------
  1                    $166.67               $1586.11              $98413.89             
  2                    $164.02               $1588.75              $96825.14             
  3                    $161.38               $1591.40              $95233.74             
  4                    $158.72               $1594.05              $93639.68             
  5                    $156.07               $1596.71              $92042.97             
  6                    $153.40               $1599.37              $90443.60             
  7                    $150.74               $1602.04              $88841.57             
  8                    $148.07               $1604.71              $87236.86             
  9                    $145.39               $1607.38              $85629.48             
  10                   $142.72               $1610.06              $84019.42             
  11                   $140.03               $1612.74              $82406.67             
  12                   $137.34               $1615.43              $80791.24             
  13                   $134.65               $1618.12              $79173.12             
  14                   $131.96               $1620.82              $77552.30             
  15                   $129.25               $1623.52              $75928.78             
  16                   $126.55               $1626.23              $74302.55             
  17                   $123.84               $1628.94              $72673.61             
  18                   $121.12               $1631.65              $71041.96             
  19                   $118.40               $1634.37              $69407.58             
  20                   $115.68               $1637.10              $67770.49             
  21                   $112.95               $1639.83              $66130.66             
  22                   $110.22               $1642.56              $64488.10             
  23                   $107.48               $1645.30              $62842.81             
  24                   $104.74               $1648.04              $61194.77             
  25                   $101.99               $1650.78              $59543.98             
  26                   $99.24                $1653.54              $57890.45             
  27                   $96.48                $1656.29              $56234.16             
  28                   $93.72                $1659.05              $54575.10             
  29                   $90.96                $1661.82              $52913.29             
  30                   $88.19                $1664.59              $51248.70             
  31                   $85.41                $1667.36              $49581.34             
  32                   $82.64                $1670.14              $47911.20             
  33                   $79.85                $1672.92              $46238.27             
  34                   $77.06                $1675.71              $44562.56             
  35                   $74.27                $1678.51              $42884.06             
  36                   $71.47                $1681.30              $41202.75             
  37                   $68.67                $1684.10              $39518.65             
  38                   $65.86                $1686.91              $37831.74             
  39                   $63.05                $1689.72              $36142.01             
  40                   $60.24                $1692.54              $34449.48             
  41                   $57.42                $1695.36              $32754.11             
  42                   $54.59                $1698.19              $31055.93             
  43                   $51.76                $1701.02              $29354.91             
  44                   $48.92                $1703.85              $27651.06             
  45                   $46.09                $1706.69              $25944.37             
  46                   $43.24                $1709.54              $24234.84             
  47                   $40.39                $1712.38              $22522.45             
  48                   $37.54                $1715.24              $20807.21             
  49                   $34.68                $1718.10              $19089.12             
  50                   $31.82                $1720.96              $17368.15             
  51                   $28.95                $1723.83              $15644.33             
  52                   $26.07                $1726.70              $13917.62             
  53                   $23.20                $1729.58              $12188.04             
  54                   $20.31                $1732.46              $10455.58             
  55                   $17.43                $1735.35              $8720.23              
  56                   $14.53                $1738.24              $6981.99              
  57                   $11.64                $1741.14              $5240.85              
  58                   $8.73                 $1744.04              $3496.81              
  59                   $5.83                 $1746.95              $1749.86              
  60                   $2.92                 $1749.86              $0.00                 
**/

