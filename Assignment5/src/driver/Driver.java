/**
 * Name - Pranav Janjanam
 * Class - CIS D035A
 * Assignment Number - Lab 5
 * Date Due - 06/02/21
 * Date Submitted - 05/30/21
 */
package driver;

import model.Student;
import model.Statistics;
import util.Util;
import java.util.Arrays;
/**
 * The driver which prints the high, low, and average values, and the student id and quiz scores
 * @author Pranav Janjanam
 */
public class Driver {
	public static void main(String args[]) {
		Student[] students = new Student[40];
		//students = Util.readFile("resources/headerOnly.txt", students);
		//students = Util.readFile("resources/headerWith1Line.txt", students);
		//students = Util.readFile("resources/headerWith15Lines.txt", students);
		//students = Util.readFile("resources/headerWith40Lines.txt", students);
		students = Util.readFile("resources/headerWith42Lines.txt", students);
		
		
		Statistics statStudents = new Statistics();
		int counter = 0;
		for(int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				counter++;
			}
		}
		students = Arrays.copyOf(students, counter);
		statStudents.findLow(students);
		statStudents.findHigh(students);
		statStudents.findAvg(students);
		
		System.out.printf("Stud\tQ1\tQ2\tQ3\tQ4\tQ5%n");
		for (int i = 0 ; i< students.length; i++) {
			students[i].print();
		}
		System.out.printf("%n");
		statStudents.print();
	}
	
	
}

/**
 * Test Case 1: Header Only
 * -------------------------------------------------------------------
Stud	Q1	Q2	Q3	Q4	Q5

The lowest scores for each quiz are: 0 0 0 0 0

The highest scores for each quiz are: 0 0 0 0 0

The average scores for each quiz are: 0.0 0.0 0.0 0.0 0.0
 *---------------------------------------------------------------------
 * Test Case 2: Header with 1 Record
 * -------------------------------------------------------------------
Stud	Q1	Q2	Q3	Q4	Q5
1234	52	7	100	78	34

The lowest scores for each quiz are: 52 7 100 78 34

The highest scores for each quiz are: 52 7 100 78 34

The average scores for each quiz are: 52.0 7.0 100.0 78.0 34.0
 *----------------------------------------------------------------------
 *Test Case 3: Header with 15 Lines
 * ---------------------------------------------------------------------
Stud	Q1	Q2	Q3	Q4	Q5
1234	52	7	100	78	34
2134	90	36	90	77	30
3124	100	45	20	90	70
4532	11	17	81	32	77
5678	20	12	45	78	34
6134	34	80	55	78	45
7874	60	100	56	78	78
8026	70	10	66	78	56
9893	34	9	77	78	20
1947	45	40	88	78	55
2877	55	50	99	78	80
3189	22	70	100	78	77
4602	89	50	91	78	60
5405	11	11	0	78	10
6999	0	98	89	78	20

The lowest scores for each quiz are: 0 7 0 32 10

The highest scores for each quiz are: 100 100 100 90 80

The average scores for each quiz are: 46.2 42.3 70.5 75.7 49.7
 * ---------------------------------------------------------------------
 * Test Case 4: Header with 40 Lines
 * ---------------------------------------------------------------------
Stud	Q1	Q2	Q3	Q4	Q5
1234	52	7	100	78	34
2134	90	36	90	77	30
3124	100	45	20	90	70
4532	11	17	81	32	77
5678	20	12	45	78	34
6134	34	80	55	78	45
7874	60	100	56	78	78
8026	70	10	66	78	56
9893	34	9	77	78	20
1947	45	40	88	78	55
2877	55	50	99	78	80
3189	22	70	100	78	77
4602	89	50	91	78	60
5405	11	11	0	78	10
6999	0	98	89	78	20
1234	52	7	100	78	34
2134	90	36	90	77	30
3124	100	45	20	90	70
4532	11	17	81	32	77
5678	20	12	45	78	34
6134	34	80	55	78	45
7874	60	100	56	78	78
8026	70	10	66	78	56
9893	34	9	77	78	20
1947	45	40	88	78	55
2877	55	50	99	78	80
3189	22	70	100	78	77
4602	89	50	91	78	60
5405	11	11	0	78	10
6999	0	98	89	78	20
1234	52	7	100	78	34
2134	90	36	90	77	30
3124	100	45	20	90	70
4532	11	17	81	32	77
5678	20	12	45	78	34
6134	34	80	55	78	45
7874	60	100	56	78	78
8026	70	10	66	78	56
9893	34	9	77	78	20
1947	45	40	88	78	55

The lowest scores for each quiz are: 0 7 0 32 10

The highest scores for each quiz are: 100 100 100 90 80

The average scores for each quiz are: 47.5 40.7 69.8 75.4 49.8
 * --------------------------------------------------------------
 * Test Case 5: Header With 42 Lines
 * --------------------------------------------------------------
***Found more than 40 records, ignoring them.
Stud	Q1	Q2	Q3	Q4	Q5
1234	52	7	100	78	34
2134	90	36	90	77	30
3124	100	45	20	90	70
4532	11	17	81	32	77
5678	20	12	45	78	34
6134	34	80	55	78	45
7874	60	100	56	78	78
8026	70	10	66	78	56
9893	34	9	77	78	20
1947	45	40	88	78	55
2877	55	50	99	78	80
3189	22	70	100	78	77
4602	89	50	91	78	60
5405	11	11	0	78	10
6999	0	98	89	78	20
1234	52	7	100	78	34
2134	90	36	90	77	30
3124	100	45	20	90	70
4532	11	17	81	32	77
5678	20	12	45	78	34
6134	34	80	55	78	45
7874	60	100	56	78	78
8026	70	10	66	78	56
9893	34	9	77	78	20
1947	45	40	88	78	55
2877	55	50	99	78	80
3189	22	70	100	78	77
4602	89	50	91	78	60
5405	11	11	0	78	10
6999	0	98	89	78	20
1234	52	7	100	78	34
2134	90	36	90	77	30
3124	100	45	20	90	70
4532	11	17	81	32	77
5678	20	12	45	78	34
6134	34	80	55	78	45
7874	60	100	56	78	78
8026	70	10	66	78	56
9893	34	9	77	78	20
1947	45	40	88	78	55

The lowest scores for each quiz are: 0 7 0 32 10

The highest scores for each quiz are: 100 100 100 90 80

The average scores for each quiz are: 47.5 40.7 69.8 75.4 49.8
 * --------------------------------------------------------------
 */
