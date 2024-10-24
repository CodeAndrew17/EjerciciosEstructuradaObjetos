import com.colegio.mantener.Person;
import com.colegio.mantener.Student;
import com.colegio.mantener.Teacher;

public class App {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.setNombre("Pepe");
        p.setEdad(25);

        Student e = new Student();
        e.setNombre("Juan Giraldo");
        e.setLegajo(123);
        e.setCarrera("Electronica");

        Teacher pro = new Teacher();
        pro.setNombre("Andres");
        pro.setMateria("Ingles");
        pro.setCargo("Desarrollador");

        System.out.println("Objeto p de tipo Persona");
        System.out.printf("Nombre: %s, Edad: %d \n", p.getNombre(), p.getEdad());
        System.out.println("Objeto e de tipo Estudiante");
        System.out.printf("Nombre: %s, Carrera: %s, Codigo: %d \n", e.getNombre(), e.getCarrera(), e.getLegajo());
        System.out.println("Objeto pro de tipo Profesor");
        System.out.printf("Nombre: %s, Materia: %s, Cargo: %s \n", pro.getNombre(), pro.getMateria(), pro.getCargo());
    }
}
