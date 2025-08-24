package OOPS;

import java.util.*;

public class array_convertion {
    public static void main(String[] args) {

        String[] arr = {"rahul","apple","akash","orange","grape","mango","tech","orange"};

        //arr->arrlist
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("arrayList="+list1);

        //arr->hashset
        HashSet<String> list2 = new HashSet<>(Arrays.asList(arr));
        System.out.println("hashset="+list2);

        //arr->linkedList
        LinkedList<String> list3 = new LinkedList<>(Arrays.asList(arr));
        System.out.println("linkedlist="+list3);

        //arr->queue
        Queue<String> list4 = new LinkedList<>(Arrays.asList(arr));
        System.out.println("Queue="+list4);

        //arr->stack
        Stack<String> list5 = new Stack<>();
        for(String a : arr){
            list5.push(a);
        }
        System.out.println("Stack="+list5);

        //arr->PriorityQueue
        Integer[] arr2 = {16,72,36,54,65,};
        PriorityQueue<Integer> pg = new PriorityQueue<>(Arrays.asList(arr2));
        System.out.println("pg="+pg);

        //to print without []
        for(String i : list1)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //reverse to arr
        String[] arrFromList = list1.toArray(new String[0]);

    }
}
