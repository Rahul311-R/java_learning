
public class asciiForAll {
    public static void main(String[] args) {
        for (char ch = 48; ch <= 122; ch++) {
            int asciiValue = (char) ch;

            System.out.println("ASCII value of " + ch +
                    " is: " + asciiValue);
        }
    }
}
