package Leetcode;

import java.util.HashMap;

public class RomanToInt {
        public static int romanToInt(String s) {
            HashMap<Character , Integer> roman = new HashMap<>();
            roman.put('I',1);
            roman.put('V',5);
            roman.put('X',10);
            roman.put('L',50);
            roman.put('C',100);
            roman.put('D',500);
            roman.put('M',1000);

            char arr[] = s.toCharArray();

            int output = 0;
            for(int  i = 0 ; i < s.length()  ; i++ ){
                output += roman.get(arr[i]);
                if(i > 0 && roman.get(arr[i]) > roman.get(arr[i-1])){
                    output -= (2 * roman.get(arr[i-1]));
                }
            }
            return output;
        }

    public static void main(String[] args) {
        System.out.print(romanToInt("IX"));
    }

}
