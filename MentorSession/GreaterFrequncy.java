package JAVA.MentorSession;

import java.util.HashMap;

import java.util.Scanner;

public class GreaterFrequncy {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);

            int len = sc.nextInt();

            int[] arr = new int[len];
            for(int i = 0 ; i < len ; i++)
                arr[i] = sc.nextInt();

            HashMap<Integer, Integer>  hm = new HashMap<>();

            for(int i : arr)
                hm.put(i,0);
            for(int i : arr) {
                int val  = hm.get(i);
                hm.put(i, val+1);
            }

            int[] newArr = new int[len];
            for(int i = 0 ; i < len - 1 ; i++){
                    for(int j = i+1 ; j < len ; j++) {
                        if (hm.get(arr[j]) > hm.get(arr[i])) {
                            newArr[i] = arr[j];
                            break;
                        }
                        newArr[i] = -1;
                    }
                }
            newArr[len-1] = -1;
            for(int val : newArr)
                System.out.print(val + " ");
    }

}
