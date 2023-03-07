public class Main {
    public static void main(String[] args) {

        Coche c = new Coche(4, 2, "Lamborghini", "terrestre", 2, "Negro mate", "Aventador Lp 780-4 Ultimate", "LP640LB", "Placa amarilla: servicio particular");
        System.out.println(c.toString());

        System.out.println();

        Bicicleta b = new Bicicleta(2, 1, "GW", "Terrestre", "Hyena", "Abrazadera", "Grande", "De Montaña", 260504);
        System.out.println(b.toString());
    }
}