package JAVA.BasicDS;


import java.util.Collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        for(int  i = 0 ; i <= 10 ; i++)
            stk.push(i);

        System.out.print("Added Elements of the Stack: \n");
        for (int a : stk)
            System.out.print(a + " ");

        System.out.println();

        System.out.print("Top element of stack: ");
        System.out.println(stk.peek());


        for(int i = 0 ; i < 5 ; i++)
            stk.pop();
        System.out.print("Top Element after removing some elements: ");
        System.out.println(stk.peek());

        stk.sort(Collections.reverseOrder());
        System.out.print("Elements after removing some elements: & reversing:\n");
        for (int a : stk)
            System.out.print(a + " ");
        System.out.println();

        int n = 3;
        System.out.print("1-Based distance of " + n + " from the top Element of stack: ");
        System.out.println(stk.search(n) );



    }
}
