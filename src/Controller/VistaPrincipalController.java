
package Controller;

import Model.Comida;
import View.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Clase encargada de controlar lo que pase en la vista principal
 * @author jeiso
 */
public class VistaPrincipalController implements ActionListener {
    
    /**
     * Variable en la cual se atribuye a la clase modelo
     */
    private Comida modelo;
    
    /**
     * Variable en la cual se atribuye a la clase vista principal
     */
    private VistaPrincipal vistaPrincipal;
    
    /**
     * Arreglo que guarda las comidas ingresadas
     */
    private ArrayList<Comida> comidasRegistradas=new ArrayList();

    /**
     * Constructor de la clase
     * @param modelo
     * @param vistaPrincipal 
     */
    public VistaPrincipalController(Comida modelo, VistaPrincipal vistaPrincipal) {
        this.modelo = modelo;
        this.vistaPrincipal = vistaPrincipal;
        this.vistaPrincipal.btnAnadir.addActionListener(this);
    }
    
    /**
     * Metodo encargado de escuchar el evento del boton
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
       vistaPrincipal.modelo.setRowCount(0);
       modelo.setNombreComida(vistaPrincipal.txtTexto.getText());
       String comidaIngresada=vistaPrincipal.txtTexto.getText();
       comidasRegistradas.add(new Comida(comidaIngresada));
       
       
        if (comidasRegistradas.size() > 0 ){                 
            for (int i = 0; i <comidasRegistradas.size(); i++ ){                           
                    vistaPrincipal.modelo.addRow(new Object[]{i,comidasRegistradas.get(i).getNombreComida()});                                                         
            }                                         
        }
        vistaPrincipal.txtTexto.setText("");
    }
    
    
}
