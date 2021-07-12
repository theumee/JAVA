import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static double pow(double n, int x){
        if( x == 1 )
            return n;
        else if (x > 1)
            return n * pow(n,x-1);
        else
            return pow(n,x+1)/n;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            double a = sc.nextDouble();
            int b = sc.nextInt();
            System.out.printf("%.2f\n",pow(a,b));
        }
    }
}