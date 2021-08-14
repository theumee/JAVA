package JAVA.BasicDS.LinkedLists;

class Node{
    int data;
    Node next;
    private Object val;
}
public class LinkedList {
    Node head;

    void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if( head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }
    void show(){
        Node node = head;
        while(node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }
    void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    void insertAt(int index,int data){

            Node node = new Node();
            node.data = data;
            node.next = null;

            if(index == 0) {
                insertAtStart(data);
            }
            else {
                Node n = head;
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
            }
    }

    void deleteAt(int index){
        if (index == 0)
            head = head.next;
        else{
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }

    }
    public void size(){
        Node n = head.next;
        int i = 1;
        while(n != null){
            i++;
            n = n.next;
        }
        System.out.print(i);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(15);
        ll.insert(45);
        ll.insert(54);
        ll.size();
        ll.show();
        ll.insertAtStart(23);
        ll.insertAt(1,16);
        ll.show();
        ll.deleteAt(0);
        ll.show();
    }
}

