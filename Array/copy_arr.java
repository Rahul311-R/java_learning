import java.util.*;

public class copy_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = s.nextInt();
        }
        for(int i =0 ; i<n;i++){
            arr1[i] = arr[i];
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        for(int a : arr1){
            System.out.print(a+" ");
        }
    }
}
