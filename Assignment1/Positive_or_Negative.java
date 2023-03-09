import java.util.*;
public class Positive_or_Negative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int value=35;
        if(value>=0){
        System.out.println(value+" is a positive number");
        }
        else{
            System.out.println(value+" is a negative number");
        }
        int number =s.nextInt();
        if(number>=0){
        System.out.println(number+" is a positive number");
        }
        else{
         System.out.println(number+" is a negative number");
        }

    }
}
