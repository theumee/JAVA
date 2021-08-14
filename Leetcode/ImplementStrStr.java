package JAVA.Leetcode;


public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        int sublen = needle.length();
        int len = haystack.length();
        if(sublen == 0)
            return 0;

        for(int i = 0 ; i < len - sublen + 1 ; i++){
            int j = 0;
            if(haystack.charAt(i) == needle.charAt(j)){
                boolean flag = true;
                int index = i;
                while(j < sublen){
                    if(haystack.charAt(index) != needle.charAt(j)){
                        flag = false;
                        break;
                    }
                    index++;
                    j++;
                }
                if(flag){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.print(strStr("hello","ll"));
    }
}
