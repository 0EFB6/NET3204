import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
    protected HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello, world, good morning you all!";
    }

    @Override
    public int sum(int a, int b) throws RemoteException {
        return (a + b);
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return (a - b);
    }

    @Override
    public int multiply(int a, int b) throws RemoteException {
        return (a * b);
    }

    @Override
    public float divide(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("Division by zero");
        }
        return (a / b);
    }
}