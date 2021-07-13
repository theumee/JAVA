package JAVA.StringManipulation;

public class CheckCanBeConvertedToPalindrome {
    public static boolean checkIfPalindrome(String sentence) {
        int[] arr = new int[26];
        for (char ch : sentence.toCharArray())
            arr[ch - 'a']++;
//        int len = sentence.length();
//        if(len % 2 == 0){
//            for(int i = 0 ; i < len ; i++) {
//                if (arr[i] % 2 == 0)
//                    return true;
//            }
//        }else {
            int flag = 0;
            for(int val : arr){
                if(val % 2 == 1)
                    flag++;
                if(flag > 1)
                    return false;
            }
            return true;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.print(checkIfPalindrome(str));
    }
}
