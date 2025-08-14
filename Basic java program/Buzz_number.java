import java.util.Scanner;

public class Buzz_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%7==0 || n%10==7){
            System.out.println("It is a Buzz Number");
        }else{
            System.out.println("It is not a Buzz Number");
        }
    }
}
