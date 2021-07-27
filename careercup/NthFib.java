package JAVA.careercup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NthFib {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 1;
        int c = a + b;
        for(int i = 3 ; i < n ; i++){
            a = b;
            b = c;
            c = a+b;
            System.out.print(c + " ");
        }
        System.out.println();
        if(n == 1)
            System.out.print(a);
        else if(n == 2)
            System.out.print(b);
        else
            System.out.print(c); // 0 1 1 2 3 5 8 13
    }
}
