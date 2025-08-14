import java.util.Scanner;

public class large_of_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = s.nextInt();
        System.out.print("Enter the second number:");
        int b = s.nextInt();
        System.out.print("Enter the third number:");
        int c = s.nextInt();
        if(a>b+c){
            System.out.println(a+" is the largest number");
        }else if(b>a+c){
            System.out.println(b+" is the largest number");
        }else{
            System.out.println(c+" is the largest number");
        }
    }
}
