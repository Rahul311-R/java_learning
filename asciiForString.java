import java.util.Scanner;

public class asciiForString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your String:");
        String str= s.nextLine();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int n = (int)ch;
            System.out.println("Ascii value for "+ch+" is "+n);
        }
    }
}
