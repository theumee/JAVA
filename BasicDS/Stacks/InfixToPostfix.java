package BasicDS.Stacks;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

// don't change the name of this cla
class InfixToPostfix {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        String infix = sc.next();
        StringBuilder postfix = new StringBuilder();

        int len = infix.length();

        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('^',4);
        hm.put('*',3);
        hm.put('/',2);
        hm.put('+',1);
        hm.put('-',0);

        Stack<Character> stk= new Stack<>();
        for(int i = 0 ; i < len ; i++){
            char token = infix.charAt(i);

            if(Character.isLetterOrDigit(token))
                postfix.append(token);
            else if(token == '(') stk.push(token);
            else if(token == ')'){
                while(!stk.empty() && stk.peek() != '('){
                    postfix.append(stk.pop());
                }
                stk.pop();
            }
            else {
                if(!stk.empty() && hm.containsKey(stk.peek()) && hm.get(token) <= hm.get(stk.peek())) {
                    while(stk.empty() || (hm.get(token) <= hm.get(stk.peek()))){
                        postfix.append(stk.pop());
                    }
                }
                stk.push(token);
            }

        }
        while(!stk.empty()){
            if(stk.peek() != '(' || stk.peek() != ')' )
                postfix.append(stk.peek());
            stk.pop();
        }
        System.out.print(postfix);
    }
}
