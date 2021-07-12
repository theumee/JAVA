import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int lim = sc.nextInt();
        int count = 0;
        int[] arr = new int[len];
        for (int i = 0; i < len ; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < len; i++){
            if(arr[i] >= arr[lim - 1] && arr[i] > 0)
                count++;
        }
        System.out.print(count);
    }
}
