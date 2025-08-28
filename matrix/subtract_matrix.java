import java.util.Scanner;

public class subtract_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows in matrix 1:");
        int r1 = s.nextInt();
        System.out.print("Enter number of columns in matrix 1:");
        int c1 = s.nextInt();

        int a = r1*c1;

        System.out.print("Enter number of rows in matrix 2:");
        int r2 = s.nextInt();
        System.out.print("Enter number of columns in matrix 2:");
        int c2 = s.nextInt();

        int b = r2*c2;

        int[][] mat1 = new int[r1][c1];
        int[][] mat2 = new int[r2][c2];
        int[][] sub = new int[r1][c2];

        //mat1 input
        System.out.print("Enter "+a+" elements for matrix 1:");
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                mat1[i][j]=s.nextInt();
            }
        }

        //mat2 input
        System.out.print("Enter "+b+" elements for matrix 2:");
        for(int i = 0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                mat2[i][j]=s.nextInt();
            }
        }

        //real process
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c2;j++){
                sub[i][j] = mat1[i][j]-mat2[i][j];
            }
        }

        //final matrix result
        System.out.println("the final matrix:");
        for(int[] row:sub){
            for(int el:row){
                System.out.print(el+" ");
            }
            System.out.println();
        }

    }
}
