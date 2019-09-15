package tabladinamica;

public class Nodo {
    private int i;
    private String cad;
    
    public Nodo(){
        
    }

    public Nodo(int i) {
        this.i = i;
        cad="prueba "+i;
    }
    
    

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }
    
}
