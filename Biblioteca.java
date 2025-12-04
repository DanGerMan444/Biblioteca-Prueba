package modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;
    private List<Usuario> usuarios;
    private String direccion;
    private int telefono;

    public Biblioteca(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Métodos para manejar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // Métodos para manejar usuarios
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void prestarLibro(Usuario usuario, Libro libro) {
        if (libros.contains(libro)) {
            usuario.prestarLibro(libro);
            libros.remove(libro);
        }
    }

    public void devolverLibro(Usuario usuario, Libro libro) {
        usuario.devolverLibro(libro);
        libros.add(libro);
    }

    public List<Libro> listaDeLibros() {
        return libros;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
