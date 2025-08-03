import java.util.Scanner;

public class desc_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i = 0; i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                while(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
