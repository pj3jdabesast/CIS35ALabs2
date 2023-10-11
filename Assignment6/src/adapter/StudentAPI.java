/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */

package adapter;
/**
 * The interface which prints the statistics and the scores given the studentID.
 * @author gjanjana
 *
 */
public interface StudentAPI {
	public void printStatistics();
	public void printScores(int studentID);
}
