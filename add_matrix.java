import java.util.Scanner;

public class add_matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = s.nextInt();
        System.out.print("Enter the number of columns:");
        int m = s.nextInt();
        int a = n*m;

        int[][] mat1 = new int[n][m];//matrix1
        int[][] mat2 = new int[n][m];//matrix2
        int[][] add_mat = new int[n][m];//final_matrix


        System.out.print("Enter "+a+" elements for matrix 1:");//input_for_matrix1
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                mat1[i][j]=s.nextInt();
            }
        }

        System.out.print("Enter "+a+" elements for matrix 2:");//input_for_matrix2
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                mat2[i][j]=s.nextInt();
            }
        }

        for(int i = 0 ;i<n;i++){//adding_process
            for(int j = 0;j<m;j++){
                add_mat[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(add_mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}
