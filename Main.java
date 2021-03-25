import LinkedList.LinkedList;
import DoublyLinkedList.DoubleLinkedList;

public class Main {
    public static void main(String args[]) {
        ListTypeEnum listType = ListTypeEnum.LINKED_LIST;
        if(ListTypeEnum.LINKED_LIST == listType) {
            testLinkedList();
        }

        if(ListTypeEnum.DOUBLY_LINKED_LIST == listType ) {
            //
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

        System.out.println(linkedList.toString());
    }
}
