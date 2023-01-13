package LinkedLists;

public class DLL {
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value = value;
        }

        public  Node(int value, Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    Node head;

    int size = 0;

    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        size++;
    }

    public void insert (int val){
        if(head == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
        size++;
    }

    public void display(){
        Node tempNode = head;
        while(tempNode !=null){
            System.out.print(tempNode.value+"->");
            tempNode = tempNode.next;
        }
        System.out.print("END");
    }

    public void displayPrev(){
        Node tempNode = head;
        Node last = null;
        while(tempNode !=null){
            System.out.print(tempNode.value+"->");
            last = tempNode;
            tempNode = tempNode.next;
        }
        System.out.print("END");
        System.out.println();

        while(last !=null){
            System.out.print(last.value+"->");
            last = last.prev;
        }
        System.out.print("Start");
    }

    public Node get(int index){
        Node node = head;
        for(int i=1;i<index;i++){
            node = node.next;
        }
        return  node;
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
}

