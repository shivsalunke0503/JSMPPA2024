import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for a client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                // Receive message from client
                if ((message = input.readLine()) != null) {
                    System.out.println("Client: " + message);
                }
                
                // Send response to client
                System.out.print("You(server): ");
                message = console.readLine();
                output.println(message);
                
                if (message.equalsIgnoreCase("bye")) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
