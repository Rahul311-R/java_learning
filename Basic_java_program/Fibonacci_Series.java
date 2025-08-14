import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int a =0 ,b=1;

        for(int i = 2;i<n;i++){
            int num = a+b;
            a=b;
            b=num;
            System.out.print(num+" ");
        }

    }
}
