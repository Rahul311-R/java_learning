import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        boolean prim=true;
        if(n<=1){
            prim=false;
        }else{
            for(int i = 2;i <= Math.sqrt(n);i++){
                if(n%i==0){
                    prim=false;
                    break;
                }
            }
        }


        if(prim){
            System.out.println("It is prime");
        }else{
            System.out.println("It is not prime");
        }
    }
}
