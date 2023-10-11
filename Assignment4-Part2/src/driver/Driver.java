package driver;

import ship.Ship;
import ship.CargoShip;
import ship.CruiseShip;
/**
 * Driver class
 * @author Pranav Janjanam
 */
public class Driver {
	public static void main(String args[]) {
		
		//Create a plain Ship object and initialize
		Ship shipObject = new Ship();			
		shipObject.setFloating(true);
		shipObject.setCapacity(10000);
		shipObject.setLength(150);
		shipObject.setWidth(80);
		shipObject.setName("Ship: S.S. Margaret");
		shipObject.setHeight(50);
		shipObject.setOrigin("China");
		shipObject.setDepartureDate("5/24/21");
		shipObject.setArrivalDate("6/15/21");
		shipObject.setDepartingPort("New Orleans Port");
		shipObject.setArrivalPort("Port of New Jersey");
		shipObject.setOwner("John Smith");
		
		
		//Create a plain CargoShip object and initialize
CargoShip cargoShip = new Ship();
		cargoShip.setFloating(true);
		cargoShip.setCapacity(10500);
		cargoShip.setLength(175);
		cargoShip.setWidth(320);
		cargoShip.setName("Cargo: S.S. Elizabeth");
		cargoShip.setHeight(35);
		cargoShip.setOrigin("Japan");
		cargoShip.setDepartureDate("5/27/21");
		cargoShip.setArrivalDate("6/18/21");
		cargoShip.setDepartingPort("Los Angeles Port");
		cargoShip.setArrivalPort("Port of New York");
		cargoShip.setOwner("Rick Jewen");
		cargoShip.setCargoType("Toilet Paper");
		cargoShip.setLoadingMethod("Cranes");
		cargoShip.setNumberOfCranes(10);
		cargoShip.setContraband(12);
		cargoShip.setCargoValue(123452.39);
		
		
		//Create a plain CruiseShip object and initialize
		CruiseShip cruiseShip = new CruiseShip();
		String[] services = {"Cleaning", "Rock Climbing", "Rooms", "ShuffleBoard", "Pool", "Hot Tub"};
		cruiseShip.setFloating(true);
		cruiseShip.setCapacity(20000);
		cruiseShip.setLength(300);
		cruiseShip.setWidth(145);
		cruiseShip.setName("Cruise: Titanic");
		cruiseShip.setHeight(75);
		cruiseShip.setOrigin("U.S.A");
		cruiseShip.setDepartureDate("4/18/21");
		cruiseShip.setArrivalDate("7/17/21");
		cruiseShip.setDepartingPort("Britain Port");
		cruiseShip.setArrivalPort("Port of Russia");
		cruiseShip.setOwner("Will Carpenter");
		cruiseShip.setTicketPrice(139.99);
		cruiseShip.setNumberOfRooms(150);
		cruiseShip.setBuffetMenu("Pizza, Fries, Chicken Tenders, Hamburgers, Sushi, Cake, Cookies, Soda, Water");
		cruiseShip.setServices(services);  
		cruiseShip.setCruiseType("Luxury");
		
		//Create array of Ship objects and assign different types of Ship objects as array elements
		Ship[] ships = new Ship[3];
		ships[0] = shipObject;
		ships[1] = cargoShip;
		ships[2] = cruiseShip;
		
		for(int i=0; i< ships.length; i++) {
			//Exercise the polymorphic nature of Ship.print(), CargoShip.print() and CruiseShip.print() methods.
			ships[i].print();
			System.out.printf("%n");
		}

	}
}

/**
 * Test Case 1: Uses polymorphism and prints the values.
 * ---------------------------------------------------------------------------------------------------------
The ship's name is: Ship: S.S. Margaret 
The ship is floating: true 
The ship's capacity is: 10000 
The ship's length in meters is: 150.00 meters 
The ship's width in meters is: 80.00 meters 
The ship's height in meters is: 50.00 meters 
The ship's origin is: China 
The ship's departure date is: 5/24/21 
The ship's arrival date is: 6/15/21 
The port the ship deprated from is: New Orleans Port 
The port the ship is arriving at is: Port of New Jersey 
The ship's owner is: John Smith 

The ship's name is: Cargo: S.S. Elizabeth 
The ship is floating: true 
The ship's capacity is: 10500 
The ship's length in meters is: 175.00 meters 
The ship's width in meters is: 320.00 meters 
The ship's height in meters is: 35.00 meters 
The ship's origin is: Japan 
The ship's departure date is: 5/27/21 
The ship's arrival date is: 6/18/21 
The port the ship deprated from is: Los Angeles Port 
The port the ship is arriving at is: Port of New York 
The ship's owner is: Rick Jewen 
The ship's cargo type is: Toilet Paper 
The ship's loading method is: Cranes 
The number of cranes used to load the ship are: 10 
The amount of contraband on the ship is: 12 
The price of the cargo on the ship is: $123452.39 

The ship's name is: Cruise: Titanic 
The ship is floating: true 
The ship's capacity is: 20000 
The ship's length in meters is: 300.00 meters 
The ship's width in meters is: 145.00 meters 
The ship's height in meters is: 75.00 meters 
The ship's origin is: U.S.A 
The ship's departure date is: 4/18/21 
The ship's arrival date is: 7/17/21 
The port the ship deprated from is: Britain Port 
The port the ship is arriving at is: Port of Russia 
The ship's owner is: Will Carpenter 
The ticket price for the cruise ship is: $139.99 
The number of rooms on the ship is: 150 
The menu for the buffet is: Pizza, Fries, Chicken Tenders, Hamburgers, Sushi, Cake, Cookies, Soda, Water 
The services on the ship are: [Cleaning, Rock Climbing, Rooms, ShuffleBoard, Pool, Hot Tub] 
The type of cruise is: Luxury 
 */
