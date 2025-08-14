import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String a = s.nextLine();
       String b = s.nextLine();

       char[] arr = a.toCharArray();
       char[] arr1 = b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);

        if(Arrays.equals(arr,arr1)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }


    }
}
