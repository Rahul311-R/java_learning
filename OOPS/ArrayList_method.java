package OOPS;

import java.util.*;

public class ArrayList_method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Akash");
        list.add("Vishal");
        list.add("Priya");
        System.out.println("list:"+list);


        // contains() → check if element exists
        if (list.contains("Akash")) {
            System.out.println("Akash is in the list");
        }

        // indexOf() → find first occurrence index
        System.out.println("Index of Priya: " + list.indexOf("Priya"));

        // lastIndexOf() → find last occurrence index
        list.add("Rahul"); // duplicate
        System.out.println("Last index of Rahul: " + list.lastIndexOf("Rahul"));

        // isEmpty() → check if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // subList(from, to) → get a portion
        System.out.println("Sublist (1 to 3): " + list.subList(1, 3));

        // clone() → copy list
        ArrayList<String> copy = (ArrayList<String>) list.clone();
        System.out.println("Copied list: " + copy);

        // toArray() → convert ArrayList to Array
        String[] arr = list.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
