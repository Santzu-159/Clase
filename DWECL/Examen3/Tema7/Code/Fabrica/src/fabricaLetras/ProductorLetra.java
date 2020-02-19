package fabricaLetras;

/**
 *
 * @author windiurno
 */
public class ProductorLetra extends Thread {

    ContenedorLetra cl;

    public ProductorLetra(ContenedorLetra cla) {
        this.cl = cla;
    }

    @Override
    public void run() {
        while (true) {
            
            cl.poner();
            long tiempo = 1000 + (long) (Math.random() * (5000 - 1000));
            try {
                sleep(tiempo);
            } catch (InterruptedException ex) {
            }
        }
    }

}
