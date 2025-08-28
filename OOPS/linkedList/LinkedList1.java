package OOPS;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("grape");

        System.out.println(list);

        list.addFirst("rahul");
        list.addLast("akash");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.getFirst());
    }
}
