package JAVA.CSES;

import java.util.Scanner;

public class MissingNumber {
    static int FindMissing(int[] arr,int len){
        int a = arr[0];
        int b = 1;

        for(int i = 1 ; i < len ; i++){
            a ^= arr[i];
        }

        for(int i = 2 ; i < len+1 ; i++ ){
            b = b ^ i;
        }

        return a^b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n-1 ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(FindMissing(arr,n));
    }
}
