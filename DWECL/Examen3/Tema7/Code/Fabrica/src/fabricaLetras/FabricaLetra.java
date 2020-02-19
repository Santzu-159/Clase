
package fabricaLetras;

import java.awt.EventQueue;

/**
 *
 * @author windiurno
 */
public class FabricaLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
           
            public void run() {
                ContenedorLetra cl = new ContenedorLetra();
                ConsumidorLetra cons = new ConsumidorLetra(cl);
                ProductorLetra prod = new ProductorLetra(cl);
                
                prod.start();
                cons.start();
            }
        });
    }
    
}
