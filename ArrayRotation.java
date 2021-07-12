
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while ( testcases-- > 0) {
            int length = sc.nextInt();
            int r = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
               arr[i] = sc.nextInt();
            }
            int[] brr = new int[length];
            int i = 0;
            for(int j = 0 ; j < length - r; j++){
             brr[j] = arr[i+r];
             i++;
            }
            for(int  j = length-r ; j < length;j++ ){
                brr[j] = arr[length - i];
                i--;
            }
            for (int j:
                 brr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}