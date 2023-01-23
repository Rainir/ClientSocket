import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        int port = 80;

        try (Socket clientSocket = new Socket(ip, port);
             PrintWriter out = new
                     PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new
                     InputStreamReader(clientSocket.getInputStream()))) {
                out.println("Anton");

                String resp = in.readLine();
                System.out.println(resp);
             }
    }
}