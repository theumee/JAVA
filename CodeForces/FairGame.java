package JAVA.CodeForces;


import java.util.Arrays;
import java.util.Scanner;

public class FairGame {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        int[] arr = new int[4];
        while (testCases-- > 0){
            for(int i = 0 ; i < 4 ; i++){
                arr[i] = sc.nextInt();
            }

            int a = Math.max(arr[0],arr[1]);
            int b = Math.max(arr[2],arr[3]);
            Arrays.sort(arr);
            if(arr[3] + arr[2] == a + b)
                System.out.println("YES");
            else
                System.out.println("NO");

        }

    }
}
