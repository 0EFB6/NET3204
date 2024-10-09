import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
	public static void main(String[] args) throws IOException{
		
		Socket socket = new Socket();
		socket.connect(new InetSocketAddress("127.0.0.1", 5001), 1000);
		System.out.println("Connection Successful!");
		
		DataInputStream dataIn = new DataInputStream(socket.getInputStream());
		DataOutputStream dataOut = new DataOutputStream(socket.getOutputStream());
		
        
        Scanner i = new Scanner(System.in);

        System.out.print("Enter first number: ");
		int a = i.nextInt();
        System.out.print("Enter second number: ");
		int b = i.nextInt();
		
        // Send the numbers to the server
		dataOut.writeInt(a);
		dataOut.writeInt(b);

        // Receive the total from the server
        int addition = dataIn.readInt();
        int subtraction = dataIn.readInt();
        int multiplication = dataIn.readInt();
        int division = dataIn.readInt();
        
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
	}
}