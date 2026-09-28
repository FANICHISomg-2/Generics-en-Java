package ejerciciospropuestos;

public class Main {

    public static <F, S> void imprimirPar(Par<F, S> par) {
        System.out.println(par);
    }

    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Nicole", 21);
        Par<Double, Boolean> par2 = new Par<>(19.5, true);
        Par<Persona, Integer> par3 = new Par<>(new Persona("Stephano", 20), 1);

        imprimirPar(par1);
        imprimirPar(par2);
        imprimirPar(par3);
    }
}
