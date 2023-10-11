/**
 * Name:Pranav Janjanam
 * Class: CISD035A
 * Assignment #: Assignment 3 
 * Due Date: 5/13
 * Date Submitted: 5/9
 */

package assignment3;

import assignment2.NucleicAcid;
import assignment2.HumanGenome;
import java.util.Arrays;

/**
 * This is a class which creates two strands of DNA in the helix, implemented as an array of objects of type NucleicAcid, finds the highest molar mass molecule and the locations of it in the  array, and the total density of the array.
 * @author Pranav Janjanam
 */
public class DNA {
	private NucleicAcid[] LtoRHelix;
	private NucleicAcid[] RtoLHelix;
	private String strand;
	/**
	 * Default Constructor
	 */
	public DNA() {
		
	}//end of constructor
	
	/**
	 * Provide a strand representing the containing a sequence of Nucleic Acids represented with letters ‘A’, ‘G’, ‘T’ and ‘C’ (For e.g. “ATGCCTAGGATCAG”)
	 * @param strand
	 */
	public DNA(String strand) {
		setStrand(strand);
	}//end of constructor

	/**
	 * @return ltoRHelix
	 */
	public NucleicAcid[] getLtoRHelix() {
		return LtoRHelix;
	}//end of getLtoRHelix

	/**
	 * @param sets LtoRHelix
	 */
	public void setLtoRHelix(NucleicAcid[] ltoRHelix) {
		LtoRHelix = ltoRHelix;
	}//end of setLtoRHelix

	/**
	 * @return rtoLHelix
	 */
	public NucleicAcid[] getRtoLHelix() {
		return RtoLHelix;
	}// end of getRtoLHelix

	/**
	 * @param sets rtoLHelix 
	 */
	public void setRtoLHelix(NucleicAcid[] rtoLHelix) {
		RtoLHelix = rtoLHelix;
	}// end of setRtoLHelix
	
	/**
	 * @return the strand
	 */
	public String getStrand() {
		return strand;
	}// end off getStrand

	/**
	 * @param sets and converts the strand ffrom a string to an array of objects.
	 */
	public void setStrand(String strand) {
		this.strand = strand;
		char[] strandNucleicAcids = strand.toCharArray();
		LtoRHelix = new NucleicAcid[strandNucleicAcids.length];
		RtoLHelix = new NucleicAcid[strandNucleicAcids.length];
		for (int i = 0; i < strandNucleicAcids.length; i++) {
			switch(strandNucleicAcids[i]) {
			case 'A':
				LtoRHelix[i]= NucleicAcid.ADENINE;
				RtoLHelix[i]= NucleicAcid.THYMINE; 
				break;
			case 'C':
				 LtoRHelix[i]= NucleicAcid.CYTOSINE;
				 RtoLHelix[i]= NucleicAcid.GUANINE;
				 break;
			case 'G':
				LtoRHelix[i]= NucleicAcid.GUANINE;
				RtoLHelix[i]= NucleicAcid.CYTOSINE;
				break;
			case 'T':
				LtoRHelix[i]= NucleicAcid.THYMINE;
				RtoLHelix[i]= NucleicAcid.ADENINE;
				break;
			}// end of switch
		}//end of for
	}//end of setStrand
	
	/**
	 * prints the properties of each nucleic acid in LtoRHelix and RtoLHelix
	 */
	public void print() {
		String ltoRStrand = generateStrandString(LtoRHelix);
		String rtoLStrand = generateStrandString(RtoLHelix);
		
		System.out.printf("Printing DNA, LtoRHelix : %s,  RtoLHelix : %s %n",ltoRStrand, rtoLStrand);
		System.out.printf("%n");
		System.out.printf("The LtoRHelix is: %s %n",ltoRStrand );
		System.out.printf("----------------------------------------------------------------------------------------------- %n");
		System.out.printf("Start %n");
		for(int i =0; i< LtoRHelix.length; i++) {
			LtoRHelix[i].print();
		}//end of for
		System.out.printf("Stop %n");
		System.out.printf("----------------------------------------------------------------------------------------------- %n");
		System.out.printf("%n");
		System.out.printf("The RtoLHelix is: %s %n",rtoLStrand);
		System.out.printf("----------------------------------------------------------------------------------------------- %n");
		System.out.printf("Start %n");
		for(int i = 0; i< RtoLHelix.length; i++) {
			RtoLHelix[i].print();
		}//end of for
		System.out.printf("Stop %n");
		System.out.printf("----------------------------------------------------------------------------------------------- %n");
		//System.out.printf("%n");
			
	}//end of print()
	
	/**
	 * Generates a String given the array of NucleicAcid objects.
	 * @param acids - The array of NucleicAcid objects
	 * @return - the given strand as a string.
	 */
	public static String generateStrandString(NucleicAcid[] acids) {
		  char[] strandChars = new char[acids.length];
		  for(int i=0; i<acids.length; i++) {
			  if(acids[i].getNucleicAcidName().equals(NucleicAcid.ADENINE.getNucleicAcidName())) {
				  strandChars[i] = 'A';
			  } else if (acids[i].getNucleicAcidName().equals(NucleicAcid.THYMINE.getNucleicAcidName())) {
				  strandChars[i] = 'T';
			  } else if (acids[i].getNucleicAcidName().equals(NucleicAcid.GUANINE.getNucleicAcidName())) {
				  strandChars[i] = 'G';
			  } else if (acids[i].getNucleicAcidName().equals(NucleicAcid.CYTOSINE.getNucleicAcidName())) {
				  strandChars[i] = 'C';
			  }//end of elseif
			  
		  }//end of for
			String strandString = new String(strandChars);
			return strandString;
			
		}//end of generateStrand String
	
	/**
	 * Prints the index values and highest MolarMass of Nucleic Acid after traversing the following array of Objects
	 */
	public void highestMolarMass() {
		
		int ltoRindexOfMaxWeight = -1;
		float ltoRmaximumWeight = -1;
		int[] ltoRHighestMolarMassLocation = new int[LtoRHelix.length];		
		for (int i = 0; i < LtoRHelix.length; i++) {
			NucleicAcid acid = LtoRHelix[i];
			if (ltoRmaximumWeight < acid.getMolarMass()) {
				ltoRmaximumWeight = acid.getMolarMass();
				ltoRHighestMolarMassLocation[0] = i;
				ltoRindexOfMaxWeight = 0;
			}else if(ltoRmaximumWeight == acid.getMolarMass()) {
				ltoRindexOfMaxWeight++;
				ltoRHighestMolarMassLocation[ltoRindexOfMaxWeight] =i;
			}//end of else if
		}//end of for
		int rtoLindexOfMaxWeight = -1;
		float rtoLmaximumWeight = -1;
		int[] rtoLHighestMolarMassLocation = new int[RtoLHelix.length];	
		for (int i = 0; i < RtoLHelix.length; i++) {
			NucleicAcid acid = RtoLHelix[i];
			if (rtoLmaximumWeight < acid.getMolarMass()) {
				rtoLmaximumWeight = acid.getMolarMass();
				rtoLHighestMolarMassLocation[0] = i;
				rtoLindexOfMaxWeight = 0;
			}else if(rtoLmaximumWeight == acid.getMolarMass()) {
				rtoLindexOfMaxWeight++;
				rtoLHighestMolarMassLocation[rtoLindexOfMaxWeight] =i;
			}//end of else if
		}//end of for
		int[] validIndexesLtoRHelix = Arrays.copyOf(ltoRHighestMolarMassLocation, ltoRindexOfMaxWeight+1);
		int[] validIndexesRtoLHelix = Arrays.copyOf(rtoLHighestMolarMassLocation, rtoLindexOfMaxWeight+1);
		
		System.out.printf("LtoRHelix: %s %n", strand);
		System.out.printf("The highest molar mass in LtoRHelix is: %.3f %n", ltoRmaximumWeight);
		System.out.printf("The indexes where the nucleic acid with the highest molar mass lie in LtoRHelix are: %s %n", Arrays.toString(validIndexesLtoRHelix));
		System.out.printf("%n");
		System.out.printf("RtoLHelix: %s %n", generateStrandString(RtoLHelix));
		System.out.printf("The highest molar mass in RtoLHelix is: %.3f %n", rtoLmaximumWeight);
		System.out.printf("The indexes where the nucleic acid with the highest molar mass lie in RtoLHelix are: %s %n", Arrays.toString(validIndexesRtoLHelix));
		System.out.printf("----------------------------------------------------------------------------------------------- %n");
	}// end of highestMolarMass()
	
	/**
	 *  Prints the total Density of all Nucleic Acid within the following array of Objects
	 */
	public void totalDensity() {
		float ltoRTotalDensity = 0;
		for (int i = 0; i < LtoRHelix.length; i++) {
			if (LtoRHelix[i]== NucleicAcid.ADENINE) {
				ltoRTotalDensity = ltoRTotalDensity + NucleicAcid.ADENINE.getDensity();
			}else if (LtoRHelix[i] == NucleicAcid.GUANINE) {
				ltoRTotalDensity = ltoRTotalDensity + NucleicAcid.GUANINE.getDensity();
			}else if (LtoRHelix[i] == NucleicAcid.CYTOSINE) {
				ltoRTotalDensity = ltoRTotalDensity + NucleicAcid.CYTOSINE.getDensity();
			}else if (LtoRHelix[i] == NucleicAcid.THYMINE) {
				ltoRTotalDensity = ltoRTotalDensity + NucleicAcid.THYMINE.getDensity();
			}//end of else if
		
		}//end of for
		
		float rtoLTotalDensity = 0;
		for (int i = 0; i < RtoLHelix.length; i++) {
			if (RtoLHelix[i]== NucleicAcid.ADENINE) {
				rtoLTotalDensity = rtoLTotalDensity + NucleicAcid.ADENINE.getDensity();
			}else if (RtoLHelix[i] == NucleicAcid.GUANINE) {
				rtoLTotalDensity = rtoLTotalDensity + NucleicAcid.GUANINE.getDensity();
			}else if (RtoLHelix[i] == NucleicAcid.CYTOSINE) {
				rtoLTotalDensity = rtoLTotalDensity + NucleicAcid.CYTOSINE.getDensity();
			}else if (RtoLHelix[i] == NucleicAcid.THYMINE) {
				rtoLTotalDensity = rtoLTotalDensity + NucleicAcid.THYMINE.getDensity();
			}//end of else if
		
		}//end of for
		System.out.printf("The total density of LtoRHelix is: %.3f g/cm3 %n", ltoRTotalDensity);
		System.out.printf("The total density of RtoLHelix is: %.3f g/cm3 %n", rtoLTotalDensity);
	}//end of totalDensity

}//end of DNA
