import java.util.Scanner;

public class sum_of_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i]=s.nextInt();
        }
        int sum = 0;
        for(int i = 0 ; i < n;i++){
            sum += arr[i] ;
        }
        System.out.println(sum);
    }
}
