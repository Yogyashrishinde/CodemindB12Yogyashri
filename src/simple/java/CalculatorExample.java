package simple.java;

class Calculator {
	
	int a = 100;
	int b = 50;
	int c;
	
	// No Return_Type, No Argument
	
	void Addition() {
		
		c = a+b;
		
		System.out.println("Addition is:" + c);
		
	}
	 
	// No Return_Type, With Argument
	
	void Substraction(int a, int b) {
		
		c = a-b;
		
		System.out.printf("Substraction is:" + c );
		
	}
	
	// With Return_Type, No Arguments
	
	int Multiplication() {
		
		c = a*b;
		System.out.println("Multiplication is:" + c);
		return c ;
		
	}
	
	// With Return_Type, With Argument 
	
	int Division(int a, int b) {
		
		c = a/b;
		System.out.println("Diviaion is:" + c);
		return c;
	}
	
}

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator M = new Calculator();
		
		M.Addition();
		M.Substraction(100, 50);
		int i = M.Multiplication();
		System.out.println("Integer value return is:" + i);
		int d = M.Division(100, 50);
		System.out.println("Integer value return is:" + d);
		
	
	}

}
