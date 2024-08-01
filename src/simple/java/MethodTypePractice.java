package simple.java;

class Calculation {
	
	// No Return, No Arguments
	
	void addition () {

		int e = 200;
		int f = 100;
		int g;
		
		g = e + f;
		
		System.out.println("addition is:" + g);
	}
	
	// No Return Type, With Arguments 
		
	
		void sub (int a, int b) {
		
		int a1 = 100;
		int b1 = 20;
		int c;
		
		c = a1 - b1;
		
		System.out.println("sub is:" + c);
		System.out.println("Int value :" + a + ", Int value:" + b);

	}
		
		// With Return Type, With Argument
		
		int multi (int e, int f) {
			
			int g = 40;
			int h = 10;
			int k;
			
			k = g * h;
			
			System.out.println("multi is:" + k);
			return k;
			
		}
		
		// With Return Type, With Arguments 
		
		int div (int u, int v) { 
			
			int m = 30;
			int n = 5;
			int r;
			
			r = m/n;
			
			System.out.println("div is:" + r);
			System.out.println("Int value :" + u + ", Int value:" + v);

			return r;
		}
}
public class MethodTypePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation V = new Calculation();
		V.addition();
		V.sub(100, 20); 
		int d = V.multi(40, 50);
		int t = V.div(30, 80);
		
	}

}
