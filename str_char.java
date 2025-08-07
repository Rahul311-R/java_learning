import java.util.Scanner;

public class str_char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int count=0;
        for(char ch:a.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
