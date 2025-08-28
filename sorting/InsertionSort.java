import java.util.Scanner;

public class InsertionSort {

    static int[] insert(int[] arr,int n){
        for(int i = 1;i<n;i++) {
            int key = arr[i];
            int j = i - 1;
            if(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
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
        insert(arr,n);
        for(int a :arr){
            System.out.print(a+" ");
        }

    }
}
