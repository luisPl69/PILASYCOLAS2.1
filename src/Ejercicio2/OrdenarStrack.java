package Ejercicio2;
import java.util.Stack;

public class OrdenarStrack {

    public static void ordenar(Stack <Integer> pilas){
        Stack<Integer> pilaNueva=new Stack<>();

        while (!pilas.isEmpty()) {
            
            int temp=pilas.pop();

            while (!pilaNueva.isEmpty()&& pilaNueva.peek()>temp) {
                pilas.push(pilaNueva.pop());
                
            }
            pilaNueva.push(temp);

            while (!pilaNueva.isEmpty()) {
                pilas.push(pilaNueva.pop());
                
            }

            
        }
    }



}