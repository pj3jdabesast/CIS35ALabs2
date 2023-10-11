/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */

package model;

import java.io.Serializable;
import java.util.Arrays;
/**
 * Calculates the lowest scores, the highest scores, and the average scores for each quiz in the whole class.
 * @author Pranav Janjanam
 */
public class Statistics implements Serializable{
	private int[] lowScores = new int[5];
	private int[] highScores = new int[5];
	private float[] avgScores = new float[5];
	/**
	 * Default Constructor
	 */
	public Statistics() {
		
	}
	
	/**
	 * Overloaded Constructor
	 * @param lowScores - the array that stores the lowest scores
	 * @param highScores - the array that stores the highest scores
	 * @param avgScores - the array that stores the average scores
	 */
	public Statistics(int[] lowScores, int[] highScores, float[] avgScores) {
		super();
		this.lowScores = lowScores;
		this.highScores = highScores;
		this.avgScores = avgScores;
	}


	/**
	 * @return the lowScores
	 */
	public int[] getLowScores() {
		return lowScores;
	}
	/**
	 * @param lowScores the lowScores to set
	 */
	public void setLowScores(int[] lowScores) {
		this.lowScores = lowScores;
	}
	/**
	 * @return the highScores
	 */
	public int[] getHighScores() {
		return highScores;
	}
	/**
	 * @param highScores the highScores to set
	 */
	public void setHighScores(int[] highScores) {
		this.highScores = highScores;
	}
	/**
	 * @return the avgScores
	 */
	public float[] getAvgScores() {
		return avgScores;
	}
	/**
	 * @param avgScores the avgScores to set
	 */
	public void setAvgScores(float[] avgScores) {
		this.avgScores = avgScores;
	}
	/**
	 * Finds the lowest scores in all of the students.
	 * @param students - the group of students being compared
	 */
	public void findLow(Student[] students) {

		for (int i = 0; i< students.length; i++) {
			int[] studentScores = students[i].getScores();
			for (int n = 0; n < lowScores.length; n++) {	
				if (i == 0) {
					lowScores[n] = studentScores[n];
				}else if (studentScores[n] < lowScores[n]) {
					lowScores[n] = studentScores[n];
				}
			}
		}
	
	}
	/**
	 * Finds the highest scores in all of the students.
	 * @param students  - the group of students being compared
	 */
	public void findHigh(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			int[] studentScores = students[i].getScores();
			for (int n = 0 ;  n< highScores.length; n++) {
				if (studentScores[n] > highScores [n]) {
					highScores[n] = studentScores[n];
				}
			}
		}
	}
	/**
	 *
	 * Finds the average scores in all of the students.
	 * @param students  - the group of students being compared
	 */
	public void findAvg(Student[] students) {
		int numberOfStudents = students.length;
		if (numberOfStudents > 0) {
		
		int[] sum = new int[5];
		for (int i = 0; i< students.length; i++) {
			int[] studentScores = students[i].getScores();
	
				for (int k = 0; k < studentScores.length; k++) {
					sum[k] = sum[k] + studentScores[k];
				}				
			}
		for (int j = 0; j< avgScores.length; j++) {
		 avgScores[j] = sum[j]*1.0f/numberOfStudents;				
		} 
		}
	}
	/**
	 * Prints the lowest, highest, and average scores.
	 */
	public void print() {
		System.out.printf("The lowest scores for each quiz are:");
		for (int i = 0; i<lowScores.length; i++ ) {
			System.out.printf(" %d", lowScores[i]);
		}
		System.out.printf("%n");
		System.out.printf("%n");
		
		System.out.printf("The highest scores for each quiz are:");
		for (int i = 0; i<highScores.length; i++ ) {
			System.out.printf(" %d", highScores[i]);
		}
		System.out.printf("%n");
		System.out.printf("%n");
		
		System.out.printf("The average scores for each quiz are:");
		for (int i = 0; i<avgScores.length; i++ ) {
			System.out.printf(" %.1f", avgScores[i]);
		}
		System.out.printf("%n");
		System.out.printf("%n");
	}
	
}
