package Assignment4;
import java.util.*;
public class ReadingFromConsole {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         //Reading the input from the console
         
        String s = sc.next();
        System.out.println("The content read from console is:"+s);

        //closing the scanner
        
        sc.close();
    }
}
