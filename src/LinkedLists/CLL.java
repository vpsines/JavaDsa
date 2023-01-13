package LinkedLists;

public class CLL {
    private class Node{
        int value;
        Node next;

         Node(int value){
            this.value = value;
        }

        Node(int value,Node next){
             this.value = value;
             this.next = next;
        }
    }

    private  Node head;
    private  Node tail;

    public CLL(){
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head =node;
            tail = node;
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;

    }

    public  void display(){
     Node node = head;
     if(head !=null){
        do{
            System.out.println(node.value + "->");
            node = node.next;
        }while (node != head);
     }else{
         System.out.println("Empty");
     }

    }

    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

    }

}
