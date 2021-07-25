package JAVA.Leetcode;


import java.util.ArrayList;

class S8 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len-1] == 9){
            int j = len-1;
            while (j >= 0 && digits[j] == 9 ) {
                digits[j] = 0;
                j--;
            }
            if(j>=0) {
                digits[j]++;
                return digits;
            }
            int[] arr = new int[len+1];
            arr[0] = 1;
            for(int i = 1 ;i < len+1 ; i++){
                arr[i] = digits[i-1];
            }
            return arr;
        }

        digits[len-1]++;
        return digits;
    }
}
public class PlusOne {
    public static void main(String[] args) {
        S8 s = new S8();
        int[] arr = {9,9,9,9};
        int[] newArr = s.plusOne(arr);
        for(int val : newArr)
            System.out.print(val + " ");
    }
}
