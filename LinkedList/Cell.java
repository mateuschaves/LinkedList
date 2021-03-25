package LinkedList;

public class Cell {
    private Object item;
    private Cell next;

    public Cell(Object item, Cell next) {
        this.item = item;
        this.next = next;
    }
    
    public Cell getNext() {
        return this.next;
    }
    
    public void setNext(Cell next) {
        this.next = next;
    }
    
    public Object getItem() {
        return item;
    }
}