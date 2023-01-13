package LinkedLists;

public class RotateLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //display(head);

    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode rotateRight(ListNode head, int k) {

        if(k<=0 || head == null || head.next == null){
            return head;
        }
        int l = getLength(head);
        int r = k % l;

        for(int i=0; i<r;i++){
            ListNode prevLast = head;
            while (prevLast.next.next != null){
                prevLast = prevLast.next;
            }
            prevLast.next.next = head;
            head = prevLast.next;
            prevLast.next =null;
        }
        return head;
    }

    public static int getLength(ListNode head){
        int l = 1;
        ListNode node = head;
        while (node.next !=null){
            l++;
            node = node.next;
        }
        return l;
    }
}
