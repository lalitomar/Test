package Newcommer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		
		int port = Integer.parseInt("2580");
		
		try (ServerSocket serverSocket = new ServerSocket(port)){
			System.out.println("Server is OKKKKKKKKKK " + port);
		while (true) {
			
			Socket socket = serverSocket.accept();
			System.out.println("New client Connected");
			OutputStream output = socket.getOutputStream();
			BufferedWriter write = new BufferedWriter(new OutputStreamWriter(output));
			write.write("this is reply from server");
			write.newLine();
			write.flush();
			socket.close();
			
		}
		
		} catch (IOException ex) {
			// socket.close();
			System.out.println("Server exception " + ex.getMessage());
			
		}

	}

}
