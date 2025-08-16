package OOPS;

public class Try_catch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // risky code
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
}
