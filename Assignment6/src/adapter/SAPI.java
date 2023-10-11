/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */

package adapter;

import java.util.ArrayList;
import java.util.Arrays;

import exception.StudentGradingException;
import model.Statistics;
import model.Student;
import model.StudentGrade;
import util.FileIO;
import util.Util;
/**
 * Class which initializes the StudentAPI Implementation
 * @author Pranav Janjanam
 */
public class SAPI extends StudentAPIImplble{
	private Statistics studentStats;
	/**
	 * Constructor
	 * @param StudentScoresInputFile - Constructor whicch takes StudentScoresInputFIle as an argument
	 */
	public SAPI(String StudentScoresInputFile) {
		super(StudentScoresInputFile);
	}
	/**
	 * Initialies using the inputFile for the wanted student
	 */
	protected void initialize(String studentScoresInputFile) {
		try {
			
			ArrayList<Student> students = new ArrayList<Student>();
			Student[] studentArray = (Student[]) students.toArray();
			students = Util.readFile(studentScoresInputFile);
			
		
		
		studentStats = new Statistics();
		int counter = 0;
		for (int i = 0; i <studentArray.length; i++) {
			if (studentArray[i] != null) {
				counter++;
			}
		}
		
		
		studentStats.findLow(studentArray);
		studentStats.findHigh(studentArray);
		studentStats.findAvg(studentArray);
		
			for (int i = 0; i< studentArray.length; i++) {
				StudentGrade student = new StudentGrade(studentArray[i], studentStats);
				FileIO.seralize(student);
			}
			
		} catch (StudentGradingException e) {
			e.printStackTrace();
			
		}
	}

/**
 * Prints the statistics for the student
 */
	public void printStatistics() {
		studentStats.print();		
	}
	
}
