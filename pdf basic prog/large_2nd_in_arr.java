import java.util.Scanner;

public class large_2nd_in_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++) {
            arr[i] = s.nextInt();
        }

        for(int i = 0 ;i<arr.length-1;i++){
            for(int j = 0 ;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        int count=1;
        int sec= -1;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]!=arr[i+1]){
                count++;
                if(count==2){
                    sec= arr[i+1];
                    break;
                }
            }
        }
        System.out.println(sec);
    }
}
