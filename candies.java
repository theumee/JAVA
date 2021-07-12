import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        if( n % m != 0 || n < m){
            System.out.print("NO");
        }
        else {
            System.out.print("YES");
        }
    }
}
