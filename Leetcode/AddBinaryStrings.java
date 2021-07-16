package JAVA.Leetcode;

class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }
        while(a.length() != b.length()){
            b = '0' + b ;
        }

        int len = a.length() - 1;

        int carry  = 0;
        int sum ;
        String sumstr = "";
        for(int  i = len ; i >= 0 ; i--){
            int x = Character.getNumericValue(a.charAt(i));
            int y = Character.getNumericValue(b.charAt(i));
            sum = x + y + carry;
            if(sum == 2) {
                carry = 1;
                sum = 0;
            }
            else if(sum == 3)
                sum = 1;
            else
                carry = 0;
            sumstr = sum + sumstr;
        }
        if(carry == 1){
            sumstr = carry + sumstr;
        }
        return sumstr;
    }
}
public class AddBinaryStrings {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.addBinary("1111", "1111"));
    }
}
