package OOPS;

import java.util.HashMap;

public class Hashmap {//for numbers
    public static void main(String[] args) {
        int[] num = {1,2,2,2,4,5,6,7,7,7};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a :num){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        System.out.println(map);

        String str = "banana";
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(char u : str.toCharArray()){
            map1.put(u,map1.getOrDefault(u,0)+1);
        }
        System.out.println(map1);
    }
}
