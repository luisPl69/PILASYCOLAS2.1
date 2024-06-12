package Materia.ListasEnlazadas;

public class ListasEnlazadasGenericas<T> {
    
    // Node class representing each element in the list
    private class Node {
        T data;
        Node next;
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Head node of the list
    private Node head;
    
    // Constructor to initialize the list
    public ListasEnlazadasGenericas() {
        this.head = null;
    }
    
    // Method to add an element to the list
    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    // Method to remove an element from the list
    public void remove(T data) {
        if (head == null) {
            return;
        }
        
        if (head.data.equals(data)) {
            head = head.next;
            return;
        }
        
        Node current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
    
    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
}
