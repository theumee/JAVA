package StringManipulation;

import java.util.*;
public class PairHate {

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            int strlen = str.length();
            String alphabets = "abcdefghijklmnopqrstuvwxyz";
            String newStr = "";
            int[] arr = new int[26];
            for(char ch : str.toCharArray())
                arr[ch - 'a']++;
            for(int i = 0 ; i < strlen; i++){
                if(arr[i] == 1){
                    newStr = newStr + alphabets.charAt(i) ;
                }
            }
            System.out.print(newStr);
        }
    }

