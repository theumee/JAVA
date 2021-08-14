package JAVA.BasicDS.LinkedLists;

class ll {
    ll next;
    int val;

    ll(int val) {
        this.val = val;
        next = null;
    }


    public static int check(ll head) {
        ll tmp = head;
        while (head.next != tmp.next) {
            head = head.next;
            if (head.val == tmp.val && head.next == tmp.next)
                return 1;
        }
        return 0;
    }
}
public class CheckCircular {
    public static void main(String[] args) {

    }
    }