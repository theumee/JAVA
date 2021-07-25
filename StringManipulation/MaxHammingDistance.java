package JAVA.StringManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class MaxHammingDistance {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        char[] arr = str.toCharArray();
        int mid = (n / 2);
        int i = 0;
        int j = n - 1;
        while (i < mid) {
            if (arr[i] != arr[i + 1])
                swap(arr, i, i + 1);
            if (arr[j] != arr[j - 1])
                swap(arr, j, j - 1);
            i++;
            j--;
        }

        String anagram = String.copyValueOf(arr);
        int count = 0 ;
        for(i = 0 ; i  < n ; i++){
            if(str.charAt(i) != anagram.charAt(i))
                count++;
        }
        System.out.print(count);
    }
    public static void swap(char[] a, int i, int j)
    {
        char temp;
        temp = a[i] ;
        a[i] = a[j];
        a[j] = temp;

    }
}
