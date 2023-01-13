package LinkedLists;

public class MergeSort {
      public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        ListNode mid = middleNode(head);
        ListNode right = sortList(head);
        ListNode left = sortList(mid);

        return merge(right,left);
    }

    public ListNode merge(ListNode first,ListNode second){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(first!=null && second != null){
            if(first.val < second.val){
                tail.next = first;
                first = first.next;
                tail = tail.next;
            }else{
                tail.next = second;
                second = second.next;
                tail = tail.next;
            }
        }

        tail.next = first != null ? first : second;
        return  dummyHead.next;
    }

    // find middle node
    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode s = head;

        while(f !=null && f.next !=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


}
