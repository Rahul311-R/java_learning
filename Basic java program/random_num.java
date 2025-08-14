import java.util.Random;

public class random_num {
    public static void main(String[] args){
        Random ran = new Random();
        int n = ran.nextInt(1000);
        int n1 = ran.nextInt(100);
        System.out.println(n);
        System.out.println(n1);

    }
}
