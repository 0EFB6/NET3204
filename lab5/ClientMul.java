import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientMul {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in); 

            Registry registry = LocateRegistry.getRegistry(null, 1099);
            Hello stub = (Hello) registry.lookup("Hello");

            System.out.print("Enter a: ");
            int a = s.nextInt();
            System.out.print("Enter a: ");
            int b = s.nextInt();
            int multiply = stub.multiply(a, b);
            System.out.println("Multiply: " + multiply);           
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}