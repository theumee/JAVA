import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class pythagoras {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if(A>B && A>C){
            if((A*A) == (B*B) + (C*C))
                System.out.print("YES");
            else
                System.out.print("NO");
        }
        else if(B>C && B>A){
            if((B*B) == (A*A) + (C*C))
                System.out.print("YES");
            else
                System.out.print("NO");
        }
        else if(C>A && C>B){
            if((C*C) == (A*A) + (B*B))
                System.out.print("YES");
            else
                System.out.print("NO");
        }

    }
}