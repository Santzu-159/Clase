
package fabricaLetras;

import static java.lang.Thread.sleep;

/**
 *
 * @author windiurno
 */
public class ConsumidorLetra extends Thread{
    ContenedorLetra cl;
    
    public ConsumidorLetra(ContenedorLetra cla) {
        this.cl = cla;
    }
    
    @Override
    public void run(){
        while (true) { 
            cl.quitar();
            long tiempo = 500 + (long) (Math.random() * (5000 - 500));
            try {
                sleep(tiempo);
            } catch (InterruptedException ex) {}
        }
    }
    
}
