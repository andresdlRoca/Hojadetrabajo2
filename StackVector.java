import java.util.Vector;

/**
 * Clase de stack que implementa la interfaz StackVector, esta clase se encargara
 * del funcionamiento del almacenamiento de la calculadora.
 * @author Andres de la Roca
 */

public class StackVector<E> implements Stack<E> {
    
    Vector<E> datos = new Vector<E>();

    public void push(E num) {

        datos.add(num);
        
    }

    public E pop() {

        E elementopopeado = datos.lastElement();
        datos.remove(elementopopeado);
        return elementopopeado;

    }

    public E peek() {

        E ultimoelemento = datos.lastElement();
        return ultimoelemento;

    }

    public boolean empty() {

        return datos.isEmpty();

    }

    public int size() {

        return datos.size();

    }
    
}
