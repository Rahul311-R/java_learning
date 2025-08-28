import java.util.Scanner;

public class pov_or_neg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>0){
            System.out.println("It is a positive number");
        }else if(n<0){
            System.out.println("It is a negative number");
        }else{
            System.out.println("It is zero");
        }
    }
}
