package simple.java;

class Fi {
	
	// With ReturnType, With Argument
	
	int Print(String str, int i) {
		
		
		System.out.println("String value return is:" + "Ram" + ", Integer return is:" + i);
		return 60;
	}
}
// 
public class First {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Fi F = new Fi();
		int i = F.Print("Devanshi", 50);
		System.out.println("Integer value return is" + i);
	}

}
