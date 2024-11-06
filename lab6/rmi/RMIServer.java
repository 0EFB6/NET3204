// RMIServer.java (RMI Server)
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // Start the RMI registry on the default port (1099)
            LocateRegistry.createRegistry(1099);

            // Create remote objects for Merz and BMW
            MerzRemote merzRemote = new MerzRemote();
            BMWRemote bmwRemote = new BMWRemote();

            // Bind these objects to the RMI registry using relative names
            Naming.rebind("MerzService", merzRemote); // Relative name
            Naming.rebind("BMWService", bmwRemote); // Relative name

            System.out.println("RMI Server is running...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
