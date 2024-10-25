import models.Carro;

/**
 * MetodosOrdenamientoBusquedaGrupoB
 * 
 * Esta clase proporciona métodos para ordenar y buscar en un arreglo de objetos
 * Carro.
 * 
 * Métodos incluidos:
 * - sortBYearWithBubbleAvnAsendente: Ordena los carros por año de fabricación
 * en orden ascendente utilizando el algoritmo de burbuja.
 * - sortBYearWithBubbleAvnDesendente: Ordena los carros por año de fabricación
 * en orden descendente utilizando el algoritmo de burbuja.
 * - searchBinaryByYear: Realiza una búsqueda binaria en el arreglo de carros
 * para encontrar un carro por su año de fabricación.
 * - showPeople: Imprime la lista de carros en la consola.
 * 
 * Esta clase es parte de la evaluación del grupo B y debe ser completada según
 * las instrucciones proporcionadas en el enunciado de la evaluación.
 */

public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Ascendentemente
    /**
     * Ordena un arreglo de objetos Carro por año de fabricación en orden ascendente
     * utilizando el algoritmo de ordenamiento burbuja.
     *
     * @param cars Un arreglo de objetos Carro que se desea ordenar.
     */
    public void sortBYearWithBubbleAvnAsendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() > cars[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Selection sort by year Descendentemente
    /**
     * Ordena un arreglo de objetos Carro en orden descendente basado en el año de
     * fabricación
     * utilizando el algoritmo de ordenamiento de burbuja.
     *
     * El algoritmo de burbuja funciona comparando pares adyacentes de elementos y
     * intercambiándolos si están en el orden incorrecto. Este proceso se repite
     * hasta que
     * no se necesiten más intercambios, lo que significa que el arreglo está
     * ordenado.
     *
     * @param cars Un arreglo de objetos Carro que se ordenará en orden descendente
     *             por año de fabricación.
     */
    public void sortBYearWithBubbleAvnDesendente(Carro[] cars) {
        int n = cars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cars[j].getYear() < cars[j + 1].getYear()) {
                    // Swap cars[j] and cars[j+1]
                    Carro temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] cars, int year) {
        int left = 0;
        int right = cars.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cars[mid].getYear() == year) {
                return mid;
            }
            if (cars[mid].getYear() < year) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Year not found
    }

    // Metodo que imprime el listado de personas
    public void showCars(Carro[] cars) {
        for (Carro car : cars) {
            System.out.println(car);
        }
    }
}