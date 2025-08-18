package OOPS;
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> sol = new ArrayList<>();
        sol.add("apple");
        sol.add("rahul");
        sol.add("akash");
        sol.add("soda");

        System.out.println(sol);//print a list
        System.out.println(sol.get(0));//particular element
        sol.remove("soda");//remove a element
        System.out.println(sol);

        sol.set(0, "rahul");//update a element
        System.out.println(sol);

        System.out.println(sol.size());


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Method 1: for loop
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + " → " + numbers.get(i));
        }

        // Method 2: for-each loop
        for (Integer num : numbers) {
            System.out.println("Value: " + num);
        }


    }
}

