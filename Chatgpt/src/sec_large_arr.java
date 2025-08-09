import java.util.Scanner;

public class sec_large_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i =0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int count=1;
        for(int i = 0 ;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
                if(count==2){
                    System.out.println(arr[i+1]);

                }
            }
        }
    }
}
