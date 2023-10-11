/**	
 * Name - Pranav Janjanam
 * Class - CIS 035A
 * Assignment- Assignment 4 Part 2
 * Due Date - 5/25/21
 * Date Submitted -  5/24/21
 */

package ship;
/**
 * Class which is the child of the Ship Class, having properties of a specific Cargo Ship.
 * @author Pranav Janjanam
 */
public class CargoShip extends Ship {
	private String cargoType;
	private String loadingMethod;
	private int numberOfCranes;
	private int contraband;
	private double cargoValue;
	/**
	 * Default Constructor
	 */
	public CargoShip() {
		super();
	}
	/**
	 * Overloaded Constructor
	 * @param cargoType - The type of the cargo
	 * @param loadingMethod - The way the cargo is loaded onto the ship
	 * @param numberOfCranes - The number of cranes used to load the cargo onto the ship
	 * @param contraband - The amount of contraband on the ship
	 * @param cargoValue - The value of the cargo on the ship.
	 */
	public CargoShip(String cargoType, String loadingMethod, int numberOfCranes, int contraband, double cargoValue) {
		super();
		this.cargoType = cargoType;
		this.loadingMethod = loadingMethod;
		this.numberOfCranes = numberOfCranes;
		this.contraband = contraband;
		this.cargoValue = cargoValue;
	}

	/**
	 * @return the cargoType
	 */
	public String getCargoType() {
		return cargoType;
	}

	/**
	 * @param cargoType the cargoType to set
	 */
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	/**
	 * @return the loadingMethod
	 */
	public String getLoadingMethod() {
		return loadingMethod;
	}

	/**
	 * @param loadingMethod the loadingMethod to set
	 */
	public void setLoadingMethod(String loadingMethod) {
		this.loadingMethod = loadingMethod;
	}

	/**
	 * @return the numberOfCranes
	 */
	public int getNumberOfCranes() {
		return numberOfCranes;
	}

	/**
	 * @param numberOfCranes the numberOfCranes to set
	 */
	public void setNumberOfCranes(int numberOfCranes) {
		this.numberOfCranes = numberOfCranes;
	}

	/**
	 * @return the contraband
	 */
	public int getContraband() {
		return contraband;
	}

	/**
	 * @param contraband the contraband to set
	 */
	public void setContraband(int contraband) {
		this.contraband = contraband;
	}

	/**
	 * @return the cargoValue
	 */
	public double getCargoValue() {
		return cargoValue;
	}

	/**
	 * @param cargoValue the cargoValue to set
	 */
	public void setCargoValue(double cargoValue) {
		this.cargoValue = cargoValue;
	}
	
	/**
	 * Prints the properties of the ship, and the properties of the cargo ship.
	 * Overwrites the method in the {@link Ship#print()}
	 */
	public void print() {
		super.print();
		System.out.printf("The ship's cargo type is: %s %n", cargoType);
		System.out.printf("The ship's loading method is: %s %n", loadingMethod);
		System.out.printf("The number of cranes used to load the ship are: %d %n", numberOfCranes);
		System.out.printf("The amount of contraband on the ship is: %d %n", contraband);
		System.out.printf("The price of the cargo on the ship is: $%.2f %n", cargoValue);
	}
	
}
