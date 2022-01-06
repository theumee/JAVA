package Test;

import java.util.Stack;

public class ValidStrings {
    public static void main(String[] args) {
        System.out.println(valid("[{}]"));
        System.out.println(valid("(]"));
        System.out.println(valid("(){}[]"));
        System.out.println(valid("([])"));

    }
    public  static boolean valid(String s){
        Stack<Character> stk = new Stack<>();
        int len = s.length();
        if(len%2 == 1)
            return false;
        for(int i = 0 ; i < len ; i++){
            char ch = s.charAt(i);
            if(stk.isEmpty()){
                stk.push(ch);
                continue;
            }
            if(ch - stk.peek() == 2 ||  ch - stk.peek() == 1) {
                stk.pop();
            }
            else
                stk.push(ch);
        }
        return stk.isEmpty();
    }
}
