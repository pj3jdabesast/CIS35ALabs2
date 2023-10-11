/**
 * Name - Pranav Janjanam
 * Class - CIS D035A
 * Assignment Number - Lab 5
 * Date Due - 06/02/21
 * Date Submitted - 05/30/21
 */

package model;

/*
 * Class which stores the studentID and the scores each student scores on the 5 quizzes
 */
public class Student {
	
	private int studentID;
	private int[] scores = new int[5];
	/**
	 * Default Constructor
	 */
	public Student() {
		
	}
	/**
	 * Overloaded constructor
	 * @param studentID
	 * @param scores
	 */
	public Student(int studentID,int[] scores) {
		this.studentID = studentID;
		this.scores = scores;
	}
	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the scores
	 */
	public int[] getScores() {
		return scores;
	}

	/**
	 * @param scores the scores to set
	 */
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	/**
	 * prints the student id and the scores for each quiz for the student
	 */
	public void print() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d%n", studentID, scores[0], scores[1],scores[2], scores[3], scores[4]);
		
	}
}
