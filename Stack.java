/**
 * Clase de interfaz que tendra los metodos que usara la clase de stack para el almacenamiento
 * de la calculadora. 
 * @author Andres de la Roca
 */

public interface Stack<T> {
    
    /**
     * Permite almacenar dentro del stack un objeto
     * @param num
     * @return T
     */
    public T Push(int num);

    /**
     * Permite sacar del stack el ultimo objeto que se ingreso
     * @return
     */
    public T Pop();

    /**
     * Devuelve un valor true si el almacenamiento stack esta vacio y false si esta lleno
     * @return
     */
    public boolean Empty();

    /**
     * Devuelve el ultimo objeto que se ingreso al stack
     * @return
     */
    public T Peek();

    /**
     * Devuelve el tamaño del almacenamiento stack
     * @return
     */
    public int Size();

}
