import java.util.Scanner;

public class posi_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0  ; i < n ; i++){
            arr[i]= s.nextInt();
        }
        System.out.print("even pos:");
        for(int i = 0 ; i < n ; i +=2 ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("odd pos:");
        for(int i = 1 ; i < n ; i +=2 ){
            System.out.print(arr[i]+" ");
        }
    }
}
