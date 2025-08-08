import java.util.Scanner;

public class bubble_sort {
    static int[] bubble(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n = s.nextInt();
        System.out.print("Enter "+n+" element of the array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        bubble(arr,n);
        for(int a :arr){
            System.out.print(a+" ");
        }
    }
}
