package Assignment2;
//importing  scanner class
import java.util.Scanner;
public class AverageValueOfArrayElements {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scan=new Scanner(System.in);
        //Reading size of the array from user
        System.out.println("Enter the size of the array");
        int arraysize=scan.nextInt();
        //Declaring array with given size
        int array[] = new int[arraysize];
        //Declaring and initializing loop variable
        int loop=0;
        //Reading array values from the user
        System.out.println("Enter the array values");
        while(loop<arraysize){
            array[loop]=scan.nextInt();
            loop++;
        }
        //Declaring and initializing sum variable
        int sum=0;
        //Reinitializng the loop variable with 0 to calculate sum of all elements in the array
        loop=0;
        while(loop<arraysize){
            sum+=array[loop];
            loop++;
        }
        //calculating the average of all elements in the array
        float average=(float)sum/arraysize;
        System.out.println("The average of all elements in the given array is "+average);
        
        
    }
}
