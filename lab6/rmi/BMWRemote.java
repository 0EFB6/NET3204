// BMWRemote.java (Remote Object Implementation for BMW)
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BMWRemote extends UnicastRemoteObject implements CarService {

    public BMWRemote() throws RemoteException {
        super();
    }

    @Override
    public void map() throws RemoteException {
        System.out.println("BMW car is mapping the route!");
    }

    @Override
    public void honk() throws RemoteException {
        System.out.println("BMW is honking!!!");
    }
}
