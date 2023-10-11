/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */

package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

import exception.StudentGradingException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import model.Student;
import model.StudentGrade;
/**
 * Class which reads the file, reads each line, tokenizes the string, converts each token to an integer, then saved in the students array.
 * @author Pranav Janjanam
 *
 */
public class Util {
	
	/**
	 * reads the file, reads each line, tokenizes the string, converts each token to an integer, then saved in the students array.
	 * @param fileName - The name of the file being read
	 * @param students - the students array being populated
	 * @return - the populated student array
	 */
	public static ArrayList<Student> readFile(String fileName) throws StudentGradingException{
		ArrayList<Student> students = new ArrayList<Student>();
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader buff = new BufferedReader(file);
			int lineCount = 0;
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				//System.out.println("Line read:" + line);
				if (line == null) {
					eof = true;
				}else {
					lineCount++;
					if (lineCount == 1) {
						continue;
					}		
					
					StringTokenizer st = new StringTokenizer(line);
					//System.out.println("Tokenized String:" + st);
					while (st.hasMoreTokens()) {
						Student newStudent = new Student();
						newStudent.setStudentID(Integer.parseInt(st.nextToken()));
						
						int[] scores = new int[5];
						for (int i =0; i < scores.length; i++) {
							try {
								
							
							int score = Integer.parseInt(st.nextToken());
							
							if(score < 0) {
								throw new StudentGradingException("Invalid test score, it cannot be a negative number");
							}
							scores[i] = score;
							} catch (NoSuchElementException e) {
								//Handle exception, take user input for missing quiz values
								Scanner input = new Scanner(System.in);								
								System.out.printf("Missing quiz score for studentID: %d. Please enter a value: %n", newStudent.getStudentID());
								int score = input.nextInt();
								scores[i]= score;
							}
							
						}
 						newStudent.setScores(scores);
 						students.add(newStudent); 					
					}
				}
					
			}
			buff.close();
			
		} catch (FileNotFoundException e) {
			Logger.log("Error: File with name " + fileName + " was not found. More detail:" + e.toString());
			throw new StudentGradingException(e);
		} catch (IOException e) {
			Logger.log("Error: writing to file  " + fileName + " was not found. More detail:" + e.toString());
			throw new StudentGradingException(e);
		} catch (NoSuchElementException e) {
			Logger.log("Invalid File contents, each line in file should have StudentID and scores for each of 5 quizzes");
			throw new StudentGradingException("Invalid File contents, each line in file should have StudentID and scores for each of 5 quizzes");
		}
		
		return students;
	}
}
