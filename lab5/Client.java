import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


// public class Client {
//     public static void main(String[] args) {
//         try {
//             Scanner s = new Scanner(System.in); 

//             Registry registry = LocateRegistry.getRegistry(null, 1099);
//             Hello stub = (Hello) registry.lookup("Hello");
//             String response = stub.sayHello();
//             System.out.println("Response: " + response);

//             System.out.print("Enter a: ");
//             int a = s.nextInt();
//             System.out.print("Enter a: ");
//             int b = s.nextInt();
//             int sum = stub.sum(a, b);
//             System.out.println("Sum: " + sum);
//             int subtract = stub.subtract(a, b);
//             System.out.println("Subtract: " + subtract);
//             int multiply = stub.multiply(a, b);
//             System.out.println("Multiply: " + multiply);
//             int divide = stub.divide(a, b);
//             System.out.println("Divide: " + divide);
//         } catch (Exception e) {
//             System.err.println("Client exception: " + e.toString());
//             e.printStackTrace();
//         }
//     }
// }

public class Client implements Runnable {
    private String operation;
    private int a;
    private int b;

    public Client(String operation, int a, int b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public void run() {
        try {
            Registry registry = LocateRegistry.getRegistry(null, 1099);
            Hello stub = (Hello) registry.lookup("Hello");

            switch (operation) {
                case "sum":
                    System.out.println("Sum: " + stub.sum(a, b));
                    break;
                case "subtract":
                    System.out.println("Subtract: " + stub.subtract(a, b));
                    break;
                case "multiply":
                    System.out.println("Multiply: " + stub.multiply(a, b));
                    break;
                case "divide":
                    System.out.println("Divide: " + stub.divide(a, b));
                    break;
                default:
                    System.out.println("Sum: " + stub.sum(a, b));
                    System.out.println("Subtract: " + stub.subtract(a, b));
                    System.out.println("Multiply: " + stub.multiply(a, b));
                    System.out.println("Divide: " + stub.divide(a, b));
                    break;
            }
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 5, c = 69, d = 3;

        new Thread(new Client("sum", a, b)).start();
        new Thread(new Client("subtract", c, d)).start();
        new Thread(new Client("multiply", b, d)).start();
        new Thread(new Client("divide", a, b)).start();

        try {
            Thread.sleep(1000);
            System.out.println("Sleeping for 1 sec");
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        new Thread(new Client("default", a, b)).start();
    }
}