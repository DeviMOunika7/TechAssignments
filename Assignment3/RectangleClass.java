package Assignment3;

//importing scanner class

import java.util.Scanner;
public class RectangleClass {
    int length;
    int breadth;

    //creating as default constructor

    RectangleClass(){
         length=10;
         breadth=10;
    }

    //creating parameterized constructor

    RectangleClass(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //creating display method
    
    void display(){
        System.out.println(length+" and "+breadth);
    }

    //creating main method

    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    //creating object for default constructor

    RectangleClass object=new RectangleClass();
    System.out.print("The length and breadth of the rectangle in default constructor are ");

    //calling display method with default constructor object

    object.display();

    //Taking length and breadth values from the user

    System.out.println("Enter the length of the rectangle");
    int length=scan.nextInt();
    System.out.println("Enter the breadth of the rectangle");
    int breadth=scan.nextInt();    

    //creating object for parameterized constructor

    RectangleClass object1=new RectangleClass(length,breadth);
    System.out.println("The length and breadth of the rectangle in parameterized constructor are ");

    //calling display method with default constructor object

    object1.display();
        
    }
}
