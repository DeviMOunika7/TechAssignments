import java.util.*;
public class StringImmutable {

	public static void main(String[] args) {

	 //Creating 2 strings to perform the given operations
	 
	String s1 = "Mounika";
	String s2 = "Maram";
	String s3=s1+s2;
	
	//using concat method
	
	System.out.println("Using Concat Method");
	System.out.println(s1.concat(s2));
	System.out.println();
	
	//using Uppercase method
	
	System.out.println("Using UpperCase Method");
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toUpperCase());
	System.out.println();

	
	//using lowercase method
	
	
	System.out.println("Using LowerCase Method");
	System.out.println(s1.toLowerCase());
	System.out.println(s3.toLowerCase());
	System.out.println();

	
	//using Replace method
	
	System.out.println("Using Replace Method");
	System.out.println(s3.replace('a','1'));
	}

}
