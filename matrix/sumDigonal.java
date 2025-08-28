import java.util.Scanner;

public class sumDigonal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the rows:");
        int n = s.nextInt();
        System.out.print("enter the column:");
        int m = s.nextInt();

        int[][] mat = new int[n][m];
        int a = n * m;
        System.out.print("Enter " + a + " elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                if(i==j){
                    sum += mat[i][j];
                }else if (j==mat.length-i-1){
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
