package Materia.ListasEnlazadas;

public class ListaEnlazada {

    public class Node {
        public int value;
        public Node next;
    
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node head;

    public ListaEnlazada(){

    }
    // Agregar nodos a las listas 


    public void addNode(int value){
        if (head == null){
            head =new Node (value);
            return;
        }

        Node current=head;
        while (current.next !=null) {
            current=current.next;
            
        }
        current.next=new Node (value);

    }
    //Metodo para eliminar x valor 

    public void deleteNode(int value){
        if(head==null) return; //No hay elementos no hagas nada 
        
        if (head.value==value){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next !=null) {
            if(current.next.value==value){
                current.next=current.next.next;
                return;
            }
            current=current.next;
            
        }
    }
    public void printList() {
        if (head==null){
            System.out.println("Lista vacia");
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.print("Node"+current.value );
            current = current.next;
        }
        System.out.println("Fin de la lista ");
    }
    //Claudia Quevedo

}
