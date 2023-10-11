
 /**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */
 
package driver;

import java.util.ArrayList;

import exception.StudentGradingException;
import model.Student;
import util.Util;
import util.Logger;
/**
 * Demonstrates the usage of exception handler in a driver, throwing, logging and fixing the exception
 * @author Pranav Janjanam
 */
public class Driver1 {

	public static void main(String args[]) {
		
		Logger.log("Begin Driver1");
		

		try {
			//test case when input file does not exist
			ArrayList<Student> students = Util.readFile("resources/headerWith42Lines1.txt");
		} catch (StudentGradingException e) {
			Logger.log(e.toString());
		}
		
		try {
			//test case that handles missing quiz scores
			ArrayList<Student>  students= Util.readFile("resources/headerWith42Lines-invalid.txt");
		} catch (StudentGradingException e) {
			Logger.log(e.toString());
		}
		
		try {
			//test case that validates input and generates an exception
			ArrayList<Student>  students = Util.readFile("resources/headerWith42Lines-negativescore.txt");
		} catch (StudentGradingException e) {
			Logger.log(e.toString());
		}
		Logger.log("End Driver1");
	}
}


/**
 * Test Case 1: Input file does not exist
 * --------------------------------------------------------------------------
Log: exception.StudentGradingException: java.io.FileNotFoundException: resources/headerWith42Lines1.txt (No such file or directory) 
 *------------------------------------------------------------------------------
 * Test Case 2: Handles missing quiz scores
 * ---------------------------------------------------------------------------
Missing quiz score for studentID: 1234. Please enter a value: 
39
***Found more than 40 records, ignoring them.
 * --------------------------------------------------------------------------------
 * Test Case 3:  Validates input and generates an exception
 * --------------------------------------------------------------------------------
***Log: exception.StudentGradingException: Invalid test score, it cannot be a negative number 
*/