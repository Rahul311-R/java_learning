import java.util.Scanner;

public class Selection_Sort {

    static int[] selection(int[] arr,int n){
        for(int i = 0;i<n;i++){
            int min = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;//sort done
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n = s.nextInt();
        System.out.print("Enter "+n+" element of the array:");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        selection(arr,n);//func calling
        for(int a :arr){
            System.out.print(a+" ");
        }
    }
}
