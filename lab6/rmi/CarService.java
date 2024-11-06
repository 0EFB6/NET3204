import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CarService extends Remote {
    void map() throws RemoteException;
    void honk() throws RemoteException;
}