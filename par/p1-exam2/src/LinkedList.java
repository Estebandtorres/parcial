/**
 * Implementación simple de una Lista Doblemente Enlazada
 */
public class LinkedList {
    Node<Book> head;
    int size;
    
    
    public LinkedList() {
        this.head = null;
        this.size = 0;
        
    }
    
    
    public void add(Book data) {
        Node<Book> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<Book> actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = newNode;
        }
        size++;
    }
    
    
    public void get(int index) {
 
    }
    
    
    public boolean remove(Book data) {
        if (head == null) {
            System.out.println("No hay nada que eliminar");
            return false;
        }
        Node<Book> actual = head;
        Node<Book> anterior = null;
        while (actual != null) {
            if (actual.data.equals(data)) {
                if (anterior == null) {
                    head = actual.next;
                } else {
                    anterior.next = actual.next;
                }
                size--;
                return true;
            }
            anterior = actual;
            actual = actual.next;
        }
        return false;
    }
    
    
    public boolean contains(Book data) {
        Node<Book> actual = head;
        while (actual != null) {
            if (actual.data.equals(data)) {
                return true;
            }
            actual = actual.next;
        }
        return false;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    
    public void clear() {
        head = null;
        size = 0;   
    }

    public int size() {
        return size;
    }
    
}
