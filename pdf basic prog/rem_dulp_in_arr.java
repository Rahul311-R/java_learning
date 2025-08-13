import java.util.Scanner;

public class rem_dulp_in_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i = 0; i<arr.length;i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
