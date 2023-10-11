package midterm;

public class ConvertRomanNumeral {
	private int[] numbers = {1000,500,100,50,10,5,1};
	private String[] romanNumerals = {"M", "D","C","L","X","V", "I"};
	private int integerInput;
	
	ConvertRomanNumeral(int integerInput){
		this.integerInput = integerInput;
	}

	/**
	 * @return the numbers
	 */
	public int[] getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers the numbers to set
	 */
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	/**
	 * @return the romanNumerals
	 */
	public String[] getRomanNumerals() {
		return romanNumerals;
	}

	/**
	 * @param romanNumerals the romanNumerals to set
	 */
	public void setRomanNumerals(String[] romanNumerals) {
		this.romanNumerals = romanNumerals;
	}

	/**
	 * @return the integerInput
	 */
	public int getIntegerInput() {
		return integerInput;
	}

	/**
	 * @param integerInput the integerInput to set
	 */
	public void setIntegerInput(int integerInput) {
		this.integerInput = integerInput;
	}
	
	public String writeRomanNumeral() {
		String output = "";
		int remainder = integerInput;
		for (int i = 0; i < romanNumerals.length; i++) {
			int numberOfNumerals = remainder/numbers[i];
			remainder = integerInput % numbers[i];
			for (int r = 0; r < numberOfNumerals; r++) {
				output += romanNumerals[i];
			}
		}
		System.out.printf("The integer input is: %d %n", integerInput);
		System.out.printf("The Roman Numeral form is: %s %n", output);
		return output;
	}
	
	
	
	public static void main(String args[]) {
		ConvertRomanNumeral input = new ConvertRomanNumeral (2569);
		input.writeRomanNumeral();
	}
}
