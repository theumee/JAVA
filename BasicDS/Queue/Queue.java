package JAVA.BasicDS.Queue;

public class Queue {
//    Queue(int size){
//        int[] queue = new int[size];
//    }
    int[] arr = new int[6];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        if(!isFull()) {
            arr[rear] = data;
            rear = (rear + 1) % 6;                // using the mod of size (of array) operation we make this a circular queue(K.O.) also below in front <-|
            size++;                                 // and also while printing
        }else {
            System.out.println("Queue is FULL!");
        }
    }
    public void deQueue(){
        if(!isEmpty()) {
            front = (front + 1) % 6;
            size--;
        }else{
            System.out.println("Queue is EMPTY!");
        }
    }
    void show(){
        for (int i = 0; i < size ; i++ )
            System.out.print( arr[(front + i) % 6] + " " );
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == 6;
    }
}
