package ejerciciospropuestos;

public class PruebaPar {
    public static void main(String[] args) {
        Par<String, Integer> par1 = new Par<>("Java", 17);
        Par<String, Integer> par2 = new Par<>("Java", 17);
        Par<String, Integer> par3 = new Par<>("Python", 3);

        System.out.println("par1: " + par1);
        System.out.println("par2: " + par2);
        System.out.println("par3: " + par3);

        System.out.println("par1.esIgual(par2): " + par1.esIgual(par2)); // true
        System.out.println("par1.esIgual(par3): " + par1.esIgual(par3)); // false
    }
}
