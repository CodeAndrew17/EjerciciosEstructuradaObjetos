import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppEmpresaObjetos {

    public static void main(String[] args) throws Exception {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de empleados: "));
        Empresa empresa = new Empresa(); 
        for (int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingresar nombre del empleado: ");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese cargo del empleado: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese salario del empleado: "));

            empresa.contratarEmpleado(new Empleado(nombre, cargo, salario));
        }
        System.out.println("\nEl número total de empleados es: " + empresa.getTotalEmpleados());
        System.out.println("\nLos nombres y los salarios de los empleados son:\n" + empresa.nombreSalario());
        System.out.println("\nTotal de dinero pagado a todos los empleados: " + empresa.getTotalSalarios());
    }

    static class Empleado {
        private String nombre;
        private String cargo;
        private double salario;

        public Empleado(String nombre, String cargo, double salario) {
            this.nombre = nombre;
            this.cargo = cargo;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }
    }

    static class Empresa {
        private ArrayList<Empleado> empleados;

        public Empresa() {
            this.empleados = new ArrayList<>();
        }

        public void contratarEmpleado(Empleado emp) {
            empleados.add(emp);
        }

        public int getTotalEmpleados() {
            return empleados.size();
        }

        public String nombreSalario() {
            StringBuilder resultado = new StringBuilder();
            for (Empleado emp : empleados) {
                resultado.append(emp.getNombre()).append(": ").append(String.format("%.2f", emp.getSalario())).append("\n");
            }
            return resultado.toString();
        }

        public double getTotalSalarios() {
            double total = 0;
            for (Empleado emp : empleados) {
                total += emp.getSalario();
            }
            return total;
        }
    }
}
