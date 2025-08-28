import java.util.Arrays;
import java.util.Scanner;

public class binary_search {

    static int binary(int[] arr,int tar){

            int left = 0;
            int right = arr.length-1;
            while(left<=right){
                int mid = left + (right - left) /2;
                if(arr[mid] == tar){
                    return mid;
                }else if(arr[mid]<tar){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }

        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int tar = s.nextInt();
        Arrays.sort(arr);
        int a = binary(arr,tar);
        if(a==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found");
        }
    }
}
