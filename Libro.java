package modelo;

import java.util.Date;

public class Libro {

    private String titulo;
    private String genero;
    private String autores;
    private Date fechaPublicacion;
    private int idLibro;
    private int cantidadPaginas;

    public Libro(String titulo, String genero, String autores, Date fechaPublicacion, int idLibro, int cantidadPaginas) {
        this.titulo = titulo;
        this.genero = genero;
        this.autores = autores;
        this.fechaPublicacion = fechaPublicacion;
        this.idLibro = idLibro;
        this.cantidadPaginas = cantidadPaginas;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Autor(es): " + autores);
        System.out.println("Fecha de publicación: " + fechaPublicacion);
        System.out.println("ID: " + idLibro);
        System.out.println("Páginas: " + cantidadPaginas);
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }
}
