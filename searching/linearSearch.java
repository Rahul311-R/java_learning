import java.util.Scanner;

public class linearSearch {

    static int linear(int[] arr,int tar){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]==tar){
                return i;
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
        int a = linear(arr,tar);
        if(a==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found");
        }
    }
}
