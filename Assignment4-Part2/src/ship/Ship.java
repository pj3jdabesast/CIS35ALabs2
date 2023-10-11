/**	
 * Name - Pranav Janjanam
 * Class - CIS 035A
 * Assignment- Assignment 4 Part 2
 * Due Date - 5/25/21
 * Date Submitted -  5/24/21
 */

package ship;
/**
 * A classs which has many properties of a ship, parent class.
 * @author Pranav Janjanam
 */
public class Ship {
	private boolean floating;
	private int capacity;
	private double length;
	private double width;
	private String name;
	private double height;
	private String origin;
	private String departureDate;
	private String arrivalDate;
	private String departingPort;
	private String arrivalPort;
	private String owner;
	/**
	 * Default Constructor
	 */
	public Ship() {
		
	}
	/**
	 * Overloaded Constructor
	 * @param floating - boolean checking whether the ship is floating
	 * @param capacity - integer which tracks the capacity of the ship
	 * @param length - The length of the ship
	 * @param width - The width of the ship
	 * @param name - The name of the ship
	 * @param height - The height of the ship
	 * @param origin - The origin of the ship
	 * @param departureDate - The departure date of the ship
	 * @param arrivalDate - The arrival date of the ship
	 * @param departingPort - The port which the ship is departing from
	 * @param arrivalPort - The port which the ship arrives at
	 * @param owner - The owner of the ship
	 */
	public Ship(boolean floating, int capacity, double length, double width, String name, double height, String origin,
			String departureDate, String arrivalDate, String departingPort, String arrivalPort, String owner) {
		super();
		this.floating = floating;
		this.capacity = capacity;
		this.length = length;
		this.width = width;
		this.name = name;
		this.height = height;
		this.origin = origin;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departingPort = departingPort;
		this.arrivalPort = arrivalPort;
		this.owner = owner;
	}

	/**
	 * @return the floating
	 */
	public boolean isFloating() {
		return floating;
	}

	/**
	 * @param floating the floating to set
	 */
	public void setFloating(boolean floating) {
		this.floating = floating;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the arrivalDate
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return the departingPort
	 */
	public String getDepartingPort() {
		return departingPort;
	}

	/**
	 * @param departingPort the departingPort to set
	 */
	public void setDepartingPort(String departingPort) {
		this.departingPort = departingPort;
	}

	/**
	 * @return the arrivalPort
	 */
	public String getArrivalPort() {
		return arrivalPort;
	}

	/**
	 * @param arrivalPort the arrivalPort to set
	 */
	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * Prints the properties of the ship
	 */
	public void print() {
		System.out.printf("The ship's name is: %s %n", name);
		System.out.printf("The ship is floating: %b %n", floating);
		System.out.printf("The ship's capacity is: %d %n", capacity);
		System.out.printf("The ship's length in meters is: %.2f meters %n", length);
		System.out.printf("The ship's width in meters is: %.2f meters %n", width);
		System.out.printf("The ship's height in meters is: %.2f meters %n", height);
		System.out.printf("The ship's origin is: %s %n", origin);
		System.out.printf("The ship's departure date is: %s %n", departureDate);
		System.out.printf("The ship's arrival date is: %s %n", arrivalDate);
		System.out.printf("The port the ship deprated from is: %s %n", departingPort);
		System.out.printf("The port the ship is arriving at is: %s %n", arrivalPort);
		System.out.printf("The ship's owner is: %s %n", owner);
	}


	
	
}
