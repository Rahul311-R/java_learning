import java.util.Scanner;

public class Automorphic_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = s.nextInt();
        int sq = num * num;
        System.out.println(sq);
        if(String.valueOf(sq).endsWith((String.valueOf(num)))){
            System.out.println("It is Automorphic Number");
        }else{
            System.out.println("It is not Automorphic Number");
        }

    }
}