package simple.java;

class student {
	
	// Data Member's
	
	int id;
	String name;
	int marks;
	static String city;
	int mobno;
	
	// Member Function's 
	
	void study() {
		
		System.out.println("student is studying");
	}
	
	void play() {
		
		System.out.println("student is playing");
		
	}
	
	void dance() {
		
		System.out.println("student is dancing");
	}

	public static void city() {
		// TODO Auto-generated method stub
		
	}

	public static void StudentExample() {
		// TODO Auto-generated method stub
		
	}
}
public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1 = new student();
		
		s1.id = 10;
		s1.name = "Ram";
		s1.marks = 90;
		s1.city = "solapur";
		s1.mobno = 90966392;
		
		System.out.println("student id is:" + 10);
		
		System.out.println("student name is:" + "Ram");
		
		System.out.println("student marks is:" + 90);
		
		System.out.println("student citty is:" + "solapur");
		
		System.out.println("student mobno is:" + 90966392);
		
		
		s1.study();
		s1.play();

		
	}

}
