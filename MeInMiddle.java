import java.util.Scanner;

public class MeInMiddle {

        public static boolean numberCount(int arr[],int k){
            int left = 0;
            int right = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > k) right++;
                if(arr[j] < k) left++;
            }
            return left == right;
        }
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[sc.nextInt()];
            for (int i = 0; i < arr.length ; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if(numberCount(arr,arr[i])){
                    System.out.println(arr[i]);
                    break;
                }
            }

        }

}
