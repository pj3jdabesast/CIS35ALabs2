/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */

package driver;

import adapter.SAPI;
import adapter.StudentAPI;
/**
 * Class which demonstrates the usage of the API.
 * @author Pranav Janjanam
 */
import util.Logger;
public class Driver3 {
	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String args[]) {
		
		Logger.log("Begin Driver3");
		StudentAPI sAPI = new SAPI("resources/headerWith15Lines.txt");
		sAPI.printStatistics();
		sAPI.printScores(1234);
		
		Logger.log("End Driver3");
	}
}
/**
 * Test Case 1: Prints the statistics and the scores for the student given the ID from the user using the StudentAPI.
 * -----------------------------------------------------------------------------------------------
The lowest scores for each quiz are: 0 7 0 32 10

The highest scores for each quiz are: 100 100 100 90 80

The average scores for each quiz are: 46.2 42.3 70.5 75.7 49.7

Stud	Q1	Q2	Q3	Q4	Q5
1234	52	7	100	78	34
The lowest scores for each quiz are: 0 7 0 32 10

The highest scores for each quiz are: 100 100 100 90 80

The average scores for each quiz are: 46.2 42.3 70.5 75.7 49.7
 */

