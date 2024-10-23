
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        PersonasGenerator personaGenerator = new PersonasGenerator();

        // Obtener el arreglo de 50 personas generadas aleatoriamente
        Person[] personas = personaGenerator.generarPersonas();

        System.out.println("Listado de personas generadas:");
        for (Person persona : personas) {
            System.out.println(persona);
        }
    }
}
