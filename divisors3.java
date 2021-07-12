import java.util.*;

public class divisors3 {
    static long has3(long x) {
        long c;
        if(x >= 4)
                c = 2;
            else
              c = 0;
        long sr, j = 2 ;
        for (long i = 5; i <= x; i++) {
            sr = (long) Math.sqrt(i);
            if (x % j == 0 && (sr * sr) == i) {
                    c++;
            }
            j++;
        }
        return c;
    }
//    static long div3count(long x)
//    {
//        long c, sr;
//        if(x >= 4)
//            c = 1;
//        else
//            c = 0;
//        for(long i = 5; i <= x ; i+=2){
//            sr = (long)Math.sqrt(i);
//            if((sr * sr) == i && has1(i)) {
//                c++;
//            }
//        }
//        return c;
//    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n;
        while(t-- > 0){
            n = sc.nextLong();
            System.out.println(has3(n));
        }
    }
}
