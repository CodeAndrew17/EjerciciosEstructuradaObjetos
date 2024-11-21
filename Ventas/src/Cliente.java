public class Cliente {
    private int codigo;
    private String razonSocial;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(int c, String r) {
        this.codigo = c;
        this.razonSocial = r;
    }

    // Getter y setter para codigo
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int val) {
        this.codigo = val;
    }

    // Getter y setter para razonSocial
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String val) {
        this.razonSocial = val;
    }
}
