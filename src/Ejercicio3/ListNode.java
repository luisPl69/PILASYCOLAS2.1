package Ejercicio3;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
    public class LinkedList {
        ListNode head;
    
        // Método para agregar un nodo al final de la lista
        public void add(int val) {
            if (head == null) {
                head = new ListNode(val);
            } else {
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new ListNode(val);
            }
        }
    
        // Método para obtener el valor del nodo en la posición N desde el final
        public int getByPos(int position) {
            if (head == null) {
                throw new IllegalArgumentException("La lista está vacía.");
            }
    
            ListNode first = head;
            ListNode second = head;
    
            // Mover el primer puntero `position` nodos adelante
            for (int i = 0; i < position; i++) {
                if (first == null) {
                    throw new IllegalArgumentException("La posición es mayor que el número de nodos en la lista.");
                }
                first = first.next;
            }
    
            // Mover ambos punteros hasta que el primero llegue al final
            while (first != null) {
                first = first.next;
                second = second.next;
            }
    
            // El segundo puntero ahora está en el nodo en la posición `position` desde el final
            if (second == null) {
                throw new IllegalArgumentException("La posición es mayor que el número de nodos en la lista.");
            }
    
            return second.val;
        }
}



    



    



















public int getByPos(int position) {
    if (head == null) {
        throw new IllegalArgumentException("La lista está vacía.");
    }

    ListNode first = head;
    ListNode second = head;

    // Mover el primer puntero `position` nodos adelante
    for (int i = 0; i < position; i++) {
        if (first == null) {
            throw new IllegalArgumentException("La posición es mayor que el número de nodos en la lista.");
        }
        first = first.next;
    }

    // Mover ambos punteros hasta que el primero llegue al final
    while (first != null) {
        first = first.next;
        second = second.next;
    }

    // El segundo puntero ahora está en el nodo en la posición `position` desde el final
    if (second == null) {
        throw new IllegalArgumentException("La posición es mayor que el número de nodos en la lista.");
    }

    return second.val;
}






































