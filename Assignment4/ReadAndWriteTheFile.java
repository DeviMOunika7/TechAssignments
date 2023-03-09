import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteTheFile {
public static void main(String args[]) {
	
	try {
		String m = "Mounika Maram";

	  //creating bufferedwriter object and creating a new text file
		
	BufferedWriter w = new BufferedWriter(new FileWriter("Input.txt"));
	
	 //writing into the file
	
	 w.write(m);
	 w.close();
	 System.out.println("Content is written into the file");
     String t;
     
	 //creating bufferedreader object and creating a new text file

     BufferedReader r = new BufferedReader(new FileReader("Input.txt"));
     
     //Reading from the file
     
     System.out.println("The content in input file is");
     while((t=r.readLine())!=null) {
    	 System.out.println(t);
     }
     r.close();
	}
	
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
