import controllers.MovieController;
import models.Movie;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== Evaluación: Ordenamiento de Películas por Título ===\n");

        // Obtener lista de películas de ejemplo
        Movie[] movies = generateMoviesList();

        // Mostrar películas antes de ordenar
        System.out.println("Películas ANTES de ordenar:");
        printMovies(movies);

        // Crear controlador e implementar el método sortByTitle
        MovieController controller = new MovieController();

        // Implementar el ordenamiento
        try {
            controller.sortByTitle(movies);

            // Mostrar películas después de ordenar
            System.out.println("\nPelículas DESPUÉS de ordenar por título:");
            printMovies(movies);
            System.out.println("\n Ordenamiento completado exitosamente.");
        } catch (UnsupportedOperationException e) {
            System.out.println("\n Error: El método sortByTitle aún no está implementado.");
            System.out.println("Por favor, implementa el método en MovieController.java");
        }
    }

    /**
     * Genera una lista de películas de ejemplo para practicar ordenamiento
     * 
     * @return Array de películas sin ordenar
     */
    public static Movie[] generateMoviesList() {
        Movie[] movies = new Movie[15];
        movies[0] = new Movie("Inception", 2010);
        movies[1] = new Movie("Avatar", 2009);
        movies[2] = new Movie("The Dark Knight", 2008);
        movies[3] = new Movie("Interstellar", 2014);
        movies[4] = new Movie("Pulp Fiction", 1994);
        movies[5] = new Movie("Forrest Gump", 1994);
        movies[6] = new Movie("The Matrix", 1999);
        movies[7] = new Movie("Gladiator", 2000);
        movies[8] = new Movie("The Shawshank Redemption", 1994);
        movies[9] = new Movie("The Godfather", 1972);
        movies[10] = new Movie("The Lord of the Rings", 2001);
        movies[11] = new Movie("Titanic", 1997);
        movies[12] = new Movie("Jurassic Park", 1993);
        movies[13] = new Movie("The Avengers", 2012);
        movies[14] = new Movie("Iron Man", 2008);
        return movies;
    }

    /**
     * Imprime las películas en formato legible
     */
    private static void printMovies(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%2d. %s (%d)\n", i + 1, movies[i].getTitle(), movies[i].getYear());
        }
    }
}
