package JAVA.InterviewBit;


import java.util.*;

public class ColorfulNumber {
    static List<String> al = new ArrayList<>();
    private static void findsubsequences(String s, String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans + s.charAt(0));

        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
    }
    public static int product(int a){
        int pr = 1;
        while (a > 0){
            pr *= (a%10);
            a /= 10;
        }
        return pr;
    }
    public static int colorful(int A){
        String str = String.valueOf(A);
        findsubsequences(str,"");
        al.remove(al.size()-1);
        Set<Integer> set= new HashSet<>();
        for (String s : al) {
            int k = Integer.parseInt(s);
            set.add(product(k));
        }
        if(set.size() == al.size() )
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        System.out.print(colorful(234));
    }
}
