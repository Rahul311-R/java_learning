import java.util.Scanner;

public class Insertion_sort {
    static int[] insertion(int[] arr,int n){
        for(int i =1 ; i<n;i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =key;
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
        insertion(arr,n);//func calling
        for(int a :arr){
            System.out.print(a+" ");
        }
    }
}
