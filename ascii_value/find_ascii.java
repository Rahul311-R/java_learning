import java.util.Scanner;

public class find_ascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the character:");
        char a = s.next().charAt(0);
        int b = (int) a;
        System.out.println("the ascii value of "+a+" is "+b);
    }
}
