import java.util.Scanner;

public class tech_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a four digit number:");
        int n = s.nextInt();
        if (n < 1000 || n > 9999){
            System.out.println("Enter the 4 digit number");
        }else{
            int fi = n / 100;
            int se = n % 100;
            int sum = fi + se ;
            if (sum * sum == n ){
                System.out.println("It is a tech number");
            }else{
                System.out.println("It is not a tech number");
            }
        }
    }
}
