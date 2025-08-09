import java.util.Scanner;

public class zero_end {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int index = 0;
        for(int i = 0 ;i<n;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<n){
            arr[index]=0;
            index++;
        }

        for(int v:arr){
            System.out.print(v+" ");
        }

    }
}
