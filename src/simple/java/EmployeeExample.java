package simple.java;

class Employee {
	
	// Data member's 
	
	int id;
	String Name;
	int Salary;
	int Age;

	
	// Member Function's 
	
	void Working() {
		System.out.println("Employee is working");
	}
	
	void Travelling() {
		System.out.println("Employee is Travelling");
	}

	public static void City() {
		// TODO Auto-generated method stub
		
	}
}

public class EmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee(); 
		E1.id = 10;
		E1.Name = "Ram";
		E1.Salary = 700000;
		E1.Age = 32;
		
		System.out.println("Employee id:" + E1.id);
		
		System.out.println("Employee Name:" + E1.Name);
		
		System.out.println("Employee Salary:" + E1.Salary);
		
		System.out.println("Employee Age:" + E1.Age);
		
		
		E1.Working();
		E1.Travelling();
		

	}

}
