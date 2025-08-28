import java.util.Scanner;

public class SelectionSort {

    static int[] select(int[] arr,int n){
        for(int i = 0;i<n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        select(arr,n);
        for(int a :arr){
            System.out.print(a+" ");
        }

    }
}
