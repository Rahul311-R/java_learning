import java.util.*;

public class plus_one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int carry=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==9){
                arr[i]=0;
                carry=1;
            }
            else{
                arr[i]=arr[i]+carry;
                break;
            }
        }



        System.out.print(Arrays.toString(arr));

    }
}
