package BitManipulation;

import java.util.Scanner;

public class BitStrings {
    static final long p = 1000000007;
    static long quick_pow(long b, long n) {
        long ans = 1;
        while (n > 0 ) {
            if ((n & 1) != 0)
                ans = ans * b % p;
            n >>= 1;
            b = b * b % p;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(quick_pow(2,n));
    }
}
