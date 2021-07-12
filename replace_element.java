import java.util.Scanner;

public class replace_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0 ; i  < N ; i++){
            arr[i] = sc.nextInt();
        }
        arr2[0] = arr[0] * arr[1];
        arr2[N-1] = arr[N-1] * arr[N-2];
        for (int i =1 ; i < N-1 ;i ++){

            arr2[i] = arr[i-1] * arr[i+1];

        }
        for (int i = 0; i < N; i ++){

            System.out.println(arr2[i]);

        }

    }
}
