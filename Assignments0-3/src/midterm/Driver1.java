package midterm;

public class Driver1 {
	 public static int print(int sc) { 
		 	System.out.printf("Value=%d\n",sc);
			return 15;
		 }
		 public static void set(int sc) {
		 	sc = 75;
		 }
		 public static void main(String[] args) {
		 	 int y = 5;
			 int other = print(y);
			 set(y);
			 other = print(y);
		 }

		
}
