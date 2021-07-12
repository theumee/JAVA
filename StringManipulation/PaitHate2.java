package StringManipulation;

import java.util.*;
public class PaitHate2 {

        public static void main (String[] args) {
            // Your code here
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            LinkedHashMap<Character,Long> hm = new LinkedHashMap<>();
            for(int i= 0;i<st.length();i++) {
                if(hm.containsKey(st.charAt(i))) hm.put(st.charAt(i),hm.get(st.charAt(i))+1L);
                else hm.put(st.charAt(i),1L);
            }
            for(int i = 0;i<st.length();i++) {
                if(hm.get(st.charAt(i))%2 == 1) {
                    System.out.print(st.charAt(i));
                }
            }
        }
    }

