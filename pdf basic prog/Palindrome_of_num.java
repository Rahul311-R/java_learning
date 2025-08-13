import java.util.Scanner;

public class Palindrome_of_num {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int sum = n;
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        if(rev==sum){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}
