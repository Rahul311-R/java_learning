package OOPS;

public class Try_catch {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);  // ArrayIndexOutOfBounds
            int num = 10 / 0;            // ArithmeticException
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range!");
        }
        catch (Exception e) {
            System.out.println("General Error: " + e);
        }
    }
}
