package Ejercicio1;
import java.util.Stack;

public class ValidarSigno {
    // Método para verificar si el string de paréntesis es válido
    public boolean esValido(String s) {
        // Mapa de paréntesis de cierre a apertura correspondiente
        Stack<Character> Pilas = new Stack<>();
        
        //recoore el array con el for 
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                Pilas.push(c);  // Si agregarlo a la pila
            } else if (c == ')' || c == '}' || c == ']') {
                if (Pilas.isEmpty() || !esParCorresponder(Pilas.pop(), c)) {
                    return false;  
                }
            } else {
                return false;  
            }
        }
        
        return Pilas.isEmpty(); 
    }

    
    private boolean esParCorresponder(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }
}    

