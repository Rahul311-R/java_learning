import java.util.Scanner;

public class Sunny_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        double sqrt =Math.sqrt(n +1);
        System.out.println(sqrt);
        if (sqrt == (int) sqrt){
            System.out.println("It is a sunny number");
        }else{
            System.out.println("It is not a sunny number");
        }
    }
}
