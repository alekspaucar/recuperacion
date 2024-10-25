
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = new PersonasGenerator().generarPersonas();
        for (Person person : personas) {
            System.out.println(person); 

            MetodosOrdenamientoBusqueda mob= new MetodosOrdenamientoBusqueda();
            mob.sortByAgeWithSelection(personas);
            mob.showPeople(personas);
            int result = mob.searchBinaryByAge(personas, 78);
            if (result == - 1){
                System.out.println("no encontro: ");
            }else{
                System.out.println("encontro en la posicion: " + result + "-->" + personas );
            }

        }
    }
}

/* 
        CarrosGenerator generator = new CarrosGenerator();
        Carro[] carros = generator.generarCarros();
        System.out.println("Listado de carros generadas:");
        MetodosOrdenamientoBusquedaGrupoB metodos = new MetodosOrdenamientoBusquedaGrupoB();
        metodos.sortBYearWithBubbleAvnAsendente(carros);
        metodos.showCars(carros);
        int result = metodos.searchBinaryByYear(carros, 200);
        if (result == -1) {
            System.out.println("No se encontro el carro");
        } else {
            System.out.println("El carro se encuentra en la posicion: " + result);
        }
    }
    */

