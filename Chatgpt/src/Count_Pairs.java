import java.util.Scanner;

public class Count_Pairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr =new int[n];

        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int tar = s.nextInt();
        int count =0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j]==tar){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
