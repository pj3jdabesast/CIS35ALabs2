/**
 *  Assignment: Assignment0 - Part1
 *  Student: Pranav Janjanam
 *  Course: CIS D035A
 */

package assignment0;
import java.util.Scanner;

	/**
	 * This is a class that prints a Customer's Bill based on the input of how many of each products were sold.
	 * @author Pranav Janjanam
	 */
public class CustomerBill {
	    public final static String[] PRODUCTS = {"TV", "VCR" , "Remote Controller", "CD Player", "Tape Recorder"};
	    public final static float[] UNIT_PRICES ={400.00f, 220.00f,35.20f,200.00f,150.00f}; //float values have to be assigned with ending f, otherwise they will be considered as double
	    public final static float TAX_RATE = 8.25f/100;
	    /**
	     * An integer array that captures the number of each product inputted by the user
	     */
	    private int[] quantities = new int[5];
	/**
	 * Constructor - Assigns the quantity of each item bought to the quantites array.
	 * @param tvQuantity - The number of TVs sold
	 * @param vcrQuantity - The number of VCRs sold
	 * @param remoteControllerQuantity - The number of Remoote Controllers sold
	 * @param cdPlayerQuantity-The - The number of CD playes sold
	 * @param tapeRecorderQuantity - The number of Tape Recorders sold
	 */
	    public CustomerBill(int tvQuantity, int vcrQuantity, int remoteControllerQuantity, int cdPlayerQuantity, int tapeRecorderQuantity){
	        quantities[0] = tvQuantity;
	        quantities [1] = vcrQuantity;
	        quantities[2] = remoteControllerQuantity;
	        quantities[3] = cdPlayerQuantity;
	        quantities [4] = tapeRecorderQuantity;
	    }// end of CustomoerBill constructor
	/**
	 * Formats and prints the Quantity, Description, Unit Price, and Total Price of each item
	 */
	    public void printBill(){

	        System.out.println();
	        System.out.println("The customer bill for order sold:");
	        System.out.printf("QTY \t\t\tDESCRIPTION \t \t UNIT PRICE \t TOTAL PRICE %n");
	        System.out.println("-----------------------------------------------------------------------------");
	        float[] totalPrices = new float[5];
	        float subTotal = 0;
	        
	        for(int i= 0; i<5; i++){
	            totalPrices[i]= quantities[i]*UNIT_PRICES[i];
	            //used %25s to format different product names with each category
	            System.out.printf("%d \t %25s  \t\t $%.2f \t $%.2f %n",quantities[i],PRODUCTS[i],UNIT_PRICES[i], totalPrices[i]);
	            subTotal += totalPrices[i];
	        }// end of for
	        float tax = subTotal *TAX_RATE;
	        float total = subTotal + tax;
	        System.out.println();
	        System.out.printf("%57s \t $%.2f %n","SUBTOTAL",subTotal);
	        System.out.printf("%57s \t $%.2f %n","TAX",tax);
	        System.out.printf("%57s \t $%.2f %n","TOTAL",total);        

	    }// end of printBill method
	/**
	 * Main method which takes input from the user on the quantity for each product, constructs CustomerBill object, and prints the bill.
	 * @param args
	 */
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int tvQuantity = getInputQuantity(input, "How many TVs are sold?");
	        int vcrQuantity = getInputQuantity(input, "How many VCR's were sold?");
	        int remoteControllerQuantity = getInputQuantity(input, "How many remote controller's were sold?");
	        int cdQuantity = getInputQuantity(input, "How many CD's were sold?");
	        int tapeRecorderQuantity = getInputQuantity(input, "How many Tape Recorder's were sold?");
	        CustomerBill bill = new CustomerBill(tvQuantity, vcrQuantity, remoteControllerQuantity, cdQuantity, tapeRecorderQuantity);
	        bill.printBill();
	    }// end of main method
	/**
	 * A utility method that prompts the user, captures the input, and returns the input. This method also validates whether the input is an integer.
	 * @param input - The Scanner object that is used to capture the user's input
	 * @param prompt - The String that is used as a prompt.
	 * @return - Returns the quantity of product that the user enters
	 */
	    public static int getInputQuantity(Scanner input, String prompt){
	        System.out.println(prompt);
	        while(!input.hasNextInt()){
	           System.out.println("Invalid input. Please enter an integer for quantity:");
	           input.next();
	        }// end of while loop
	        int quantity = input.nextInt();
	        return quantity;
	    }// end oof getInputQuantity method
}//end of class
