import javax.swing.JOptionPane;

public class AppNotasEstructurada {
    public static void main(String[] args) throws Exception {
        try {
        for(int est= 0; est < 2; est++){
            String nombre = JOptionPane.showInputDialog(null, "ingrese el nombre del estudiante");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota 1 del estudiante"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null,"ingrese la nota 2 del estudiante"));
            float notafinal = (nota1+nota2) / 2;
            JOptionPane.showMessageDialog(null, "el estudiante"+nombre+"obtuvo una nota final de: "+notafinal);
            if(notafinal <= 3) {
                JOptionPane.showMessageDialog(null,"el estudiante reprobo");
            } else {
                JOptionPane.showMessageDialog(null, "el estudiante aprobo");
            }
        }  } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "por favor ingrese un NÙMERO valido para las notas");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error inesperado"+ e.getMessage());
        }
    }
}
