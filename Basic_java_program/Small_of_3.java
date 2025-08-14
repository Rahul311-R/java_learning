import java.util.Scanner;

public class Small_of_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),b = s.nextInt(),c = s.nextInt();
        int small = (a < b) ? (a < c ? a : c ) : (b < c ? b : c);
        System.out.println(small);
    }
}
