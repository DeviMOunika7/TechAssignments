import java.util.*;
public class Multiplication_table {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
    int number=sc.nextInt();
    
    for(int i=1;i<=10;i++)
    {
        System.out.println(i+"*"+number+"="+i*number);
    }
}
}
