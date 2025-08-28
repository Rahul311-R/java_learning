package OOPS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class set_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] arr = new String[n];
        for(int i =0; i<n;i++){
            arr[i]= s.nextLine();
        }

        HashSet<String> set = new HashSet<>(Arrays.asList(arr));

        System.out.println(set);
    }
}
