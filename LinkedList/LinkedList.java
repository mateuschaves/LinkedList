package LinkedList;

public class LinkedList {

    private Cell first = null;
    private Cell last = null;
    private int length = 0;

    public void append(Object item) {
        Cell newItem = new Cell(item, this.first);
        this.first = newItem;

        if(this.length == 0) {
            this.last = this.first;
        }

        this.length++;
    }

    public void add(Object item) {
        if(this.length == 0) {
            this.append(item);
        } else {
            Cell newItem = new Cell(item, null);
            this.last.setNext(newItem);
            this.last = newItem;
            this.length++;   
        }
    }

    public void add (Object item, int position) {
        if(position == 0) {
            this.append(item);
        } else if (position == this.length) {
            this.add(item);
        } else {
            Cell last = (Cell) this.get(position - 1);
            Cell newItem = new Cell(item, last.getNext());
            last.setNext(newItem);
            this.length++;
        }
    }

    public Object get(int position) {
        if(!busyPosition(position)) {
            throw new IllegalArgumentException("out of bound");
        }
    
        Cell current = this.first;
    
        for(int i = 0; i < position; i++) {
            current = current.getNext();
        }
        return current;
    }

    public Object search(Cell cell) {
        Cell current = this.first;
        for(int i = 0; i < this.length; i++) {
            if(current.getItem() == cell.getItem()) {
                return current;
            }
        }
        return null;
    }

    public void remove(int posicao) {
        if(this.length == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        this.first = this.first.getNext();
        this.length--;
        if(this.length == 0) {
            this.last = null;
        }
    }

    public int size() {
        return this.length; 
    }

    private boolean busyPosition(int position) {
        return position >= 0 && position < this.length;
    }
}