import java.util.Scanner;

public class upper_triangle_mat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = s.nextInt();
        System.out.print("Enter the number of columns:");
        int m = s.nextInt();

        int a = n*m;

        int[][] mat = new int[n][m];

        System.out.print("Enter "+a+" elements for the matrix:");
        for(int i =0;i<n;i++){
            for(int j= 0;j<m;j++){
                if(i<=j){
                    mat[i][j]=s.nextInt();}
                else{
                    mat[i][j]=0;
                }
            }
        }

        System.out.println("matrix:");
        for(int[] t : mat){
            for(int b : t){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
