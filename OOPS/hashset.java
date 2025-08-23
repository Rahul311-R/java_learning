package OOPS;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("apple");
        set.add("mango");
        set.add("orange");

        System.out.println("Hashset: "+set);

        for(String n : set){
            System.out.print(n+" ");
        }

        System.out.println("Contains mango? " + set.contains("mango"));

        System.out.println("Size of HashSet: " + set.size());

    }
}
