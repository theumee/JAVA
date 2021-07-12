package MOD;

import java.util.Scanner;

public class deadlyExp {
    static  long mod = 1000000007;
    static long modpow(long base, long exp) {

            long x = 1;
            while (exp > 0) {
                if (exp % 2 == 1)
                    x = (x * base) % mod;
                base = (base * base) % mod;
                exp = exp / 2;
            }
            return x;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        long a  = sc.nextLong();
        long b  = sc.nextLong();
        long c  = sc.nextLong();
        long d  = sc.nextLong();
        long ans = modpow(c,d);
        ans = modpow(b,ans);
        ans = modpow(a,ans);
        System.out.print(ans);
    }
}
