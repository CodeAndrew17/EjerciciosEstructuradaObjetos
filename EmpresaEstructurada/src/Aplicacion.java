import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aplicacion {

    public static void main(String[] args) {
        String nombre, cargo;
        double salario, total = 0;

        // Definición de las estructuras de almacenamiento
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();
        ArrayList<String> cargos = new ArrayList<>();

        // Solicitar cantidad de empleados
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados"));
        
        // Validar que la cantidad de empleados sea mayor que 0
        if (cantidad <= 0) {
            System.out.println("No se ingresaron empleados.");
            return; // Terminar la ejecución si no hay empleados
        }

        // Lectura de los datos de cada empleado
        for (int emp = 1; emp <= cantidad; emp++) {
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado");
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el salario del empleado"));
            cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado");

            // Almacenamiento de los datos
            nombres.add(nombre);
            salarios.add(salario);
            cargos.add(cargo);
        }

        // Mostrar el número total de empleados
        System.out.println("El número total de empleados es: " + cantidad);

        // Mostrar los nombres y salarios de los empleados
        System.out.println("Los nombres y salarios de los empleados son:");
        for (int emp = 0; emp < cantidad; emp++) {
            System.out.println("Nombre: " + nombres.get(emp) + " Salario: " + salarios.get(emp));
        }

        // Calcular el total de dinero pagado por los salarios de todos los empleados
        for (int emp = 0; emp < cantidad; emp++) {
            total = total + salarios.get(emp);
        }
        System.out.println("Total de dinero pagado a todos los empleados: " + total);

        // Buscar el empleado que más dinero gana
        encontrarSalarioExtremo(nombres, salarios, cargos, true); // true para buscar el mayor salario

        // Buscar el empleado que menos dinero gana
        encontrarSalarioExtremo(nombres, salarios, cargos, false); // false para buscar el menor salario
    }

    // Método para encontrar el empleado con el mayor o menor salario
    public static void encontrarSalarioExtremo(ArrayList<String> nombres, ArrayList<Double> salarios, 
                                               ArrayList<String> cargos, boolean buscarMayor) {
        int posicion = 0;
        double salarioExtremo = salarios.get(0);

        for (int emp = 1; emp < salarios.size(); emp++) {
            if ((buscarMayor && salarios.get(emp) > salarioExtremo) || 
                (!buscarMayor && salarios.get(emp) < salarioExtremo)) {
                salarioExtremo = salarios.get(emp);
                posicion = emp;
            }
        }

        String tipo = buscarMayor ? "más" : "menos";
        System.out.println("El empleado que " + tipo + " dinero gana es:");
        System.out.println("Nombre: " + nombres.get(posicion) + " Cargo: " + cargos.get(posicion) + 
                           " Salario: " + salarios.get(posicion));
    }
}
