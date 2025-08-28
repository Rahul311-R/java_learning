import java.util.Scanner;

public class Emirp_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        if(isprime(n)) {
            int reverse = rev(n);
            System.out.println(reverse);
            if (isprime(reverse)) {
                System.out.println("It is a Emirp Number");
            } else {
                System.out.println("It is not a Emirp Number");
            }
        }else{
            System.out.println("Enter a Prime number...");
            System.out.println(n+" is not a Prime number");
        }
    }
    static boolean isprime(int n){
        for ( int i = 2; i <= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static int rev(int n){
        int di = 0;
        while(n>0) {
            di = (di *10) + n % 10;
            n /= 10;
        }
        return di;
    }
}
