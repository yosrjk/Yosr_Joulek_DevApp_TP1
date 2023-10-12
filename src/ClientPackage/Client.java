package ClientPackage;
import java.io.IOException;
import java.net.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Je suis un client pas encore connecté");
        int serverPort = 1234; 
        try {
        	
            InetAddress host = InetAddress.getByName("localhost");
            Socket socket = new Socket(host, 1234); 
            System.out.println("Je suis un client connecté");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Je suis un client connecté");
    }
}
