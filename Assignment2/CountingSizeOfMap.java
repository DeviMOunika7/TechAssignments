package Assignment2;
//importing HashMap class
import java.util.HashMap;
public class CountingSizeOfMap {
    public static void main(String[] args) {
        //creating a hashmap
        HashMap<Integer,String> map = new HashMap<>();
        //Reading key-value pair into map
        map.put(1,"apple");
        map.put(2,"ball");
        map.put(3,"cat");
        //printing the number of key value mappings in the map
        System.out.println("The size of the map is "+map.size());
    }
}
