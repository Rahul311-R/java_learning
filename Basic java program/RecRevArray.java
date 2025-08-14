import java.util.Scanner;

public class RecRevArray {

    static void rev(int[] arr,int start,int end){
        if(start>=end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        rev(arr,start+1,end-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        rev(arr,0,arr.length-1);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
