import java.util.Scanner;

public class double0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a =  new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            if (a[i] == 0 ){
                for(int j = n-1 ; j > i ; j-- ){
                    a[j] = a[j-1];
                }
                i++;
            }
        }
        for (int i = 0 ; i < n ;  i++){
            System.out.print(a[i] + " ");
        }
    }
}
