package SPOJ;

import java.lang.Math;
import java.util.Scanner;

class primeGenerator {
    static boolean[] Sieve(int n) {
        boolean prime[] = new boolean[n + 1];

        for (int i = 0; i < (n + 1); i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int begin = sc.nextInt();
            int end = sc.nextInt();
            boolean[] prime = Sieve(end);
            for (int i = end; i >= begin; i--)
                if (prime[i])
                    System.out.println(i);
            System.out.println();
        }
    }
}
