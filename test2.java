import java.util.*;

public class test2 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n,c;

        while(t-- > 0){
            n = sc.nextLong();
            if(n>4)
                c = 1;
            else
                c = 0;
            for(long i = 5; i <= n ; i+=2  ){
                if(divisors(i))
                    c++;
            }
            System.out.println(c);
        }
    }
    public static boolean divisors(long n){
        long f = 0 ;
        long i = 1;
        while( i <= Math.sqrt(n)){
            if(n%i == 0) {
                f++;
                if(n/i != i)
                    f++;
            }
            i++;
        }
        return f == 3;
    }
}
