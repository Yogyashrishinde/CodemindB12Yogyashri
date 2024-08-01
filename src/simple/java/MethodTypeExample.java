package simple.java; 

     class MethodType { 
    	 
    	 // No Return, No Arguments
    	 
    	 void NoReturnNoArgument() {
    		 
    		 System.out.println("NoReturnNoArgument");
    	 }
    	 
    	 // No Return_Type, With Arguments 
    	 
    	 void NoReturnWithArgument (int a, String str) {
    		 
    		 System.out.println("NoReturnTypeNoArguments");
    		 System.out.println("Int value:" + a + ", String value:" + str);
    	 }
	
    	 // With ReturnType, No Arguments
    	 
    	 String WithReturnTypeNoArguments () {
    		 
    		 System.out.println("WithReturnTypeNoArguments");
    		 return "Ram";
    		 
    	 }
    	 
    	 // With Return Type, With Arguments 
    	 
    	 int WithReturn_TypeWithArgument (String string) {
    		 
    		 System.out.println("WithReturn_TypeWithArgument");
    		 return 100;
    		 
    	 }
      }

       public class MethodTypeExample {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub

	    	MethodType mt = new MethodType ();
	    	
	    	mt.NoReturnNoArgument();
	    	
	    	mt.NoReturnWithArgument(100, "Ram");
	    	
	    	String s = mt.WithReturnTypeNoArguments();
	    	
	    	System.out.println("String value return is:" + s);
	    	
	    	int a = mt.WithReturn_TypeWithArgument("Ram");
	    	
	    	System.out.println("Integer value return is:" + 100 );
	    	 	
	    	
	}

}
