package LinkedLists;

public class Palindrome {

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

        System.out.println(isPalindrome(head));;
    }

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public static boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverse(mid);
        ListNode reverseSecondHead = secondHead;


        // compare both halves
        while(head !=null && secondHead !=null){
            if(head.val != secondHead.val){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        reverse(reverseSecondHead);

        return head == null || secondHead == null;
    }

    public static ListNode middleNode(ListNode head){
          if(head==null || head.next==null){
              return head;
          }

          ListNode s = head;
          ListNode f = head;

          while(f!=null && f.next !=null){
              s = s.next;
              f = f.next.next;
          }
          return s;
    }

    public static ListNode reverse(ListNode head){
        if(head == null|| head.next == null){
            return head;
        }

        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present!= null){
            present.next = previous;
            previous = present;
            present = next;
            if(next !=null){
                next = next.next;
            }
        }
        return previous;
    }

    public static void display(ListNode head){
        ListNode node = head;
        while (node !=null){
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }
}
