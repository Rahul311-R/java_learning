import java.util.Scanner;

public class mat_equal_not {
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

        if(r1!=r2||c1!=c2){
            System.out.println("matrix is not equal");
        }

        int[][] mat1 = new int[r1][c1];
        int[][] mat2 = new int[r2][c2];

        System.out.print("Enter "+a+" elements for matrix 1:");//input matrix 1
        for(int i = 0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                mat1[i][j]=s.nextInt();
            }
        }


        System.out.print("Enter "+b+" elements for matrix 2:");//input matrix 2
        for(int i = 0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                mat2[i][j]=s.nextInt();
            }
        }

        boolean equal = true;
        for(int i = 0;i<r2;i++){//compare
            for(int j = 0;j<c2;j++){
                if(mat1[i][j]!=mat2[i][j]){
                    equal = false;
                    break;
                }
            }
        }

        if(equal){//final result
            System.out.println("matrix is equal");
        }else{
            System.out.println("matrix is not equal");
        }

    }
}
