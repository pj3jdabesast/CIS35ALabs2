package midterm;

public class A {
	
	public static int STATIC_VAR = 1;
	
    private int private1;
    public int public1;
    int packageProtected1;
    protected int protected1;
    
    public A() {
    	
    }
    
    public A(int val) {
    	private1 = val;
    }
    
    
	static void sm1() {
		System.out.println("sA1");
	}
	
	static void sm2() {
		System.out.println("sA2");
	}
	
	
	public int getPrivate1() {
		return private1;
	}
	
	 void m1() {
		System.out.println("A1");
	}
	
	 void m2() {
		System.out.println("A2");
	}
}

