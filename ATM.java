import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int balance = 1000;
        while(true){
            System.out.println("Welcome to our ATM");
            System.out.println("Service provided:");
            System.out.println("1.Check balance");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Deposit Amount");
            System.out.println("4.exit");
            System.out.print("Enter your choice(1/2/3/4):");
            int choice = s.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Your balance:"+balance);
                    break;
                case 2 :
                    System.out.print("Enter the amount to withdraw:");
                    int n = s.nextInt();
                    if(n<=balance) {
                        System.out.println("You Withdrawed:" + n);
                        System.out.println("Your balance:" + (balance - n));
                    }
                    else {
                        System.out.println("Insuffient balance");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit:");
                    int b = s.nextInt();
                    System.out.println("You deposited:"+b);
                    System.out.println("Your balance:"+(balance+b));
                    break;
                case 4:
                    System.out.println("Thank you for coming...");
                    break;
            }
            break;
        }
    }
}
