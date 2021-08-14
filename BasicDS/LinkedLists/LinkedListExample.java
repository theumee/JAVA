package JAVA.BasicDS.LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(1,20);
        ll.pollLast();
        ll.addFirst(99);
        ll.add(90);
        System.out.println(ll);
    }
}
