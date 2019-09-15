package tabladinamica;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MiHilo extends Thread{
    private MiTablaModel tbm;
    @Override
    public void run() {
        try {
            for(int x=0; x<10; x++){
                this.tbm.addNodo(new Nodo(x));
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public MiTablaModel getTbm() {
        return tbm;
    }

    public void setTbm(MiTablaModel tbm) {
        this.tbm = tbm;
    }
    
    
    
}
