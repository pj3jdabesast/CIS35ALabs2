/**
 * Name- Pranav Janjanam
 * Class- CIS D035A
 * Assignment - Assignment 2 Part 2
 * Due Date - 5/3/21
 * Date Submitted - 5/1/21
 */
package assignment2;
/**
 * A class that contains properties, constructors, and a print() method printing value of each property as value name pairs in separate lines using printf().
 * @author Pranav Janjanam
 */
public class NucleicAcid {
	private String nucleicAcidName;
	private String chemicalFormula;
	private float molarMass;
	private float density;
	
	
	public static final NucleicAcid ADENINE = new NucleicAcid ("Adenine", "C5H5N5", 135.13f, 1.6f);
	public static final NucleicAcid GUANINE = new NucleicAcid ("Guanine", "C5H5N5O", 151.13f, 2.2f);
	public static final NucleicAcid CYTOSINE = new NucleicAcid ("Cytosine", "C4H5N3O", 111.10f, 1.55f);
	public static final NucleicAcid THYMINE = new NucleicAcid ("Thymine", "C5H6N2O2", 126.115f, 1.223f);
	
			
	/**
	 * Default Constructor 
	 */
	public NucleicAcid() {
		
	}
	/**
	 * Constructor which assigns assigns the properties for each variable.
	 * @param nucleicAcidName - The name of the nucleic acid as a string.
	 * @param chemicalFormula - The chemical formula of the nucleic acid as a string.
	 * @param molarMass - The molar masss of the nucleic acid as a float.
	 * @param density - The density of the nucleic acid as a float.
	 */
	public NucleicAcid(String nucleicAcidName, String chemicalFormula, float molarMass, float density) {
		this.setNucleicAcidName(nucleicAcidName);
		this.setChemicalFormula(chemicalFormula);
		this.setMolarMass(molarMass);
		this.setDensity(density);
	}

	/**
	 * @return the nucleicAcidName
	 */
	public String getNucleicAcidName() {
		return nucleicAcidName;
	}

	/**
	 * @param Sets nucleicAcidName
	 */
	public void setNucleicAcidName(String nucleicAcidName) {
		this.nucleicAcidName = nucleicAcidName;
	}

	/**
	 * @return the chemicalFormula
	 */
	public String getChemicalFormula() {
		return chemicalFormula;
	}

	/**
	 * @param sets chemicalFormula
	 */
	public void setChemicalFormula(String chemicalFormula) {
		this.chemicalFormula = chemicalFormula;
	}

	/**
	 * @return the molarMass
	 */
	public float getMolarMass() {
		return molarMass;
	}

	/**
	 * @param sets molarMass
	 */
	public void setMolarMass(float molarMass) {
		this.molarMass = molarMass;
	}

	/**
	 * @return the density
	 */
	public float getDensity() {
		return density;
	}

	/**
	 * @param sets density
	 */
	public void setDensity(float density) {
		this.density = density;
	}
	/**
	 * Prints the nucleic acid name, the chemical formula, the molar masss, and the density.
	 */
	public void print() {
		System.out.printf("The name of the nucleic acid is: %s %n", getNucleicAcidName());
		System.out.printf("The chemical formula of %s is: %s %n", getNucleicAcidName(), getChemicalFormula());
		System.out.printf("The molarmass of %s is: %.2f g/mol %n", getNucleicAcidName(),getMolarMass());
		System.out.printf("The density of %s is: %.3f g/cm3 %n", getNucleicAcidName(),getDensity());
		System.out.printf("%n");
	}
	
}
