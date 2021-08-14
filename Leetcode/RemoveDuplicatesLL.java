package JAVA.Leetcode;

public class RemoveDuplicatesLL {
     static class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode m = head;
        ListNode n = head.next;
        for(; n.next != null ; n = n.next){
            if(n.val == m.val){
                m.next = n.next;
                continue;
            }
            m = m.next;
        }
        if(m.val == n.val){
            m.next = null;
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(2,n2);
        ListNode head = new ListNode(1,n1);

        head = deleteDuplicates(head);

        for (ListNode i = head ; i != null ; i = i.next)
            System.out.print(i.val + " ");

    }
}
