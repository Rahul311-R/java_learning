import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter the rows:");
        int n = s.nextInt();
        System.out.print("enter the column:");
        int m = s.nextInt();

        int[][] mat = new int[n][m];

        for(int i =0;i<n;i++){
            for(int j =0 ;j<m;j++){
                mat[i][j]=s.nextInt();
            }
        }

        System.out.println("the matrix:");
        for(int i =0;i<n;i++){
            for(int j =0 ;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
