package JAVA.CodeSignal;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReverseInParanthesis {
    static String reverseInParentheses(String inputString) {

        for(int i = 0 ; i < inputString.length() ; i++ ){
              if(inputString.charAt(i) == '('){
                  inputString = reverseStr(inputString,i+1);
              }
          }

        return inputString;
    }
    static String reverseStr(String str, int start){
        int tmp = start;
        while(str.charAt(tmp) != ')') {
            if(str.charAt(tmp) == '(') str = reverseStr(str,tmp+1);
            tmp++;
        }
        int end = tmp - 1;
//        if(tmp < start) str.replace('(',"");
        String first = str.substring(0,start-1);
        StringBuilder mid = new StringBuilder(str.substring(start,end+1)).reverse();
        String last = str.substring(end+2);

        return first+mid+last;

//        arr = removeParanthesis(arr,);

    }

    public static void main(String[] args) {
        String s = "()(foo(bar(klm))fun)"; // foo(barmlk)fun --> fooklmrabfun
        System.out.print(reverseInParentheses(s));


    }
}
