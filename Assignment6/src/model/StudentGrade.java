/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */
package model;

import java.io.Serializable;
/**
 * Class which contains the Student and Statistics class to serialize
 * @author Pranav Janjanam
 *
 */
public class StudentGrade implements Serializable {
	private Student student;
	private Statistics studentStats;
	/**
	 * Default Constructor
	 */
	public StudentGrade() {
		
	}
	/**
	 * Overloaded Construcotr
	 * @param s1 - the Student object
	 * @param s2 - the Statistics object
	 */
	public StudentGrade(Student s1, Statistics s2) {
		this.student = s1;
		this.studentStats = s2;
	}

	/**
	 * @return the Student object
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param sets the Student object
	 */
	public void setStudent(Student s1) {
		this.student = s1;
	}

	/**
	 * @return the Statistics object
	 */
	public Statistics getStudentStats() {
		return studentStats;
	}

	/**
	 * @param sets the Statistics object
	 */
	public void setStudentStats(Statistics s2) {
		this.studentStats = s2;
	}
	/**
	 * Prints the Student and Statistics object's properties
	 */
	public void print() {
		student.print();
		studentStats.print();
	}
}
