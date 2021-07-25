package JAVA.SPOJ;

import java.util.Scanner;

public class NextPalindrome {
    public static boolean isPalindrome(long n){
        long tmp = n,rem ,rev=0;
        while (tmp>0){
            rem = tmp % 10;
            rev = (rev * 10) + rem;
            tmp = tmp/10;
        }
        return n == rev;
    }

   public static long convert(long n) {
       if (isPalindrome(n))
           return n;
       else
           return convert(n+1);

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextLong();
            arr[i] = convert(arr[i]+1);
        }
        for (int i = 0 ; i < n ;i++)
            System.out.println(arr[i]);

    }
}
