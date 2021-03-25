package DoublyLinkedList;

public class DoubleLinkedList {
    private Cell first = null;
    private Cell last = null;
    private int length = 0;

    public void append(Object item) {
       if(this.length == 0) {
           Cell newItem = new Cell(item);
           this.first = newItem;
           this.last = newItem;
       } else {
            Cell newItem = new Cell(item, this.first);
            this.first.setPrevious(newItem);
            this.first = newItem;
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
            Cell previous = (Cell) get(position - 1);
            Cell next = previous.getNext();
    
            Cell newItem = new Cell(item, previous.getNext());
            newItem.setPrevious(previous);
            previous.setNext(newItem);
            next.setPrevious(newItem);
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

    public void removeFirst() {
        if(this.length == 0) {
            throw new IllegalArgumentException("Empty list");
        }
        this.first = this.first.getNext();
        this.length--;
        if(this.length == 0) {
            this.last = null;
        }
    }

    public void removeLast() {
        if(this.length == 1) {
            this.removeFirst();
        } else {
            Cell penultimate = this.last.getPrevious();
            penultimate.setNext(null);
            this.last = penultimate;
            this.length--;
        }
    }

    public void remove(int position) {
        if(position == 0) {
            this.removeFirst();
        } else if (position == this.length - 1) {
            this.removeLast();
        } else {
            Cell previous = (Cell) this.get(position - 1);
            Cell current = previous.getNext();
            Cell next = current.getNext();
    
            previous.setNext(next);
            next.setPrevious(previous);
    
            this.length--;
        }
    }

    public int size() {
        return this.length; 
    }

    private boolean busyPosition(int position) {
        return position >= 0 && position < this.length;
    }
}

    