package JAVA.Arrays;

import java.util.Scanner;

public class MaxOfAllSubArrays {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = sc.nextInt();

            for(int i = 0 ; i < n-m+1 ; i++){
                int max = Integer.MIN_VALUE;
                for(int j = i ; j < i + m ; j++){
                    if(arr[j] > max)
                        max = arr[j];
                }
                System.out.print(max + " ");
            }
        }
    }

