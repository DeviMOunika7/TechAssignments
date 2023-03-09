package Assignment2;
//importing scanner class
import java.util.*;
public class MultidimensionalArray {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scan=new Scanner(System.in);
        //creating an arraylist with 2 elements
        ArrayList<Integer>firstrow=new ArrayList<>();
        //Adding elements into this list
        firstrow.add(10);
        firstrow.add(20);
        //creating an arraylist with 3 elements
        ArrayList<Integer>secondrow=new ArrayList<>();
        //Adding elements into this list
        secondrow.add(30);
        secondrow.add(40);
        secondrow.add(50);
        //creating an arraylist with 1 element
        ArrayList<Integer>thirdrow=new ArrayList<>();
        //Adding elements into this list
        thirdrow.add(60);
        //creating multidimesional arraylist
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        //adding all rows into this list
        list.add(firstrow);
        list.add(secondrow);
        list.add(thirdrow);
        //printing the multidimensional array
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


    }
}
