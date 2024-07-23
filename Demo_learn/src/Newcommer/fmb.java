package Newcommer;


import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class fmb {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        PrintWriter out = null;

        try {
            // Create a server socket on port 6030
            serverSocket = new ServerSocket(111);
            System.out.println("Server started on port 6030");

            // Wait for a client connection
            clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            // Create output stream
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream())), true);

            // Send a message to the client
            out.println("Hello, client!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (out != null) out.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
