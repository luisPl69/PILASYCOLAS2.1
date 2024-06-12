import java.util.Stack;

import Ejercicio1.ValidarSigno;
import Ejercicio2.OrdenarStrack;
import Ejercicio3.LinkedListEjr;
import Materia.Colas.Cola;
import Materia.Colas.ColaGenerica;
import Materia.ListasEnlazadas.ListaEnlazada;
import Materia.Models.Pantalla;
import Materia.Pilas.Pila;
import Materia.Pilas.PilaGenerica;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Pila pilita = new Pila();
        pilita.push(10);
        pilita.push(20);
        pilita.push(30);
        pilita.push(40);

        System.out.println("Elemento en la cima de la  fila es:" + pilita.peek());
        System.out.println("Elemento eliminado de la fila es:" + pilita.pop());
        System.out.println("Elemento en la cima de la fila  es:" + pilita.peek());
        System.out.println("");

        // Implementacion de fila generica
        PilaGenerica<Pantalla> pilaPantalla = new PilaGenerica<>();
        pilaPantalla.push(new Pantalla("Home Page", "/home"));
        pilaPantalla.push(new Pantalla("Home Page", "/home/menu"));
        pilaPantalla.push(new Pantalla("Settings Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla:\n\t-->" + pilaPantalla.peek().getNombre());
        System.out.println("Destruir pantalla:\n\t-->" + pilaPantalla.pop().getNombre());
        System.out.println("Estoy en la pantalla:\n\t-->" + pilaPantalla.peek().getNombre());
        pilaPantalla.push(new Pantalla("User Page", "/home/menu/settings"));
        System.out.println("Estoy en la pantalla:\n\t-->" + pilaPantalla.peek().getNombre());

        System.out.println("");

        // IMPLEMENTACION DE COLA GENERICA TIPO PANTALLA
        Cola queue = new Cola();
        queue.addNode(10);
        queue.addNode(20);
        queue.addNode(30);

        // Mostrar elemento de frente
        System.out.println("El elemento del frente es:-->" + queue.peek());// 10

        // Retirar elementos de la cola
        System.out.println("Elemento retirado:-->" + queue.remove());// 10
        System.out.println("Elemento del frente-->:" + queue.peek());// 20

        System.out.println("Elemento retirado:-->" + queue.remove());// 20
        System.out.println("Elemento del frente es:-->" + queue.peek());// 30

        // Verificar si la cola esta vacia
        System.out.println("Cola vacia ? --> " + (queue.isEmpty() ? "Si" : "No"));// false
        System.out.println("La cola tiene " + queue.size() + " Numero de elementos");

        // IMPLEMENTACION COLA GENERICA
        ColaGenerica<Pantalla> quColaGenerica = new ColaGenerica<>();
        quColaGenerica.allNode(new Pantalla("Home Page", "Home "));
        quColaGenerica.allNode(new Pantalla("Menu Pege", "Home/Menu"));
        quColaGenerica.allNode(new Pantalla("Settings Page", "/home/menu/settings"));

        System.out.println("Estoy en la pantalla \n\t--->" + quColaGenerica.peek().getNombre());
        System.out.println("Pantalla destruida \n\t--->" + quColaGenerica.remove().getNombre());
        quColaGenerica.allNode(new Pantalla("User Page", "User page/home/menu/settings"));
        System.out.println("Estoy en la pantalla\n\t--->" + quColaGenerica.peek().getNombre());
        System.out.println("Pantalla destruida\n \t--->" + quColaGenerica.remove().getNombre());
        System.out.println("Pantalla destruida \n\t--->" + quColaGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla\n \t--->" + quColaGenerica.peek().getNombre());
        System.out.println("La cola tiene " + quColaGenerica.size() + " Numero de elementos");

        // Comprobamos el ejercicio 1 
        ValidarSigno validador = new ValidarSigno();
        String inputString = "([]){}";
        System.out.println("El string " + inputString + " es válido: " + validador.esValido(inputString));
        
        ///////////////////////////////////////////////////////////////////////

        // Ejercicio Segundo para ir comprobando stack

        Stack<Integer> pilas = new Stack<>();
        pilas.push(5);
        pilas.push(1);
        pilas.push(4);
        pilas.push(2);

        System.out.println("Pila antes de ordenar: " + pilas);

        OrdenarStrack.ordenar(pilas);

        System.out.println("Pila después de ordenar: " + pilas);

        // Usamos la lista enlazada aquí
        ListaEnlazada lista = new ListaEnlazada();
        lista.addNode(1);
        lista.addNode(4);
        lista.addNode(3);
        lista.addNode(6);
        lista.printList(); // Should print: 1 4 3 6
        lista.deleteNode(1);
        lista.printList(); // Should print: 4 3 6
        lista.deleteNode(3);
        lista.printList(); // Should print: 4 6


        ///////////////////////////////////////////////////////////////////////////////////////777
        LinkedListEjr ll = new LinkedListEjr();
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(7);
        ll.add(6);
        
        int n = 1; // Encontrar el nodo 1 desde el final
        int result = ll.findNthNodeFromEnd(n);
        if (result != -1) {
            System.out.println("El nodo " + n + " desde el final es: " + result);
        } else {
            System.out.println("No se encontró el nodo " + n + " desde el final.");
        }
    }
    
}



    
          



