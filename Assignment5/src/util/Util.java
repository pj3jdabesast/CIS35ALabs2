/**
 * Name - Pranav Janjanam
 * Class - CIS D035A
 * Assignment Number - Lab 5
 * Date Due - 06/02/21
 * Date Submitted - 05/30/21
 */

package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

import model.Student;
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
	public static Student[] readFile(String fileName, Student[] students) {
		
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader buff = new BufferedReader(file);
			int counter = 0;
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
					if (lineCount > 41) {
						System.out.printf("***Found more than 40 records, ignoring them.%n***");
						break;
						
					}
					StringTokenizer st = new StringTokenizer(line);
					//System.out.println("Tokenized String:" + st);
					while (st.hasMoreTokens()) {
						Student newStudent = new Student();
						newStudent.setStudentID(Integer.parseInt(st.nextToken()));
						
						int[] scores = new int[5];
						for (int i =0; i < scores.length; i++) {
							scores[i] = Integer.parseInt(st.nextToken());
						}
 						newStudent.setScores(scores);
 						students[counter] = newStudent;
 						//newStudent.print();
 						counter++;
					}
				}
					
			}
			buff.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.printf("Error-- %s", e.toString());
		}
		
		return students;
	}
}
