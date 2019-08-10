
package Main;

import Controller.VistaPrincipalController;
import Model.Comida;
import View.VistaPrincipal;

/**
 * Clase principal donde se inicializa las vistas y controles
 * @author jeiso
 */
public class Main {
    public static void main(String[] args) {
        Comida comida=new Comida();
        VistaPrincipal vistaPrincipal=new VistaPrincipal();
        VistaPrincipalController vista=new VistaPrincipalController(comida, vistaPrincipal);
        vistaPrincipal.setVisible(true);
    }
}
