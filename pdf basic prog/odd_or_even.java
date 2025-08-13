import java.util.Scanner;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= s.nextInt();
        if (n%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
