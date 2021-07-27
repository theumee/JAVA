package JAVA.BasicDS.Queue;

public class Runner {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.deQueue();
        q.enQueue(20);
        q.enQueue(43);
        q.enQueue(4);

//        q.show();
//        System.out.println("\nRemoved " + q.deQueue() + " from the front.");

        q.enQueue(1);
        q.enQueue(3);
        q.enQueue(2);
        q.enQueue(5);
        q.enQueue(23);
        q.show();
    }
}
