import clases.Estudiante;

public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
        Estudiante est= new Estudiante("carlos rodirguez",Float.parseFloat("2.5"),Float.parseFloat("5.0"));
        Estudiante est1 = new Estudiante("santiago iabñez",Float.parseFloat("2.5"),Float.parseFloat("3.0"));
        est.calcularNotaFinal();
        est1.calcularNotaFinal();
        System.out.println("El estudiante "+est.obtenerNombre()+" obtuvo una nota final de: "+est.obtenerNotaFinal()+" por consiguiente "+est.obtenerMensaje());
        System.out.println("El estudiante "+est1.obtenerNombre()+" obtuvo una nota final de: "+est1.obtenerNotaFinal()+" por consiguiente "+est1.obtenerMensaje());
    }
}
