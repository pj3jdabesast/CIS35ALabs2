package midterm;

public class NewtonsSquareRoot {
	private static final double EPSILON = .0001;
	private int myNumber;
	private double root;
	private double guess;
	
	public NewtonsSquareRoot(int number) {
		myNumber = number;
	}
	
	public int getNumber() {
		return myNumber;
	}
	
	public double findSquareRoot() {
		guess = 1;
		root = Math.sqrt(myNumber);
		
		while(EPSILON < Math.abs(Math.pow(root, 2) - myNumber)) {
			guess++;
		}
		System.out.printf("The square root of %d is: %.2f %.1f%n", myNumber, root, guess);
		return root;
		
	}
	
	
	public static void main(String args[]) {
		NewtonsSquareRoot input = new NewtonsSquareRoot(16);
		input.findSquareRoot();
		
	}
}
