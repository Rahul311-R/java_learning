import java.util.Scanner;

public class perfect_sqr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sq = (int)Math.sqrt(n);
        System.out.println(sq);
        if(sq*sq == n) {
            System.out.println("Perfect");
        }else{
            System.out.println("Not perfect");
        }
    }
}
