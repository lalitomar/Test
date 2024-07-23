package Newcommer;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

	public class fmb920 {
	    public static void main(String[] args) {
	        try {
	            int port = 5111; // Example port number
	            ServerSocket serverSocket = new ServerSocket(port);
	            System.out.println("Server started on port " + port);

	            while (true) {
	                //Socket socket = ServerSocket.accept();
	                Socket socket = serverSocket.accept();
	                PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
	                writer.println("Hello, client!");
	                writer.flush();
	                writer.close();
	                socket.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


