package modelo;

public class Main {

    private Biblioteca biblioteca;

    public static void main(String[] args) {
        Main main = new Main();
        main.biblioteca = new Biblioteca("Biblioteca Personal", "Calle 123", 123456789);
        System.out.println("Sistema de Biblioteca iniciado correctamente.");
    }
}
