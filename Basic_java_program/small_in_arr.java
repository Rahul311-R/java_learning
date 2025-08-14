import java.util.Scanner;

public class small_in_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i]=s.nextInt();
        }
        int small = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}

