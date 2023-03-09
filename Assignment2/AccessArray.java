package Assignment2;
//importing scanner class
import java.util.Scanner;
public class AccessArray {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scan=new Scanner(System.in);
        //Reading the size of the array
        System.out.println("Enter the size of the array");
        int size=scan.nextInt();
        //Declaring an array with given size
        int array[]=new int[size];
        //Reading the array values
        System.out.println("Enter the array values");
        //Declaring and initializing the loop variable with 0
        int loop=0;
        while(loop<size){
              array[loop]=scan.nextInt();
              loop++;
        }
        //Accessing and printing the elements in the array
        for(int iterator=0;iterator<size;iterator++){
            System.out.println("The element at index "+iterator+" is "+array[iterator] );
        }
    }

    
}
