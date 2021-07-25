package JAVA.GroupHacathon2;

import java.util.Scanner;

public class FindF1 {
    static long p = 1000000007;

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        long n = sc.nextLong();
        long Fn = sc.nextLong();

        while (n > 1){
            for(long i = 0 ; i <= p  ; i++) {
                    if( (i + i) % p == Fn ) {
                        Fn = i;
                        break;
                    }
            }
            n--;
        }
        System.out.print(Fn);
    }
}
