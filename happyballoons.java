import java.util.Scanner;

public class happyballoons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n+1;
        int[] a = new int[m];
        int count = 0;
        a[0] = 0;
        for (int i = 1 ; i <= n ; i++ ){
            a[i] = sc.nextInt();
            if((i % 2 == 0 && a[i] % 2 ==0) || (i % 2 != 0 && a[i] % 2 != 0) )
                count++;
        }
        System.out.print(count);
    }
}
