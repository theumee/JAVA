package JAVA.BasicDS.Queue;





import java.util.*;

class QueueEx {

    int[] arr = new int[100];
    int size;
    int front;
    int rear;

    public void enQueue(int data) {

        arr[rear] = data;
        rear = rear + 1;
        size++;

        System.out.println(size);
    }

    public void deQueue() {
        if(size == 0){
            System.out.println(-1 + " " + size);
        }
        else{
            System.out.print(arr[front] + " ");
            front = front + 1;
            size--;
            System.out.println(size);
        }
    }
}
class HE_queueEx {



    public static void main(String[] args ) throws Exception {
        QueueEx qu = new QueueEx();

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- > 0){
            if(sc.next().equals("E")){
                qu.enQueue(sc.nextInt());
            }
            else{
                qu.deQueue();
            }
        }
    }
}

