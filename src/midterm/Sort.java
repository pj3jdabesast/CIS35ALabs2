package midterm;

import java.util.Arrays;

public class Sort {
	public static int[] sortArray(int[] inputArray) {
		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			int pointer = inputArray[i];
			for (int n = i+1; n< inputArray.length; n++) {
				int currentNumber = inputArray[n];
				if (pointer > currentNumber) {
					inputArray[i] = currentNumber;
					inputArray[n] = pointer;
					pointer = currentNumber;
				}
				counter++;
			}
			
		}
		System.out.println("The sorted array is:"+ Arrays.toString(inputArray));
		
		System.out.printf("Counter:%d %n", counter);
		return inputArray;
	}
	
	public static void main(String[] args) {
		int[] inputArray = {-55, -400, 30,27,-400,-10,5,300}; 
		sortArray(inputArray);
	}
}
