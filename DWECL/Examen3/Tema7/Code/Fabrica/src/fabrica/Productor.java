
package fabrica;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author windiurno
 */
public class Productor extends Thread{

    Contenedor contenedor;
    
    public Productor(Contenedor c) {
        this.contenedor = c;
    }
    
    @Override
    public void run(){
        while (true) {            
            long tiempo = 600 + (long) (Math.random() * (5000 - 600));
            try {
                sleep(tiempo);
            } catch (InterruptedException ex) {}
            int productos = new Random().nextInt(100); 
            contenedor.poner(productos);
            System.out.println("Poniendo: ---> " + productos + " productos");
        }
    }
    
}
