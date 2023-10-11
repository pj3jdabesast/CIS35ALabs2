/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */
package exception;
import util.Logger;
/**
 * Creates a new custom exception names StudentGradingException
 * @author Pranav Janjanam
 */
public class StudentGradingException extends Exception{
	/**
	 * Constructor which replies No Message when no exception is present
	 */
	public StudentGradingException() {
		super();
		//Logger.log("**No Message**");
	}
	
	/**
	 * Wraps a message in the Exception.
	 * @param msg - the message wrapped
	 */
	public StudentGradingException(String msg) {
		super(msg);
		//Logger.log(msg);
	}
	/**
	 * Wraps an exception into the custom
	 * @param cause - the exception wrapped into the custom exception.
	 */
	public StudentGradingException(Exception cause) {
		super(cause);
		//Logger.log("Root Cause:" + cause.toString());
	}
	
}
