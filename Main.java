import LinkedList.LinkedList;
import DoublyLinkedList.DoubleLinkedList;

public class Main {
    public static void main(String args[]) {
        ListTypeEnum listType = ListTypeEnum.DOUBLY_LINKED_LIST;
        if(ListTypeEnum.LINKED_LIST == listType) {
            testLinkedList();
        }

        if(ListTypeEnum.DOUBLY_LINKED_LIST == listType ) {
            testDoublyLinkedList();
        }
    }


    public static void testLinkedList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Mateus");
        linkedList.add("Ana");
        linkedList.add("Duds");
        linkedList.add("Andreza");
        linkedList.add("Nathy");
        linkedList.add("Marcelinha");

        linkedList.add("Lívia", 3);


        System.out.println(linkedList.search("Ana"));
        System.out.println(linkedList.toString());
    }


    public static void testDoublyLinkedList() {
        DoubleLinkedList doublyLinkedList = new DoubleLinkedList();
        doublyLinkedList.append("Mateus");
        doublyLinkedList.append("Ana");
        doublyLinkedList.append("Duds");
        doublyLinkedList.append("Andreza");
        doublyLinkedList.append("Nathy");
        doublyLinkedList.append("Marcelinha");

        doublyLinkedList.add("Lívia", 3);

        doublyLinkedList.remove(3);

        System.out.println(doublyLinkedList.toString());
    }
}
