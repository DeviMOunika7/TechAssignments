import java.util.*;
public class String_array {
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String array1[]=new String[5];
       System.out.println("Read the string array");
       for(int i=0;i<5;i++){
       array1[i]=s.next();
       }
       int j=4;
       System.out.println("Array in Reverse order");
       while(j>=0){
           System.out.println(array1[j]);
           j--;
       }

   } 
}
