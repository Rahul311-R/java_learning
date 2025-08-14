import java.util.Scanner;

public class inverted_right_angle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        for(int i = n-1;i>=0;i--){
            for(int j= 0 ;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
