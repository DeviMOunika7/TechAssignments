package Assignment2;

import java.util.*;
public class SumOfAllValuesOfArray{
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    //Reading size of an array
    System.out.println("Enter the size of the array");
    int size=scan.nextInt();
    //Declaring the array
    int array[]=new int[size];
    //Reading the input into array from the user
    System.out.println("Enter the array values");
    for(int loop=0;loop<size;loop++){
        array[loop]=scan.nextInt();
    }
    //Initializing the variable sum with 0
    int sum=0;
    //calculating the sum of all elements in the array
    for(int loop=0;loop<size;loop++){
        sum+=array[loop];
    }
    //printing the sum of all elements in the array
   
        System.out.println("Sum of all the elements in the array is "+sum);

    scan.close();
}
}