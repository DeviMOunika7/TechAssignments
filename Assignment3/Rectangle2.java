package Assignment3;

public class Rectangle2 {
    int length;
    int breadth;

    //creating a parameterized constructor

    Rectangle2(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    //creating a static method

    static Rectangle2 flipRectangle(Rectangle2 rect){

        int temp = rect.length;
        rect.length = rect.breadth;
        rect.breadth = temp;

        return rect;
    }
     
    //creating display method
     
    static void display(Rectangle2 rect){
        System.out.println("The length and breadth of the rectangle are "+rect.length+" and "+rect.breadth);
    }

    public static void main(String[] args) {
        
        //creating object to the class

        Rectangle2 object = new Rectangle2(10, 20);
        
        //calling display method before updating 
        System.out.println("Before updating:");
        display(object);

        object = flipRectangle(object);

         //calling display method after updating 
         System.out.println("After updating:");
        display(object);
    }
}
