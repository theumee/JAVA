package StringManipulation;

import java.util.*;
public class revString {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strlen = str.length();
        int begin = 0;
        int end = strlen - 1;
        int mid = (int)Math.ceil(strlen/2);
        char[] arr = new char[strlen];

        for(int i = 0 ; i < strlen ; i++ ){
            arr[i] = str.charAt(i);
        }

        while(begin < mid){
            char tmp;
            tmp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = tmp;
            begin++;
            end--;
        }
        System.out.print(arr);
    }
}
