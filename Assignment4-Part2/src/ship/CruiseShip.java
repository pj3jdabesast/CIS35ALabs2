/**	
 * Name - Pranav Janjanam
 * Class - CIS 035A
 * Assignment- Assignment 4 Part 2
 * Due Date - 5/25/21
 * Date Submitted -  5/24/21
 */

package ship;

import java.util.Arrays;
/**
 * Child of the Ship class, which contains properties of a cruise ship.
 * @author Pranav Janjanam
 */
public class CruiseShip extends Ship{
	private double ticketPrice;
	private int numberOfRooms;
	private String buffetMenu;
	private String[] services;
	private String cruiseType;
	/**
	 * Default Constructor
	 */
	public CruiseShip() {
		super();
	}
	/**
	 * Overloaded Constructor 
	 * @param ticketPrice - The price of the ticket for the cruise
	 * @param numberOfRooms - The number of rooms on the cruise ship
	 * @param buffetMenu - The items on the buffet
	 * @param services - The services provided on the cruise ship
	 * @param cruiseType - The type of the cruise ship
	 */
	public CruiseShip(double ticketPrice, int numberOfRooms, String buffetMenu, String[] services, String cruiseType) {
		super();
		this.ticketPrice = ticketPrice;
		this.numberOfRooms = numberOfRooms;
		this.buffetMenu = buffetMenu;
		this.services = services;
		this.cruiseType = cruiseType;
	}

	/**
	 * @return the ticketPrice
	 */
	public double getTicketPrice() {
		return ticketPrice;
	}

	/**
	 * @param ticketPrice the ticketPrice to set
	 */
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	/**
	 * @return the numberOfRooms
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	/**
	 * @param numberOfRooms the numberOfRooms to set
	 */
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	/**
	 * @return the buffetMenu
	 */
	public String getBuffetMenu() {
		return buffetMenu;
	}

	/**
	 * @param buffetMenu the buffetMenu to set
	 */
	public void setBuffetMenu(String buffetMenu) {
		this.buffetMenu = buffetMenu;
	}

	/**
	 * @return the services
	 */
	public String[] getServices() {
		return services;
	}

	/**
	 * @param services the services to set
	 */
	public void setServices(String[] services) {
		this.services = services;
	}

	/**
	 * @return the cruiseType
	 */
	public String getCruiseType() {
		return cruiseType;
	}

	/**
	 * @param cruiseType the cruiseType to set
	 */
	public void setCruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}
	/**
	 * Prints the properties of the ship, and the properties of the cruise ship.
	 * Overwrites the method in the {@link Ship#print()}
	 */
	public void print() {
		super.print();
		System.out.printf("The ticket price for the cruise ship is: $%.2f %n", ticketPrice);
		System.out.printf("The number of rooms on the ship is: %d %n", numberOfRooms);
		System.out.printf("The menu for the buffet is: %s %n", buffetMenu);
		System.out.printf("The services on the ship are: %s %n", Arrays.toString(services));
		System.out.printf("The type of cruise is: %s %n", cruiseType);
		
	}

}
