
package fabrica;

import java.util.Random;

/**
 *
 * @author windiurno
 */
public class Consumidor extends Thread{

    Contenedor contenedor;
    
    public Consumidor(Contenedor c) {
        this.contenedor = c;
    }
    
    @Override
    public void run(){
        while (true) {            
            long tiempo = 500 + (long) (Math.random() * (5000 - 500));
            try {
                sleep(tiempo);
            } catch (InterruptedException ex) {}
            int productos = contenedor.quitar();
           
            System.out.println("Quitando: ---> " + productos + " productos");
        }
    }
    
}
