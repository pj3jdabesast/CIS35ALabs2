/**
 * Name- Pranav Janjanam
 * Class - CIS D035A
 * Assignment # - Lab 6
 * Date Due - 06/16/21
 * Date Submitted - 06/14/21
 */
package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
/**
 * Logger which prints the exceptions into a new file.
 * @author Pranav Janjanam
 */
public class Logger {
	public static final String LOG_FILE = "lab6.log";
	
/**
 * Method which prints the exceptions into a new file
 * @param msg - the message printed into the file
 */
public static void log(String msg) {
	
		try {
			FileWriter writer = new FileWriter(LOG_FILE, true);
			PrintWriter printer = new PrintWriter(writer);	
			printer.printf("%s %n",  msg);
			//Also prinitng in the System.out for assignment purpose to get more clarity.
			System.out.printf("Log: %s %n",  msg);
			printer.close();
		} catch(IOException e) { //exception handling
			System.out.printf( "**** File Exception: %s  *****%n", e.toString());
			System.out.printf("%s %n", msg);
		}
	}

}
