import java.util.Scanner;

public class Rec_factorial {

    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("the factorial of "+n+" is "+fact(n));
    }
}
