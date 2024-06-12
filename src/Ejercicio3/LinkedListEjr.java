package Ejercicio3;


class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListEjr {
    private Node head;
    
    public LinkedListEjr() {
        this.head = null;
    }
    
    // Método para insertar un nuevo nodo al final de la lista
    public void add(int newData) {
        Node newNode = new Node(newData);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
    }
    
    // Método para encontrar el nodo N desde el final de la lista
    public int findNthNodeFromEnd(int n) {
        if (head == null) {
            return -1; // Lista vacía
        }
        
        Node fast = head;
        Node slow = head;
        
        // Mover fast n posiciones adelante
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1; // n es mayor que el tamaño de la lista
            }
            fast = fast.next;
        }
        
        // Mover slow y fast juntos hasta que fast llegue al final
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // El nodo en slow es el n-ésimo nodo desde el final
        return slow.data;
    }
}