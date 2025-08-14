import java.util.Scanner;

public class linear_search {

    static int linear(int[] arr,int tar){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
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
        System.out.print("enter target element:");
        int tar = s.nextInt();
        int a =linear(arr,tar);//func calling
        if(a==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element found in position:"+a);
        }
    }
}
