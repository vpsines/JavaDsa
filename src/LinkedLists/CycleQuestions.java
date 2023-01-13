package LinkedLists;

public class CycleQuestions {

    public static void main(String[] args) {

    }

    class ListNode {
    int val;
    ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
      }
  }

    // checks if cycle exists
    public static boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f !=null && f.next != null){
            f = f.next;
            s = s.next;
            if(f ==s ){
                return true;
            }
        }
        return false;
    }

    // checks if cycle exists
    public static int getCycleLength(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while(f !=null && f.next != null){
            f = f.next;
            s = s.next;
            if(f ==s ){
                // calculate length

                ListNode node = s;
                int length = 0;
                do{
                    node = node.next;
                    length++;
                }while(node != s);
                return length;
            }
        }
        return 0;
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        int length = 0;
        while(f !=null && f.next != null){
            f = f.next.next;
            s = s.next;
            if(f ==s ){
                // calculate length
                length = getCycleLength(head);
                break;
            }
        }

        if(length ==0){
            return null;
        }

        // find the start node
         f = head;
         s = head;
        while(length >0){
            s = s.next;
            length--;
        }

        // keep moving s and f forward and they will meet at cycle start
        while(f!=s){
            s = s.next;
            f = f.next;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        }while (fast != slow);

        if(slow ==1){
            return true;
        }
        return false;
    }

    private int square(int n){
        int ans =0;
        while (n >0){
            int d = n % 10;
            ans += d * d;
            n=n/10;
        }
        return ans;
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
