package models;

public class Movie {
  public String titulo;
  public int añoLanzamiento;

  public Movie(String titulo, int añoLanzamiento) {
    this.titulo = titulo;
    this.añoLanzamiento = añoLanzamiento;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAñoLanzamiento() {
    return añoLanzamiento;
  }

  public void setAñoLanzamiento(int añoLanzamiento) {
    this.añoLanzamiento = añoLanzamiento;
  }

  @Override
  public String toString() {
    return "Movie [titulo=" + titulo + ", añoLanzamiento=" + añoLanzamiento + "]";
  }

}
