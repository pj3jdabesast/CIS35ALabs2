/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */
package driver;

import java.util.ArrayList;
import java.util.Arrays;

import exception.StudentGradingException;
import model.Statistics;
import model.Student;
import model.StudentGrade;
import util.FileIO;
import util.Logger;
import util.Util;
/**
 * Driver which demonstrates serializing and deserializing the StudentGrade object 
 * @author Pranav Janjanam
 */
public class Driver2 {
	
	public static void main(String args[])  {
		
		Logger.log("Begin Driver2");
		
		ArrayList students = new ArrayList();
		students.add(students);
		Student[] studentsArray = (Student[]) students.toArray();
		
		//Student[] studentsArray = new Student[40];
		
		try {
			students = Util.readFile("resources/headerWith15Lines.txt");
		
		
		Statistics statStudents = new Statistics();
		int counter = 0;
		for(int i = 0; i < studentsArray.length; i++) {
			if (students.get(i) != null) {
				counter++;
			}
		}
		
		statStudents.findLow(studentsArray);
		statStudents.findHigh(studentsArray);
		statStudents.findAvg(studentsArray);
		
		
		for (int i = 0; i< studentsArray.length; i++) {
			StudentGrade student = new StudentGrade(studentsArray[i],statStudents);
			FileIO.seralize(student);
		}
		
		System.out.printf("Stud\tQ1\tQ2\tQ3\tQ4\tQ5%n");
		StudentGrade student = FileIO.deseralize(1234);
		student.print();
		} catch (StudentGradingException e) {
			Logger.log("Error processing student objects. More detail:" + e.toString());

		}	
		
		Logger.log("End Driver2");
	}
	
}

/**
 * Test Case 1: Serailize all student objects from a text file and prints the given student (with ID 1234) object by deserailizing the student record.
 * ----------------------------------------------------------------------------------------------------------------------------------------------------
Stud	Q1	Q2	Q3	Q4	Q5
1234	52	7	100	78	34
The lowest scores for each quiz are: 0 7 0 32 10

The highest scores for each quiz are: 100 100 100 90 80

The average scores for each quiz are: 46.2 42.3 70.5 75.7 49.7
 */


