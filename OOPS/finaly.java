package OOPS;

public class finaly {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;   // This will throw ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
        finally {
            System.out.println("This block always runs!");
        }

        System.out.println("Program continues...");
    }
}
