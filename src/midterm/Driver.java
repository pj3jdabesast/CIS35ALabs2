package midterm;

public class Driver {
	
	public static void main(String args[]) {
		A a = new A();
		A b = new B();
		A c = new C();
		
		C c2 = new C();
		
		a.sm1();
		b.sm1();
		c.sm1();
		
		a.m1();
		b.m1();
		c.m1();
		
		c.sm1(); //sA1
		c2.sm1(); //sB1
		
		
		A a1 = new A(3);
		A a2 = new A(4);
		A a3 = new A(5);
		a1.STATIC_VAR = 3;
		a2.STATIC_VAR = 4;
		a3.STATIC_VAR = 5;
		a1.public1 = 6;
		a2.public1 = 7;
		a3.public1 = 8;
		
		System.out.printf("Static Variable: %d, %d, %d, %d %n", A.STATIC_VAR, a1.STATIC_VAR, a2.STATIC_VAR, a3.STATIC_VAR);
		
		A.STATIC_VAR = 3;
		
		System.out.printf("Static Variable: %d, %d, %d, %d %n", A.STATIC_VAR, a1.STATIC_VAR, a2.STATIC_VAR, a3.STATIC_VAR);
		
		System.out.printf("Static Variable: %d,  %d, %d, %d %n", a3.STATIC_VAR,  a1.public1, a2.public1,a3.public1);
		
		
		
	}
	
}
