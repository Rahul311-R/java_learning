import java.util.Scanner;

public class rev_String {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word:");
        String a = s.nextLine();
        String rev = "";
        for(int i = a.length()-1;i>=0;i--){
            rev += a.charAt(i);
        }
        System.out.println(rev);
        if (rev.equals(a)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
