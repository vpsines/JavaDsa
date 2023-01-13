package LinkedLists;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);

        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);


        linkedList.insertLast(99);
        linkedList.insert(2,2);

        linkedList.display();

        DLL dlinkedList = new DLL();
        dlinkedList.insertFirst(1);
        dlinkedList.insertFirst(2);

        dlinkedList.insertFirst(3);
        dlinkedList.insertFirst(4);
        dlinkedList.insertFirst(5);
        dlinkedList.insertFirst(6);

        dlinkedList.insertLast(55);
        dlinkedList.display();
    }

}
