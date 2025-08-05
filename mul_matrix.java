import java.util.Scanner;

public class mul_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows for matrix 1:");
        int r1 = s.nextInt();
        System.out.print("Enter number of columns for matrix 1:");
        int c1 = s.nextInt();

        System.out.print("Enter number of rows for matrix 2:");
        int r2 = s.nextInt();
        System.out.print("Enter number of columns for matrix 2:");
        int c2 = s.nextInt();

       if(c2!=r1) {
           System.out.println("Matrixs cannot be multiplied.");
       }

       int a = c1*r1;
       int b = c2*r2;

       int[][] mat1 = new int[r1][c1];
       int[][] mat2 = new int[r2][c2];
       int[][] mul_mat = new int[r1][c2];//final_matrix



        System.out.print("Enter "+a+" elements for matrix 1:");//input for matrix 1
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                mat1[i][j]=s.nextInt();
            }
        }

        System.out.print("Enter "+b+" elements for matrix 2:");//input for matrix 2
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                mat2[i][j]=s.nextInt();
            }
        }


        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                mul_mat[i][j]=0;
                for(int k= 0;k<c1;k++){
                    mul_mat[i][j] += mat1[i][k]*mat2[k][j];//mul occur
                }
            }
        }


        System.out.println("the final multiple matrix:");//final
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                System.out.print(mul_mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
