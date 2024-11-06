public class Main {
    public static void main(String[] args) {
        Car mercedes = new Merz("S-Class", 2024, "Silver");
        Car bmw = new Bmw("X5", 2023, "Black");
        Car honda = new Honda("Civic", 2022, "Blue");

        System.out.println(mercedes);
        System.out.println(bmw);
        System.out.println(honda);

        mercedes.brake();
        honda.brake();
        bmw.brake();
        System.out.println("\n ---Merz--- ");
        ((Merz) mercedes).map();
        ((Merz) mercedes).honk();
        System.out.println("\n ---BMW--- ");
        ((Honda) honda).spec();
        System.out.println("\n ---Honda--- ");
        ((Honda) honda).map();
    }
}
