package simple.java;

    class Dog {
    	
    	// Data member's
    	
    	int Weight;
    	int Height;
    	String Color;
    	
    	// Member Function's
    	
    	void Barking() {
    		System.out.println("Dog is Barking");
    	}
    	
    	void Eating() {
    		
    		System.out.println("Dog is Eating");
    	}
    	
    	void Sleeping() {
    		
    		System.out.println("Dog is Sleeping");
    	}
    	
    	void Jumping() {
    		
    		System.out.println("Dog is Jumping");
    		
    	}
    }

public class DogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog D1 = new Dog();  // Object creation 
		D1.Weight = 30;
		D1.Height = 15;
		D1.Color = "Black";
		
		System.out.println("Dog Weight:" + D1.Weight);
	
		System.out.println("Dog Height:" + D1.Height);
		
		System.out.println("Dog Color:" + D1.Color);
		
		D1.Barking();
		D1.Eating();
		D1.Sleeping();
		D1.Jumping();
		
		
	}

}
