package Combinoterics;

import java.util.Scanner;

public class SimpleColors {
    static long mod = 1000000007;

    static long quickpow(long base, long exp){
        long result = 1;
        while (exp > 0){
            if((base&1) > 0)
                result = result * base % mod;
            exp >>= 1;
            base = base * base % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(((k%mod) * quickpow(k-1,n-1) )% mod);
    }
}
