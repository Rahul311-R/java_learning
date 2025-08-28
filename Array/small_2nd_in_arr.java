import java.util.Scanner;

public class small_2nd_in_arr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = s.nextInt();
        }


        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - 1 - i ; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int count = 1;
        boolean found = false;

        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] != arr[i + 1]){
                count++;
                if(count == 2){
                    System.out.println(arr[i + 1]);
                    found = true;
                    break;
                }
            }
        }

        if(!found){
            System.out.println("No second smallest unique element found.");
        }
    }
}
