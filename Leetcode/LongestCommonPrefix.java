package Leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int index = 0,flag = 0;
        String ans = "";
        int minlength = Integer.MAX_VALUE;
        int arr[] = new int[strs.length];
        for(int i = 0 ; i < strs.length ; i++ ){
            arr[i] = strs[i].length();
        }
        for (int val : arr) {
            if (val < minlength)
                minlength = val;
        }
        while(index < minlength){
            for(int i = 0 ; i < strs.length - 1 ; i++){
                if(strs[i].charAt(index) == strs[i+1].charAt(index))
                    flag++;
            }
            if(flag == (strs.length - 1)){
                ans += strs[0].charAt(index);

            }else{
                break;
            }
            index++;
            flag = 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] strarr = {"blah","bla","blsdasd","blsud"};
        System.out.print(longestCommonPrefix(strarr));
    }

}
