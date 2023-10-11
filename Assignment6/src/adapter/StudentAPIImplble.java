/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */

package adapter;

import exception.StudentGradingException;
import model.StudentGrade;
import util.FileIO;
/**
 * Class which implements the studentAPI
 * @author Pranav Janjanam
 */
public abstract class StudentAPIImplble implements StudentAPI {
	/**
	 * Constructor 
	 * @param studentScoresInputFile - The input file for the student you want to find.
	 */
	public StudentAPIImplble(String studentScoresInputFile) {
	
		initialize(studentScoresInputFile);
	}
/**
 * Abstract method which initializes
 * @param studentScoresInputFile - The input file for the student you want to find
 */
	protected abstract void initialize(String studentScoresInputFile);
	/**
	 * Deserializes the file and prints the test scores for the student.
	 */
	public void printScores(int studentID) {
		try {
			System.out.printf("Stud\tQ1\tQ2\tQ3\tQ4\tQ5%n");
			StudentGrade student = FileIO.deseralize(studentID);
			student.print();
		} catch (StudentGradingException e) {
			e.printStackTrace();
		}
		
	}
} 
