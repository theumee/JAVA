package JAVA;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class testClass {
    static int subString(char str[], int n,int p) {
        // Pick starting point
        int count = 0;

        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                String tmp = "";
                for (int k = i; k <= j; k++) {
                    tmp = tmp + str[k];
                }
                if( Integer.parseInt(tmp) % p == 0) count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int p = sc.nextInt();

        System.out.print(subString(s.toCharArray(),n,p));
    }
}