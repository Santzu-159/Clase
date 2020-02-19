
package fabrica;


/**
 *
 * @author windiurno
 */
public class Contenedor extends Thread{

    boolean lleno = false;
    int numero = 0;
    
    public Contenedor() {
    
    
    }
    
    public synchronized void poner(int num){
        while (lleno) {            
            try {
                wait();
            } catch (InterruptedException ex) {}
        }
        
        numero = num;
        lleno = true;
        
        notify();
    }
    
    public synchronized int quitar(){
        while(!lleno){
            try {
                wait();
            } catch (InterruptedException ex) {} 
        }
        
        lleno = false;
        notify();
        
        return numero;
    }
    
}
