import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Connected to the server.");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String message;

            while (true) {
                // Send message to server
                System.out.print("You(client): ");
                message = console.readLine();
                output.println(message);

                // Receive response from server
                if ((message = input.readLine()) != null) {
                    System.out.println("Server: " + message);
                }

                if (message.equalsIgnoreCase("bye")) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
