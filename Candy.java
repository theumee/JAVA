import java.util.Scanner;

public class Candy {
    public static long  crush(long n,long c){
        if(n == 0)
            return 0;
        else
            return c*c + crush(n-c, find(n-c));
    }
    public static long find(long n){
        if(n%3 < 1 )
            return n/3;
        else
            return (n/3)+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c ;
        for (int i = 0 ; i < n; i++) {
            long x = sc.nextLong();
            c = find(x);
            System.out.println(crush(x,c));
        }
    }
}
