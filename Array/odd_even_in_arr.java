import java.util.Scanner;

public class odd_even_in_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print("Even numbers: "+arr[i]);
            }

            else{
                System.out.print("Odd numbers: "+arr[i]);
            }
        }
    }
}
