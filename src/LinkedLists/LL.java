package LinkedLists;

public class LL {
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public  Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    Node tail;
    Node head;

    int size = 0;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i =1; i < index;i++){
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }

    // insert using recursion
    public void insertUsingRecursion(int val,int index){
        head = insertUsingRec(val,index,head);
    }

    private Node insertUsingRec(int val,int index,Node node){
        if(index ==0){
            Node tempNode = new Node(val,node);
            size++;
            return tempNode;
        }

        node.next = insertUsingRec(val,index--,node.next);
        return node;
    }
    public void display(){
        Node tempNode = head;
        while(tempNode !=null){
            System.out.print(tempNode.value+"->");
            tempNode = tempNode.next;
        }
        System.out.print("END");
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = head;
        }
        size--;
        return value;
    }

    public Node get(int index){
        Node node = head;
        for(int i=1;i<index;i++){
            node = node.next;
        }
        return  node;
    }

    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int deleteIndex(int index){
        if(index ==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }

        Node previous = get(index-1);
        int val = previous.next.value;
        previous.next = previous.next.next;
        return val;
    }

    public Node find(int value){
        Node node = head;
        while (node !=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void removeDuplicates(){
        Node node = head;
        if(head == null){
            return;
        }
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // merge
    public static LL merge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while(f!=null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f !=null){
            ans.insertLast(f.value);
            f = f.next;
        }

        while (s!=null){
            ans.insertLast(s.value);
            s =s .next;
        }

        return  ans;
    }

    // recursion reverse
    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // in place reversal of linked a list

    // reverse between a range

    public Node reverseRange(Node head,int right,int left){
        if(left == right){
            return head;
        }

        Node present = head;
        Node prev = null;

        // move the present to left-1 node
        for(int i=0;present != null &&i<left; i++){
            prev = present;
            present = present.next;
        }

        // last node before the range
        Node last = prev;
        // first node in the range becomes new end
        Node newEnd = present;

        // reverse between left and right
        Node next = present.next;
        for(int i=0;present !=null && i<right-left +1;i++){
            present.next = next;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }

        if(last !=null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = present;
        return  head;
    }

    // find middle node
    public Node middleNode(Node head) {
        Node f = head;
        Node s = head;

        while(f !=null && f.next !=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

}
