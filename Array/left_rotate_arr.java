import java.util.Scanner;

public class left_rotate_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int first=arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1]=first;

        for(int a : arr){
            System.out.print(a+" ");
        }

    }
}
