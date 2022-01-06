package BasicDS.LinkedLists;

class Node{
    int data;
    Node next;
}
public class LinkedList {
    Node head;

    public Node mergeTwoLists(Node l1, Node l2) {
        Node i = l1;
        Node j = l2;

        while(i.next != null && j.next != null){
            if(i.data <= j.data){
                i.next = j.next;
                j.next = i;
            }
            j = j.next;
        }
        j.next = i;
        return l2;
    }

    Node insert(int data){
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
        return node;
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
//        Node l1 = ll.insert(1);
//        ll.insert(2);
//        ll.insert(4);
//        Node l2 = ll.insert(1);
//        ll.insert(3);
//        ll.insert(4);
//        Node res = ll.mergeTwoLists(l1,l2);
//        while(res.next != null) {
//            System.out.print(res + " -> ");

        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);

        ll.show();


        }
    }


