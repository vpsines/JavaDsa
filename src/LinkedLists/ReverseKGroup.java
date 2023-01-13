package LinkedLists;

public class ReverseKGroup {
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

    public ListNode reverseKGroup(ListNode head,int k){
        if(k<=1 || head ==null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (true){
            ListNode last = prev;
            ListNode newEnd = current;
            ListNode next = current.next;

            for(int i=0;current !=null && i<k;i++){
                current.next = next;
                prev = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
            }

            if(last !=null){
                last.next = prev;
            }else{
                head = prev;
            }

            newEnd.next = current;


            if(current==null){
                break;
            }
            prev = newEnd;
        }
        return  head;
    }
}
