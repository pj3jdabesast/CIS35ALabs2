/**
 * Name- Pranav Janjanam
 * Class- CIS D035A
 * Assignment - Assignment 2 Part 2
 * Due Date - 5/3/21
 * Date Submitted - 5/1/21
 */
package assignment2;
import java.util.Scanner;
/**
 * A driver class that contains an input method that uses Scanner for data input and returns a NucleicAcid instance.
 * @author Pranav Janjanam
 *
 */
public class GenoNucleicAcid {
	
	
	/**
	 * A utility method that promopts the user, captures the input and returns it as a string.
	 * @param input - The Scanner object which captures the input by the user.
	 * @param prompt - The prompt which prompts the user to provide an input.
	 * @return - returns the input as a string
	 */
	public static String getStringInput(Scanner input, String prompt) {
		System.out.printf(prompt);
		String genomeName = input.next();
		return genomeName;
	}
	/**
	 * A utility method that prompts the user, captures the input, and returns it as a float.
	 * @param input - The Scanner object which captures the input by the user.
	 * @param prompt - The prompt which prompts the user to provide an input.
	 * @return - Returns the input as a float.
	 */
	public static float getFloatInput(Scanner input, String prompt) {
		System.out.printf(prompt);
		while (!input.hasNextFloat()) {
			System.out.printf("Invalid input - Please enter a float value:");
			input.next();
		}
		float floatInput = input.nextFloat();
		return floatInput;
	}
	/**
	 * A method which uses Scanner for data input and returns a Nucleic instance.
	 * @return - Returns a NucleicAcid instance
	 */
	public NucleicAcid inputGenoNucleicAcid() {
		Scanner input = new Scanner(System.in);
		String nucleicAcidName = getStringInput(input, "Enter the name of the nucleic acid:");
		String chemicalFormula = getStringInput(input, "Enter the chemical formula of the nucleic acid:");
		float molarMass = getFloatInput(input, "Enter the molarmass of the nucleic acid (in g/mol):");
		float density = getFloatInput(input, "Enter the density of the nucleic acid (in g/cm3):");
		System.out.printf("%n");
		NucleicAcid acid = new NucleicAcid(nucleicAcidName, chemicalFormula,molarMass,density);
		return acid;
	}
	
	/**
	 * Driver method, that captures input, create GenoNucleicAcid objects and prints the objects with user inputs.
	 * @param args
	 */
	public static void main(String[] args) {
		GenoNucleicAcid genoNucleicAcid = new GenoNucleicAcid();
		
		NucleicAcid cytosine = genoNucleicAcid.inputGenoNucleicAcid();
		NucleicAcid adenine = genoNucleicAcid.inputGenoNucleicAcid();
		NucleicAcid guanine = genoNucleicAcid.inputGenoNucleicAcid();
		NucleicAcid thymine = genoNucleicAcid.inputGenoNucleicAcid();
		NucleicAcid uracil = genoNucleicAcid.inputGenoNucleicAcid();
		
		cytosine.print();
		adenine.print();
		guanine.print();
		thymine.print();
		uracil.print();
	}
	
}



/**
 * Test Case 1: Run program with given 5 Nucleus Acids: Cytosine, Adenine, Guanine, Thymine, Uracil
 * -------------------------------------------------------------------------------------------------
 * 

Enter the name of the nucleic acid:Cytosine
Enter the chemical formula of the nucleic acid:C4H5N3O
Enter the molarmass of the nucleic acid (in g/mol):
111.10
Enter the density of the nucleic acid (in g/cm3):1.55

Enter the name of the nucleic acid:Adenine
Enter the chemical formula of the nucleic acid:C5H5N5
Enter the molarmass of the nucleic acid (in g/mol):135.13
Enter the density of the nucleic acid (in g/cm3):1.6

Enter the name of the nucleic acid:Guanine
Enter the chemical formula of the nucleic acid:C5H5N5O
Enter the molarmass of the nucleic acid (in g/mol):151.13
Enter the density of the nucleic acid (in g/cm3):2.200

Enter the name of the nucleic acid:Thymine
Enter the chemical formula of the nucleic acid:C5H6N2O2
Enter the molarmass of the nucleic acid (in g/mol):
126.115
Enter the density of the nucleic acid (in g/cm3):1.223

Enter the name of the nucleic acid:Uracil
Enter the chemical formula of the nucleic acid:C4H4N2O2
Enter the molarmass of the nucleic acid (in g/mol):112.08676
Enter the density of the nucleic acid (in g/cm3):
1.32

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Uracil 
The chemical formula of Uracil is: C4H4N2O2 
The molarmass of Uracil is: 112.09 g/mol 
The density of Uracil is: 1.320 g/cm3 

 * Test Case 2: Inputting Incorrect Values for floats
 * -------------------------------------------------------------------
Enter the name of the nucleic acid:Cytosine
Enter the chemical formula of the nucleic acid:C4H5N3O
Enter the molarmass of the nucleic acid (in g/mol): hello
Please enter a float value:111.10
Enter the density of the nucleic acid (in g/cm3):hi
Please enter a float value:1.55

Enter the name of the nucleic acid:Adenine
Enter the chemical formula of the nucleic acid:C5H5N5
Enter the molarmass of the nucleic acid (in g/mol):135.13
Enter the density of the nucleic acid (in g/cm3):1.6

Enter the name of the nucleic acid:Guanine
Enter the chemical formula of the nucleic acid:C5H5N5O
Enter the molarmass of the nucleic acid (in g/mol):151.13
Enter the density of the nucleic acid (in g/cm3):2.200

Enter the name of the nucleic acid:Thymine
Enter the chemical formula of the nucleic acid:C5H6N2O2
Enter the molarmass of the nucleic acid (in g/mol):
126.115
Enter the density of the nucleic acid (in g/cm3):1.223

Enter the name of the nucleic acid:Uracil
Enter the chemical formula of the nucleic acid:C4H4N2O2
Enter the molarmass of the nucleic acid (in g/mol):112.08676
Enter the density of the nucleic acid (in g/cm3):
1.32

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Uracil 
The chemical formula of Uracil is: C4H4N2O2 
The molarmass of Uracil is: 112.09 g/mol 
The density of Uracil is: 1.320 g/cm3
 
**/
