import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = s.nextInt();
        System.out.print("Enter the second number:");
        int b = s.nextInt();
        System.out.print("Enter the operator(+,-,*,/):");
        char op = s.next().charAt(0);
        int res = 0;
        switch(op){
            case '+':
                res = a+b;
            break;
            case '-':
                res = a-b;
                break;
            case '*':
                res = a*b;
                break;
            case '/':
                if(b !=0) {
                    res = a / b;
                    break;
                }else{
                    System.out.println("It can't divided by Zero");
                }
            default:
                System.out.println("Enter the valid operator");
        }
        System.out.println(res);
    }
}
