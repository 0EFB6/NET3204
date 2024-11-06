// Main.java (RMI Client)
import java.rmi.Naming;  // Import Naming

public class Main {
    public static void main(String[] args) {
        // Creating instances of different car brands
        Car mercedes = new Merz("S-Class", 2024, "Silver");
        Car bmw = new Bmw("X5", 2023, "Black");
        Car honda = new Honda("Civic", 2022, "Blue");

        System.out.println(mercedes);
        System.out.println(bmw);
        System.out.println(honda);

        ((Merz) mercedes).map();
        ((Honda) honda).spec();

        try {
            // Look up the remote objects using the relative names (no need for full URL)
            CarService merzService = (CarService) Naming.lookup("MerzService");
            CarService bmwService = (CarService) Naming.lookup("BMWService");

            // Calling the map method on Merz (which internally calls BMW's honk method)
            System.out.print("Merz is calling BMW's map");
            merzService.map();

            // You can also call BMW's honk method directly (for demonstration)
            bmwService.honk();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
