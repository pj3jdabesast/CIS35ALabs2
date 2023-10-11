/**
 *  Assignment: Assignment0 - Part2
 *  Student: Pranav Janjanam
 *  Course: CIS D035A
 *  
 */

package assignment0;
import java.util.Scanner;
/*
 * This is a class that converts between two temperatures, Celcius and Farenheit, by taking input from the user on which type of temperature they want to convert to. 
 */
public class TemperatureConverter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String answer = "yes";

		while (answer.equalsIgnoreCase("yes")) {			

			System.out.printf("What type of temperature do you want to convert to? Enter C for Celcius or F for Farenheit %n");
			String choice = input.next();

			//Using Ignore Case to make it more user friendly.
			 if (choice.equalsIgnoreCase("Farenheit") || choice.equalsIgnoreCase("F")) {
				System.out.printf("Enter a celcius value to convert to Farenheit%n");
				double celcius = input.nextDouble();

				System.out.printf("%.1f degrees Celcius in Farenheit: %.1f %n",celcius,toFarenheit(celcius));
			}else if (choice.equalsIgnoreCase("Celcius") || choice.equalsIgnoreCase("C") ){
				System.out.printf("Enter a farenheit value to convert to celcius%n");
				double farenheit = input.nextDouble();

				System.out.printf("%.1f degrees Farenheit in Celcius: %.1f %n",farenheit, toCelcius(farenheit));
			} else{ //If an incorrent input value is entered by user, it will prompt the user and continue
				System.out.printf("Please enter a valid input, C for Celcius or F for Farenheit. %n");
				continue;
			} //end of if statement
			System.out.println();
			System.out.printf("Do you want to convert another value (yes or no)? %n");
			answer = input.next();
		}//end of while
	}//end of main

	/**
	 * Converts a celcius value to a farenheit value.
	 * @param celcius - The celcius value inputted by the user.
	 * @return - returns the converted farenheit value.
	 */
	public static double toFarenheit(double celcius) {
		double farenheit = 32 + celcius*(180.0/100.0);
		return farenheit;
	}//end of toFarenheit

	/**
	 * Converts a farenheit value to a celcius value.
	 * @param farenheit - The farenheit value inputted by the user.
	 * @return - returns the converted celcius value
	 */
	public static double toCelcius(double farenheit) {
		double celcius = (farenheit-32)/(180.0/100.0);
		return celcius;
	}//end of toCelcius

}// end of class



