
public class Exceptions {
public static void main(String args[]) throws ArrayIndexOutOfBoundsException , NumberFormatException {
	
	try {
		int a[] = new int[10];
		a[10] = 11;
	}
	
	//Handling ArrayIndexOutOfBoundsException
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array Index Out Of Bounds Exception");
	}
	
	try {
		Integer.parseInt("Mounika");
	}
	
	//Handling NumberFormatException
	
	catch(NumberFormatException n) {
		System.out.println("Number Format Exception occured");
	}
}
}
