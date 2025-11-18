import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 5050);
        System.out.println("Connected to server");

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        while (true) {
            System.out.print("You: ");
            String msg = keyboard.readLine();
            out.println(msg);                     // ← FIX: send message

            String response = in.readLine();      // ← FIX: read one full line
            System.out.println("Server: " + response);
        }
    }
}

