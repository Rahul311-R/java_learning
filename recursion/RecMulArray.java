import java.util.Scanner;

public class RecMulArray {

    static int mul(int[] arr , int n){
        if(n==1) return arr[0];
        return Math.max(arr[n-1],mul(arr,n-1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int mul = mul(arr,n);
        System.out.println(mul);
    }
}
