package SPOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class ObfuscatedProperty {
    static long fusc(long n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(n%2 == 0)
            return fusc(n/2);
        return fusc(n/2) + fusc((n/2) +1);
        }

    public static void main(String[] args) {
//        ArrayList<Long> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
//        for(long i = 0 ; i <= num ; i++){
//            arr.add(fusc(i));
//        }
//        long  max = 0;
//        for(long number : arr){
////            if(number > max)
////                max = number;
//            System.out.print( number + " ");
//        }
////        System.out.print(max);
        long max = fusc(num) / fusc(num+1);
        System.out.println(max);
    }
    }

