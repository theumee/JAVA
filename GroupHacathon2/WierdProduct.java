package JAVA.GroupHacathon2;

import java.util.Scanner;

public class WierdProduct {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] left = new long[2];

        for(int i = 0 ; i < 2 ; i++)
            left[i] = sc.nextLong();

        long[] right = new long[2];

        for(int i = 0 ; i < 2 ; i++)
            right[i] = sc.nextLong();

        long p = 1000000007;


        long Product = 0;
        long maxProduct = Long.MIN_VALUE;

        for(int i = 0 ; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                Product =left[i]*right[j];
                if (Product > maxProduct)
                    maxProduct = Product;
            }
        }
        System.out.print(maxProduct);
    }
}
