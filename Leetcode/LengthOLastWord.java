package JAVA.Leetcode;


class s2 {
    public int lengthOfLastWord(String s) {
        int slen = s.length();

        int counter = 0;
        if (slen > 0){
            for(int i = slen - 1 ; i >= 0; i--){
                if(s.charAt(i) == ' ')
                    break;
                counter++;
            }
            return counter;
        }
        String str = s.trim();
        return str.length();

    }
}
public class LengthOLastWord {
    public static void main(String[] args) {
        s2 s = new s2();
        System.out.print(s.lengthOfLastWord("a "));
    }
}
