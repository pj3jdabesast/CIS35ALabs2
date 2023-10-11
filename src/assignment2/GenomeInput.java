/**
 * Name- Pranav Janjanam
 * Class- CIS D035A
 * Assignment - Assignment 2 Part 1
 * Due Date - 5/3/21
 * Date Submitted - 5/1/21
 */
package assignment2;
import java.util.Scanner;
/**
 * Driver class that contains input method that uses Scanner for data input and returns a HumanGenome instance, and calls the input method 3 times to create three instances of HumanGenome.
 * @author Pranav Janjanam
 */
public class GenomeInput {
	
	/**
	 * A utility method that prompts the user, captures the input, and returns the input as a string.
	 * @param input - the Scanner object which captures the input of the user.
	 * @param prompt - The prompt which prompts the user to provide an input.
	 * @return - returns the input as a string.
	 */
	public static String getStringInput(Scanner input, String prompt) {
		System.out.printf(prompt);
		String genomeName = input.next();
		return genomeName;
	}
	
	/**
	 * A utility method that prompts the user, captures the input, and returns the input. This method also validates whether the input is an integer.
	 * @param input - the Scanner object which captures the input of the user.
	 * @param prompt - The prompt which prompts the user to provide an input.
	 * @return - returns the input as an integer.
	 */
	public static int getIntegerInput(Scanner input, String prompt) {
		System.out.printf(prompt);
		while (!input.hasNextInt()) {
			System.out.printf("Invalid input - Please enter an integer value:");
			input.next();
		}
		int integerInput = input.nextInt();
		return integerInput;
	}
	/**
	 * A method which uses Scanner for data input and returns a HumanGenome instance.
	 * @return - Returns a HumanGenome instance.
	 */
	public  HumanGenome inputGenome() {
		Scanner input = new Scanner(System.in);
		String personName = getStringInput(input, "Enter the name of the person you want to find the genome of:");
		int genomeCount = getIntegerInput(input, "Please enter the number of genomes the person has:");
		int cellsInBody = getIntegerInput(input, "Please enter the number of genes in the person's genome:");
		int chromosomeInBody = getIntegerInput(input, "Please enter the number of cells the person has (in trillions):");
		int genesInBody = getIntegerInput(input, "Please enter the number of chromosomes the person has:");
		System.out.printf("%n");
		HumanGenome name = new HumanGenome(personName,genomeCount,genesInBody,cellsInBody,chromosomeInBody);
		return name;
		
	}
	/**
	 * Creates a new GenomeInput object, and 3 HumanGenome objects, and prints them.
	 * @param args
	 */
	public static void main(String[] args) {
		GenomeInput genomeInput = new GenomeInput();
		//calls method 3 times to create 3 instances of HumanGenome.
		HumanGenome  aladdin = genomeInput.inputGenome();
		HumanGenome simba = genomeInput.inputGenome();
		HumanGenome mowgli = genomeInput.inputGenome();
		
		aladdin.print();
		simba.print();
		mowgli.print();
	}
}


/**
 * Test Case 1: Input Regular values 
 * -----------------------------------------------------------
 * Enter the name of the person you want to find the genome of:Aladdin
 * Please enter the number of genomes the person has: 1
 * Please enter the number of genes in the person's genome: 20000
 * Please enter the number of cells the person has (in trillions):77
 * Please enter the number of chromosomes the person has:46

 * Enter the name of the person you want to find the genome of:Simba
 * Please enter the number of genomes the person has:1
 * Please enter the number of genes in the person's genome: 20000
 * Please enter the number of cells the person has (in trillions):87
 * Please enter the number of chromosomes the person has:37

 * Enter the name of the person you want to find the genome of:Mowgli
 * Please enter the number of genomes the person has:1
 * Please enter the number of genes in the person's genome:20000
 * Please enter the number of cells the person has (in trillions):93
 * Please enter the number of chromosomes the person has:46

 * The number of genomes in Aladdin's body are: 1 
 * The number of genes in Aladdin's body are: 46 
 * The number of cells in Aladdin's body are: 20000 
 * The number of chromosomes in Aladdins's body are: 77 

 * The number of genomes in Simba's body are: 1 
 * The number of genes in Simba's body are: 37 
 * The number of cells in Simba's body are: 20000 
 * The number of chromosomes in Simbas's body are: 87 

 * The number of genomes in Mowgli's body are: 1 
 * The number of genes in Mowgli's body are: 46 
 * The number of cells in Mowgli's body are: 20000 
 * The number of chromosomes in Mowglis's body are: 93 
 * 
 * Test Case 2: Input incorrect types for each value
 * ----------------------------------------------------------------------------
 * Enter the name of the person you want to find the genome of:Aladdin
 * Please enter the number of genomes the person has: 1
 * Please enter the number of genes in the person's genome:hello
 * Please enter an integer value:32000
 * Please enter the number of cells the person has (in trillions):hi
 * Please enter an integer value:77
 * Please enter the number of chromosomes the person has:okay
 * Please enter an integer value:46

 * Enter the name of the person you want to find the genome of:Simbaa
 * Please enter the number of genomes the person has:1
 * Please enter the number of genes in the person's genome:20000
 * Please enter the number of cells the person has (in trillions):75
 * Please enter the number of chromosomes the person has:46

 * Enter the name of the person you want to find the genome of:Mowgli
 * Please enter the number of genomes the person has:1
 * Please enter the number of genes in the person's genome:27000
 * Please enter the number of cells the person has (in trillions):88
 * Please enter the number of chromosomes the person has:46

 * The number of genomes in Aladdin's body are: 1 
 * The number of genes in Aladdin's body are: 46
 * The number of cells in Aladdin's body are: 32000 
 * The number of chromosomes in Aladdins's body are: 77 

 * The number of genomes in Simbaa's body are: 1 
 * The number of genes in Simbaa's body are: 46 
 * The number of cells in Simbaa's body are: 20000 
 * The number of chromosomes in Simbaas's body are: 75 

 * The number of genomes in Mowgli's body are: 1 
 * The number of genes in Mowgli's body are: 46 
 * The number of cells in Mowgli's body are: 27000 
 * The number of chromosomes in Mowglis's body are: 88 
 **/
