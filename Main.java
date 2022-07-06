package Work;

public class Main {
	public static void main(String []args) {
	
		//addition operations
		 Arithmetic addition=( a, b)->(a+b); 
         System.out.println("Addition => " + addition.operations(10, 20));
   
       //subtraction operations
      Arithmetic subtraction=( a, b)->(a-b); 
      System.out.println("Sub => " + subtraction.operations(50, 20));
      
      //multiplication operations
      Arithmetic multiplication=( a, b)->(a*b); 
      System.out.println("mul => " + multiplication.operations(20, 20));
      
      //division operations
      Arithmetic division=( a, b)->(a/b); 
      System.out.println("div => " + division.operations(80, 20));
      
      //modulus operations
      Arithmetic modulus=( a, b)->(a%b); 
      System.out.println("mod => " + modulus.operations(100, 20));
      
	}
}
	
   