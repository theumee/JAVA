package JAVA.CodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {
    static String[] allLongestStrings(String[] inputArray) {
        int max = 0 ;
        List<String> li = new ArrayList<>();
        for (String s : inputArray) {
            if (s.length() > max)
                max = s.length();
        }
        for (String s : inputArray) {
            if (s.length() == max)
                li.add(s);
        }

        return li.toArray(new String[0]);

    }

    public static void main(String[] args) {
        String[] arr = {"aaa" ,"bb" , "aba","b","ccc"};
        System.out.print(Arrays.toString(allLongestStrings(arr)));
    }
}
