import java.util.Scanner;

public class spy_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int sum = 0,pro = 1;
        while(n>0){
            int a = n%10;
            sum += a;
            pro *= a;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println(pro);
        if(sum==pro){
            System.out.print("this is a Spy number");
        }else{
            System.out.print("This is not a Spy number");
        }
    }
}
