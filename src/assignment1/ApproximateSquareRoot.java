/**	
 * Name - Pranav Janjanam
 * Class - CIS 035A
 * Assignment- Assignment 1 Part 2
 * Due Date - 4/23/21
 * Date Submitted - 4/19/21
 */

package assignment1;
import java.util.Scanner;

/**
 * A method which asks the user for an input value and finds the square root of the given input.
 */
public class ApproximateSquareRoot {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        long n = getLongInput(input,"Enter a long value to find the square root of:");
        System.out.printf("The approximated square root of %d is %.4f %n",n, approximateSquareRoot(n));
    }//end of main
	
	/**
	 * A method which uses a do/while loop to convert a given long into an approximated square root
	 * @param n - The long value inputed by the user
	 * @return - Returns the square rooted long value
	 */
    public static double approximateSquareRoot(long n){
    	if(n==0) {
    		return 0;
    	}
    		
        double lastGuess, nextGuess = n/2.0;
        do{
        	lastGuess = nextGuess;
             nextGuess = (lastGuess + n/lastGuess)/2;            
         } while(Math.abs(nextGuess-lastGuess) > 0.0001);
        //end of do/while loop
        return nextGuess;
    }//end of approximateSquareRoot method
    
    /**
     * A utility method that asks the user for input, takes in the input, returns the input, and checks whether the given input is valid.
     * @param input - the Scanner object that takes in the input given by the user
     * @param prompt - The prompt given to the user to receive an long value
     * @return - returns the long value
     */
    public static long getLongInput(Scanner input, String prompt) {
    	long longInput = -1;
		System.out.printf(prompt);
		while (!input.hasNextLong() || (longInput=input.nextLong()) < 0) {
			System.out.printf("Invalid input - Please enter a positive integer input:");
			if(!input.hasNextLong()) {
				input.next();
			}
		}//end of while loop
		
		return longInput;
    }//end off getLongInput method
    
}//end of class


/**
 * Test Case 1 : input a big positive integer
 * ---------------------------------------------
   Enter a long value to find the square root of:837418
   The approximated square root of 837418 is 915.1055 
  
 * Test Case 2: input a negative number
 * -------------------------------------------
   Enter a long value to find the square root of:-1
   Invalid input - Please enter a positive integer input:4
   The approximated square root of 4 is 2.0000 
   
 * Test Case 3: input 0
 * -------------------------------------------
   Enter a long value to find the square root of:0
   The approximated square root of 0 is 0.0000 
   
 * Test Case 3: input a decimal
 * -------------------------------------------
   Enter a long value to find the square root of:34.23
   Invalid input - Please enter a positive integer input:81
   The approximated square root of 81 is 9.0000 
 **/
