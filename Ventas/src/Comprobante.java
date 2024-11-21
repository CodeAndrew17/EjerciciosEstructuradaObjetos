
public class Comprobante {

    private char tipo;
    private int numero;
    private Fecha fecha;


    // Constructor con parámetros
    public Comprobante(char t, int n, Fecha f) {
        this.tipo = t;      // Asignación directa al atributo
        this.numero = n;    // Asignación directa al atributo
        this.fecha = f;     // Asignación directa al atributo
    }

    // Getter y setter para fecha
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha val) {
        this.fecha = val;
    }

    // Getter y setter para número
    public int getNumero() {
        return numero;
    }

    public void setNumero(int val) {
        this.numero = val;
    }

    // Getter y setter para tipo
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char var) {
        this.tipo = var;
    }
}