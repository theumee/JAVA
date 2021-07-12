import java.lang.Math;
public class ex1 {
    static boolean isPrime(int x){
        for (int i = 2 ; i <= Math.sqrt(x) ; i++ ){
            if(x%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 10;
        for (int i = n ; i >= 2 ; i--)
            if (isPrime(i))
                System.out.print(i + " ");
    }
}
