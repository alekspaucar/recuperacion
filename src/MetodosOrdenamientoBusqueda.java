
import models.Person;

/**
 * La clase MetodosOrdenamientoBusqueda proporciona métodos para ordenar y
 * buscar
 * en un arreglo de objetos Person. Los métodos de ordenamiento incluyen
 * algoritmos
 * de selección e inserción, y los métodos de búsqueda utilizan el algoritmo de
 * búsqueda binaria.
 * 
 * Métodos disponibles:
 * - sortByAgeWithSelection(Person[] people): Ordena el arreglo por edad
 * utilizando selección.
 * - sortByHeightWithSelection(Person[] people): Ordena el arreglo por altura
 * utilizando selección.
 * - sortByAgeWithInsertion(Person[] people): Ordena el arreglo por edad
 * utilizando inserción.
 * - sortByHeightWithInsertion(Person[] people): Ordena el arreglo por altura
 * utilizando inserción.
 * - searchBinaryByAge(Person[] people, int age): Realiza una búsqueda binaria
 * por edad.
 * - searchBinaryByHeight(Person[] people, int height): Realiza una búsqueda
 * binaria por altura.
 * - showPeople(Person[] people): Imprime el listado de personas en el arreglo.
 */
public class MetodosOrdenamientoBusqueda {

    /**
     * Ordena un arreglo de objetos Person por edad utilizando el algoritmo de
     * selección.
     *
     * @param people El arreglo de objetos Person a ordenar.
     */
    public void sortByAgeWithSelection(Person[] people) {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getAge() < people[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    /**
     * Ordena un arreglo de objetos Person por altura utilizando el algoritmo de
     * selección.
     *
     * @param people El arreglo de objetos Person a ordenar.
     */
    public void sortByHeightWithSelection(Person[] people) {
        int n = people.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (people[j].getHeight() < people[minIndex].getHeight()) {
                    minIndex = j;
                }
            }
            Person temp = people[minIndex];
            people[minIndex] = people[i];
            people[i] = temp;
        }
    }

    /**
     * Ordena un arreglo de objetos Person por edad utilizando el algoritmo de
     * inserción.
     *
     * @param people El arreglo de objetos Person a ordenar.
     */
    public void sortByAgeWithInsertion(Person[] people) {
        int n = people.length;
        for (int i = 1; i < n; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getAge() > key.getAge()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    /**
     * Ordena un arreglo de objetos Person por altura utilizando el algoritmo de
     * inserción.
     *
     * @param people El arreglo de objetos Person a ordenar.
     */
    public void sortByHeightWithInsertion(Person[] people) {
        int n = people.length;
        for (int i = 1; i < n; i++) {
            Person key = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getHeight() > key.getHeight()) {
                people[j + 1] = people[j];
                j = j - 1;
            }
            people[j + 1] = key;
        }
    }

    /**
     * Realiza una búsqueda binaria en un arreglo de objetos Person para encontrar
     * una edad específica.
     *
     * @param people El arreglo de objetos Person en el que se realizará la
     *               búsqueda.
     * @param age    La edad a buscar.
     * @return El índice del objeto Person con la edad especificada, o -1 si no se
     *         encuentra.
     */
    public int searchBinaryByAge(Person[] people, int age) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (people[mid].getAge() == age) {
                return mid;
            }
            if (people[mid].getAge() < age) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Age not found
    }

    /**
     * Realiza una búsqueda binaria en un arreglo de objetos Person para encontrar
     * una altura específica.
     *
     * @param people El arreglo de objetos Person en el que se realizará la
     *               búsqueda.
     * @param height La altura a buscar.
     * @return El índice del objeto Person con la altura especificada, o -1 si no se
     *         encuentra.
     */
    public int searchBinaryByHeight(Person[] people, int height) {
        int left = 0;
        int right = people.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (people[mid].getHeight() == height) {
                return mid;
            }
            if (people[mid].getHeight() < height) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Height not found
    }

    /**
     * Imprime el listado de personas en el arreglo.
     *
     * @param people El arreglo de objetos Person a imprimir.
     */
    public void showPeople(Person[] people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
