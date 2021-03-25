package DoublyLinkedList;

public class Cell {
    private Object item;
    private Cell previous;
    private Cell next;

    public Cell(Object item, Cell next) {
        this.item = item;
        this.next = next;
    }

    public Cell(Object item) {
        this.item = item;
    }
    
    public Cell getNext() {
        return this.next;
    }
    
    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getPrevious() {
       return this.previous;
    }

    public void setPrevious(Cell previous) {
        this.previous = previous;
    }
    
    public Object getItem() {
        return item;
    }
}