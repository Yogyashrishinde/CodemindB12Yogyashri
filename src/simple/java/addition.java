package simple.java;

public class addition {
	
	// Data Member's 
	
	int a = 100;
    int b = 20;
	int c;
	
	// Member Function's 
	
	void add () {
		
		c = a + b;
		
		System.out.println("addition is:" + c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 addition A = new addition();
	 
	 A.add();
	
		
	}

}
