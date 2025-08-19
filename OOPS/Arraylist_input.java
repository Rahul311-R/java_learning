package OOPS;

import java.util.*;

public class Arraylist_input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        ArrayList<String> name = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String a = s.nextLine();
            name.add(a);
        }

        for (String t : name) {
            System.out.println(t);
        }

        String[] arr = name.toArray(new String[0]);
        for(String u:arr){
            System.out.print(u+" ");
        }


        String[] fruits = {"apple", "banana", "cherry"};


        ArrayList<String> list = new ArrayList<>(Arrays.asList(fruits));

        System.out.println("ArrayList: " + list);


    }
}
