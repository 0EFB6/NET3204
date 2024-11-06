// MerzRemote.java (Remote Object Implementation for Merz)
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MerzRemote extends UnicastRemoteObject implements CarService {
    public MerzRemote() throws RemoteException {
        super();
    }

    @Override
    public void map() throws RemoteException {
        System.out.println("Mercedes car is mapping the route!");
    }

    @Override
    public void honk() throws RemoteException {
        System.out.println("Merz cannot honk, but calling BMW's honk()!");
        try {
            // Create a BMW object to call its honk method
            BMWRemote bmwRemote = new BMWRemote();
            bmwRemote.honk();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
