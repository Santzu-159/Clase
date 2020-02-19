
package fabrica;

import java.awt.EventQueue;

/**
 *
 * @author windiurno
 */
public class Fabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                Contenedor cont = new Contenedor();
                Consumidor cons = new Consumidor(cont);
                Productor prod = new Productor(cont);
                prod.start();
                cons.start();
            }
        });
    }
    
}
