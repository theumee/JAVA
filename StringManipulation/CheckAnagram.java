package JAVA.StringManipulation;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Anagram{
    public static boolean checkIfAnagram(String str1,String str2) {
        int[] arr1 = new int[26];
        for(char ch : str1.toCharArray())
            arr1[ch - 'a']++;
        int[] arr2 = new int[26];
        for(char ch : str2.toCharArray())
            arr2[ch - 'a']++;
        for(int i = 0 ; i < 26 ; i++){
            if(arr1[i] != arr2[i])
                return false;
         }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = checkIfAnagram("manan","naman");
        System.out.print(flag? "YES" : "NO");
    }
}
