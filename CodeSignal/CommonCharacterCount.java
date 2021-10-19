package JAVA.CodeSignal;

public class CommonCharacterCount  {
    static int commonCharacterCount(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char c : s1.toCharArray()){
            count1[c - 'a']++;
        }
        for(char c : s2.toCharArray()){
            count2[c - 'a']++;
        }

        for(int i = 0 ; i < 26 ; i++)
            count1[i] = Math.min(count1[i],count2[i]);

        int count = 0;
        for(int i = 0 ; i < 26 ; i++)
            count += count1[i];
        return count;
    }

    public static void main(String[] args) {
        String s1 = "abcaa";
        String s2 = "abacc";

        System.out.print(commonCharacterCount(s1,s2));

    }

}
