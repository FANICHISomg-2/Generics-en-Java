package ejerciciospropuestos;

public class Par<F, S> {
    private F primero;
    private S segundo;

    public Par(F primero, S segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public F getPrimero() { return primero; }
    public S getSegundo() { return segundo; }
    public void setPrimero(F primero) { this.primero = primero; }
    public void setSegundo(S segundo) { this.segundo = segundo; }

    // Ejercicio 2: compara dos pares (mismos valores en el mismo orden)
    public boolean esIgual(Par<F, S> otroPar) {
        if (otroPar == null) return false;
        boolean primerosIguales = (primero == null) ? (otroPar.primero == null) : primero.equals(otroPar.primero);
        boolean segundosIguales = (segundo == null) ? (otroPar.segundo == null) : segundo.equals(otroPar.segundo);
        return primerosIguales && segundosIguales;
    }

    @Override
    public String toString() {
        return "(Primero: " + primero + ", Segundo: " + segundo + ")";
    }
}
