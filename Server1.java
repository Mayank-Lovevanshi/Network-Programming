import java.net.*;
import java.io.IOException;
public class Server1
{
public static void main(String args[]) throws IOException
{
ServerSocket ss = new ServerSocket(9696);
System.out.println("----------------------------------------");
System.out.println("Waiting for client Request...");
System.out.println("----------------------------------------");
Socket clientSocket = ss.accept();
System.out.println(clientSocket.toString());
System.out.println("Client request arrived");
}
}
