import java.util.Scanner;

public class jumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0,k=0;
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for (int j=0;j<n-1;j++) {
            for (int i = j; i < n - 1; i++) {
                if (arr[i] > arr[i + 1])
                    k++;
                else
                    break;
            }
            if(k>c)
                c=k;
            k=0;
        }
        System.out.print(c);
    }
}