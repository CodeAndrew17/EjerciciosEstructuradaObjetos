import javax.swing.JOptionPane;

public class AppNotasEstructurada {
    public static void main(String[] args) {
        try {
            for (int est = 0; est < 2; est++) {
                String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
                float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante"));
                float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante"));
                float notafinal = (nota1 + nota2) / 2;
                JOptionPane.showMessageDialog(null, "El estudiante " + nombre + " obtuvo una nota final de: " + notafinal);
                
                if (notafinal < 3) {
                    JOptionPane.showMessageDialog(null, "El estudiante reprobó");
                } else {
                    JOptionPane.showMessageDialog(null, "El estudiante aprobó");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un NÚMERO válido para las notas");
        }
    }
}
