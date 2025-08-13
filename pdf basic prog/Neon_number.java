import java.util.Scanner;

public class Neon_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int sq = n * n;
        int sum = 0;
        while(sq>0){
            sum += sq%10;
            sq /= 10;
        }
        if (sum == n ){
            System.out.println("It is a neon number");
        }else{
            System.out.println("It is not a neon number");
        }
    }
}
