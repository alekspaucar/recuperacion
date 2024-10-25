
import models.Carro;
import models.CarrosGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
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
}
