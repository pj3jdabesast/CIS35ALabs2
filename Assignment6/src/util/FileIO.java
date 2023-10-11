/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import exception.StudentGradingException;
import model.StudentGrade;
/**
 * Class which seralizes a StudentGrade object to a file and deseralizes it.
 * @author Pranav Janjanam
 */
public class FileIO {
	/**
	 * Serializes the StudentGrade object to a file
	 * @param student - The Student grade object
	 * @throws StudentGradingException - The custom exception thrown when the file is unable to be created.
	 */
	public static void seralize(StudentGrade student) throws StudentGradingException {
		String fileName = "out/" + student.getStudent().getStudentID() +".ser";
		
		try {
			FileOutputStream outputStream = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(outputStream);
			
			oos.writeObject(student);
			oos.close();
			
		// Created StudentGradingException from underlying IO Exceptions	
		} catch (FileNotFoundException e) {
			Logger.log("Error: File with name " + fileName + " was not found. More detail:" + e.toString());
			throw new StudentGradingException(e);
		} catch (IOException e) {	
			Logger.log("Error: writing to file  " + fileName + " was not found. More detail:" + e.toString());
			throw new StudentGradingException(e);
		} 
		
		
		
	}
	/**
	 * Deserializes the file to a StudentGrade object
	 * @param fileName - the fileName taken to convert to a StudentGrade object
	 * @return - the StudentGrade object
	 * @throws StudentGradingException - The custom exception thrown when the file is not created.
	 */
	public static StudentGrade deseralize(int StudentID) throws StudentGradingException{
		String fileName = "out/" + StudentID + ".ser";
		try {
			
			FileInputStream inputStream = new FileInputStream (fileName);
			ObjectInputStream ois = new ObjectInputStream(inputStream);
			
			StudentGrade student1 = (StudentGrade) ois.readObject();
			return student1;
			
		// Created StudentGradingException from underlying IO Exceptions	
		}catch (FileNotFoundException e){
			Logger.log("Error: File with name " + fileName + " was not found. More detail:" + e.toString());
			throw new StudentGradingException(e);
		} catch (IOException e) {
			Logger.log("Error: writing to file  " + fileName + " was not found. More detail:" + e.toString());
			throw new StudentGradingException(e);
		} catch (ClassNotFoundException e) {
			Logger.log("Error: The class was not found. More detail:" + e.toString());
			throw new StudentGradingException(e);
		}
		
	}
}
