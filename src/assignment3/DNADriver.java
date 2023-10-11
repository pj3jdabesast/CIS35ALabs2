/**
 * Name:Pranav Janjanam
 * Class: CISD035A
 * Assignment #: Assignment 3 
 * Due Date: 5/13
 * Date Submitted: 5/9
 */

package assignment3;

/***
 * Main method which uses a for loop to pring all of the DNA strands given.
 * @author Pranav Janjanam
 */
public class DNADriver {
	public static void main(String[] args) {
		String[] testDNAStrands = {"AGCCTAGGATCAG","AGCCTAGGATCTAGGATCAG","AGCCTATAGGATCAG","AAAGCCTAGGATAGGATCAG","AAAGCCTCTGAGGATAGGATCAG"};
		for (String testDNAStrand : testDNAStrands) {
			DNA dna = new DNA(testDNAStrand);
			dna.print();
			System.out.printf("%n");
			System.out.printf("Highest Molar Mass Results for: %s %n", testDNAStrand );
			System.out.printf("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ %n");
			dna.highestMolarMass();
			System.out.printf("%n");
			System.out.printf("Total Density Results for: %s %n", testDNAStrand);
			System.out.printf("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ %n");
			dna.totalDensity();
			System.out.printf("********************************************************************************* %n%n");
			System.out.printf("%n");
		}
	}
	
}


/**
 * Test Case: 
Printing DNA, LtoRHelix : AGCCTAGGATCAG,  RtoLHelix : TCGGATCCTAGTC 

The LtoRHelix is: AGCCTAGGATCAG 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

Stop 
----------------------------------------------------------------------------------------------- 

The RtoLHelix is: TCGGATCCTAGTC 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

Stop 
----------------------------------------------------------------------------------------------- 

Highest Molar Mass Results for: AGCCTAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
LtoRHelix: AGCCTAGGATCAG 
The highest molar mass in LtoRHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in LtoRHelix are: [1, 6, 7, 12] 

RtoLHelix: TCGGATCCTAGTC 
The highest molar mass in RtoLHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in RtoLHelix are: [2, 3, 10] 
----------------------------------------------------------------------------------------------- 

Total Density Results for: AGCCTAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
The total density of LtoRHelix is: 22.296 g/cm3 
The total density of RtoLHelix is: 20.892 g/cm3 
********************************************************************************* 


Printing DNA, LtoRHelix : AGCCTAGGATCTAGGATCAG,  RtoLHelix : TCGGATCCTAGATCCTAGTC 

The LtoRHelix is: AGCCTAGGATCTAGGATCAG 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

Stop 
----------------------------------------------------------------------------------------------- 

The RtoLHelix is: TCGGATCCTAGATCCTAGTC 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

Stop 
----------------------------------------------------------------------------------------------- 

Highest Molar Mass Results for: AGCCTAGGATCTAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
LtoRHelix: AGCCTAGGATCTAGGATCAG 
The highest molar mass in LtoRHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in LtoRHelix are: [1, 6, 7, 13, 14, 19] 

RtoLHelix: TCGGATCCTAGATCCTAGTC 
The highest molar mass in RtoLHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in RtoLHelix are: [2, 3, 10, 17] 
----------------------------------------------------------------------------------------------- 

Total Density Results for: AGCCTAGGATCTAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
The total density of LtoRHelix is: 33.892 g/cm3 
The total density of RtoLHelix is: 31.838 g/cm3 
********************************************************************************* 


Printing DNA, LtoRHelix : AGCCTATAGGATCAG,  RtoLHelix : TCGGATATCCTAGTC 

The LtoRHelix is: AGCCTATAGGATCAG 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

Stop 
----------------------------------------------------------------------------------------------- 

The RtoLHelix is: TCGGATATCCTAGTC 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

Stop 
----------------------------------------------------------------------------------------------- 

Highest Molar Mass Results for: AGCCTATAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
LtoRHelix: AGCCTATAGGATCAG 
The highest molar mass in LtoRHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in LtoRHelix are: [1, 8, 9, 14] 

RtoLHelix: TCGGATATCCTAGTC 
The highest molar mass in RtoLHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in RtoLHelix are: [2, 3, 12] 
----------------------------------------------------------------------------------------------- 

Total Density Results for: AGCCTATAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
The total density of LtoRHelix is: 25.119 g/cm3 
The total density of RtoLHelix is: 23.715 g/cm3 
********************************************************************************* 


Printing DNA, LtoRHelix : AAAGCCTAGGATAGGATCAG,  RtoLHelix : TTTCGGATCCTATCCTAGTC 

The LtoRHelix is: AAAGCCTAGGATAGGATCAG 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

Stop 
----------------------------------------------------------------------------------------------- 

The RtoLHelix is: TTTCGGATCCTATCCTAGTC 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

Stop 
----------------------------------------------------------------------------------------------- 

Highest Molar Mass Results for: AAAGCCTAGGATAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
LtoRHelix: AAAGCCTAGGATAGGATCAG 
The highest molar mass in LtoRHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in LtoRHelix are: [3, 8, 9, 13, 14, 19] 

RtoLHelix: TTTCGGATCCTATCCTAGTC 
The highest molar mass in RtoLHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in RtoLHelix are: [4, 5, 17] 
----------------------------------------------------------------------------------------------- 

Total Density Results for: AAAGCCTAGGATAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
The total density of LtoRHelix is: 34.319 g/cm3 
The total density of RtoLHelix is: 30.484 g/cm3 
********************************************************************************* 


Printing DNA, LtoRHelix : AAAGCCTCTGAGGATAGGATCAG,  RtoLHelix : TTTCGGAGACTCCTATCCTAGTC 

The LtoRHelix is: AAAGCCTCTGAGGATAGGATCAG 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

Stop 
----------------------------------------------------------------------------------------------- 

The RtoLHelix is: TTTCGGAGACTCCTATCCTAGTC 
----------------------------------------------------------------------------------------------- 
Start 
The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Guanine 
The chemical formula of Guanine is: C5H5N5O 
The molarmass of Guanine is: 151.13 g/mol 
The density of Guanine is: 2.200 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Adenine 
The chemical formula of Adenine is: C5H5N5 
The molarmass of Adenine is: 135.13 g/mol 
The density of Adenine is: 1.600 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

The name of the nucleic acid is: Thymine 
The chemical formula of Thymine is: C5H6N2O2 
The molarmass of Thymine is: 126.11 g/mol 
The density of Thymine is: 1.223 g/cm3 

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

The name of the nucleic acid is: Cytosine 
The chemical formula of Cytosine is: C4H5N3O 
The molarmass of Cytosine is: 111.10 g/mol 
The density of Cytosine is: 1.550 g/cm3 

Stop 
----------------------------------------------------------------------------------------------- 

Highest Molar Mass Results for: AAAGCCTCTGAGGATAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
LtoRHelix: AAAGCCTCTGAGGATAGGATCAG 
The highest molar mass in LtoRHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in LtoRHelix are: [3, 9, 11, 12, 16, 17, 22] 

RtoLHelix: TTTCGGAGACTCCTATCCTAGTC 
The highest molar mass in RtoLHelix is: 151.130 
The indexes where the nucleic acid with the highest molar mass lie in RtoLHelix are: [4, 5, 7, 20] 
----------------------------------------------------------------------------------------------- 

Total Density Results for: AAAGCCTCTGAGGATAGGATCAG 
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ 
The total density of LtoRHelix is: 39.292 g/cm3 
The total density of RtoLHelix is: 35.834 g/cm3 
********************************************************************************* 
 */
