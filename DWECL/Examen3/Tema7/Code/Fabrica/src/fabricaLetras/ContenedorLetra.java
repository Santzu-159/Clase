package fabricaLetras;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author windiurno
 */
public class ContenedorLetra {

    char[] letras = new char[10];
    boolean lleno = false;
    char[] abecedario = "abcdefghijklmnñopqrstuvwxyz".toCharArray();

    public ContenedorLetra() {
    }

    public synchronized void poner() {
        while (lleno) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        for (int i = 0; i < 10; i++) {
            try {
                int pos = 0 + (int) (Math.random() * (26 - 0));
                letras[i] = abecedario[pos];
                sleep(500);
                System.out.println("Poniendo letra: " + letras[i]);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("");

        lleno = true;
        notify();
    }

    public synchronized void quitar() {
        while (!lleno) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Quitando letra: " + letras[i]);
                letras[i] = ' ';
                sleep(500);
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("");
        lleno = false;
        notify();
    }
}
