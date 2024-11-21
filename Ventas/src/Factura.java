import java.util.ArrayList;

public class Factura extends Comprobante {

    private ArrayList<Producto> mProducto = new ArrayList<>();
    private float total;
    private Cliente mCliente;

    public Factura() {
        // Constructor vacío
    }

    

    public Cliente getCliente() {
        return mCliente;
    }

    public void setCliente(Cliente val) {
        this.mCliente = val;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float val) {
        this.total = val;
    }

    public ArrayList<Producto> getProducto() {
        return mProducto;
    }

    public void setProducto(ArrayList<Producto> val) {
        this.mProducto = val;
    }

    public Factura(char t, int n, Fecha f, Cliente cli) {
        super(t, n, f); // Llama al constructor de la clase base
        this.mCliente = cli; // Asignación directa para evitar métodos sobrescribibles
    }

    public void agregarProducto(Producto p) {
        if (p != null) { // Validación de nulo
            mProducto.add(p);
            setTotal(getTotal() + p.getPrecio());
        }
    }

    public void mostrarProductos() {
        if (mProducto == null || mProducto.isEmpty()) { // Validación adicional
            System.out.println("No hay productos en la factura.");
            return;
        }

        for (Producto p : mProducto) { // Uso de for-each en lugar de Iterator
            System.out.printf("Codigo: %d Descripcion: %s Precio: %5.2f \n",
                    p.getCodigo(), p.getDescripcion(), p.getPrecio());
        }
    }

    public void mostrar() {
        if (getFecha() == null || mCliente == null) { // Validación de datos esenciales
            System.out.println("Datos incompletos en la factura.");
            return;
        }

        System.out.printf("Tipo: %c Número: %d Fecha: %d/%d/%d\n",
                getTipo(), getNumero(),
                getFecha().getDia(), getFecha().getMes(), getFecha().getAño());
        System.out.printf("Cliente: \n");
        System.out.printf("Codigo: %d Razon Social: %s \n",
                mCliente.getCodigo(), mCliente.getRazonSocial());
        System.out.printf("Productos: \n");
        mostrarProductos();
        System.out.printf("Total: %6.2f \n", getTotal());
    }
}
