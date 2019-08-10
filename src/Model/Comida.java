
package Model;

/**
 * Clase encargada de representar el objeto a agregar que es comida
 * @author jeiso
 */
public class Comida {
    
    /**
     * Atributo de la clase que guarda el nombre de la comida
     */
    private String nombreComida;

    
    /**
     * Constructor de la clase vacio
     */
    public Comida() {
    }

    /**
     * Constructor de la clase
     * @param nombreComida 
     */
    public Comida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    /**
     * Metodo encargado de devolver el valor del atributo nombreComida
     * @return 
     */
    public String getNombreComida() {
        return nombreComida;
    }

    /**
     * Metodo encargado que cambia el valor del atributo nombreComida
     * @param nombreComida 
     */
    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }
    
}
