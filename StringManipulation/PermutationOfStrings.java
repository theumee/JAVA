package JAVA.StringManipulation;

import java.io.*;
import java.util.*;

public class PermutationOfStrings{
    static  List<String> li= new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        permute(str, 0, n-1);
        Collections.sort(li);
        for(String val: li){
            System.out.print(val + " ");
        }
    }

    static void permute(String str, int l, int r)
    {
        if (l == r){
            li.add(str);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

//    public static void sort(List<String> list){
//        int len = list.size();
//
//        for (int i = 0; i < len; i++){
//            for (int j = i+1; j < len; j++){
//                if (list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list,i,j);
//                }
//            }
//        }
//
//    }

}