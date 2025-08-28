package OOPS;

// Step 1: Create custom exception
class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}

// Step 2: Use custom exception
public class CustomException {
    static void checkAge(int age) throws AgeInvalidException {
        if (age < 18) {
            throw new AgeInvalidException("Age must be 18 or above!");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);  // invalid
        }
        catch (AgeInvalidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
