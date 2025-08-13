import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = s.nextInt();
        int org = a;
        int rev = 0;
        while(a!=0){
            rev = rev*10+ a%10;
            a /= 10;
        }
        System.out.println(rev);
        if(org==rev){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
