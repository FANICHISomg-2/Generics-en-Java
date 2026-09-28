package ejerciciospropuestos;

public class ContenedorTest {
    public static void main(String[] args) {
        Contenedor<String, Integer> contenedor = new Contenedor<>();
        contenedor.agregarPar("Manzana", 10);
        contenedor.agregarPar("Pera", 5);
        contenedor.agregarPar("Uva", 25);

        System.out.println("Par en indice 1: " + contenedor.obtenerPar(1));
        System.out.println("Todos los pares:");
        contenedor.mostrarPares();
    }
}
