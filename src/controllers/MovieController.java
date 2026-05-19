package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden descendente.
     * 
     * Metodo: sortByTitle
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle (Movie[] movies){
        int n = movies.length;

        for (int i = 0; i < n - 1; i ++){
            int indiceMayor = i;
            for (int j = i + 1; j < n; j++) {
                if (movies[j].getTitulo().compareToIgnoreCase(movies[indiceMayor].getTitulo()) > 0){
                    indiceMayor = j;

                }
            }
            Movie temp = movies[indiceMayor];
            movies[indiceMayor] = movies[i];
            movies[i] = temp;
        }

    }


}
