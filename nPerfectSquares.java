//Java implementation of the approach
import java.io.*;

class GFG
{

    // Function to print all the perfect
// squares from the given range
    static void perfectSquares(int l, int r)
    {
        for (int i = l; i <= r; i+=2)
        {
            if (Math.sqrt(i) == (int)Math.sqrt(i))
                System.out.print(i + " ");
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        int l = 5, r = 10000;
        perfectSquares(l, r);
    }
}