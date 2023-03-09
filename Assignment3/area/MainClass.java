package Assignment3.area;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class MainClass {
    public static void main(String[] args) {
        
        //creating Rectangle object
        Rectangle rect = new Rectangle(10,20);
        rect.calculateArea();
        
        //creating Triangle object
        Triangle tri = new Triangle(10,20);
        tri.calculateArea();
        
        //creating Circle object
        Circle c = new Circle(10);
         c.calculateArea();
    }
}
