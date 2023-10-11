/**
 * Name- Pranav Janjanam
 * Class- CIS D035A
 * Assignment - Assignment 2 Part 1
 * Due Date - 5/3/21
 * Date Submitted - 5/1/21
 */
package assignment2;

/**
 * Class which contains properties, constructors, and print methods of the properties of the genomes.
 * @author Pranav Janjanam
 */
public class HumanGenome {
	
	private String genomeName;
	private int genomeCount;
	private int genesInBody;
	private int cellsInBody;
	private int chromosomesInBody;
	
	
	public HumanGenome() {
		
	}
	
	/**
	 * Constructor which assigns the quantity of each quality off the genome to a separate variable.
	 * @param genomeName - The name of the person or thing that the genome is of
	 * @param genome - The number of genomes in the person's body.
	 * @param genesInBody - The numbers of genes in the person's body
	 * @param cellsInBody - The number of cells in the person's body
	 * @param chromosomesInBody - The number of chromosomes in the person's body
	 */
	public HumanGenome(String genomeName ,int genomeCount,int genesInBody, int cellsInBody, int chromosomesInBody) {
		this.setGenomeName(genomeName); 
		this.setGenomeCount(genomeCount);
		this.setGenesInBody(genesInBody);
		this.setCellsInBody(cellsInBody);
		this.setChromosomesInBody(chromosomesInBody);
	}//end of HumanGenome constructoor

	
	/**
	 * @return the genomeName
	 */
	public String getGenomeName() {
		return genomeName;
	}

	/**
	 * @param genomeName the genomeName to set
	 */
	public void setGenomeName(String genomeName) {
		this.genomeName = genomeName;
	}

	/**
	 * @return the genome
	 */
	public int getGenomeCount() {
		return genomeCount;
	}//end of getGenome

	/**
	 * @param sets Genome
	 */
	public void setGenomeCount(int genome) {
		this.genomeCount = genome;
	}//end of setGenome

	/**
	 * @return the genesInBody
	 */
	public int getGenesInBody() {
		return genesInBody;
	}//end of getGenesInBody
	
	/**
	 * @param Sets the genesInBody
	 */
	public void setGenesInBody(int genesInBody) {
		this.genesInBody = genesInBody;
	}//end of setGenesInBody

	/**
	 * @return the cellsInBody
	 */
	public int getCellsInBody() {
		return cellsInBody;
	}//end of getCellsInBody
	
	/**
	 * @param Sets the cellsInBody
	 */
	public void setCellsInBody(int cellsInBody) {
		this.cellsInBody = cellsInBody;
	}//end of setCellsInBod

	/**
	 * @return the chromosomesInBody
	 */
	public int getChromosomesInBody() {
		return chromosomesInBody;
	}//end of getChromosomesInBody

	/**
	 * @param sets the chromosomesInBody
	 */
	public void setChromosomesInBody(int chromosomesInBody) {
		this.chromosomesInBody = chromosomesInBody;
	}// end of setChromosomesInBody
	
	/**
	 * Prints the genomes,genes, cells, and chromosomes given the input from the user.
	 */
	public void print() {
		System.out.printf("The number of genomes in %s's body are: %d %n",getGenomeName(), getGenomeCount());
		System.out.printf("The number of genes in %s's body are: %d %n", getGenomeName(), getGenesInBody());
		System.out.printf("The number of cells in %s's body are: %d %n", getGenomeName(), getCellsInBody());
		System.out.printf("The number of chromosomes in %ss's body are: %d %n",getGenomeName(), getChromosomesInBody());
		System.out.printf("%n");
	}//end of print()
	
	
}//end of class