import java.util.Scanner;

public class missing_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int sum1=0;
        int sum = (n*(n+1))/2;
        for(int i = 0;i<n;i++){
            sum1 += arr[i];
        }

        int res = sum-sum1;
        System.out.println(res);

    }
}
