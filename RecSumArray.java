import java.util.Scanner;

public class RecSumArray {

    static int sumarr(int[] arr,int n){
        if(n==0) return 0;
        return arr[n-1]+ sumarr(arr,n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum = sumarr(arr,n);
        System.out.println(sum);
    }
}
