package JAVA.HackerRank;

import java.io.*;
import java.util.*;

public class LoopExample {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            for(int i = 0 ; i < n ; i++){
                int currentTerm = a + (int)Math.pow(2,i) * b;
                System.out.print(currentTerm + " ");
                a =  currentTerm;
            }
            System.out.println();
        }
    }
}