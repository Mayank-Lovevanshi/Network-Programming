import java.net.ServerSocket;
import java.io.IOException;
public class Server1
{
public static void main(String args[]) throws IOException
{
ServerSocket ss = new ServerSocket(9696);
System.out.println("----------------------------------------");
System.out.println("Waiting for client Request...");
System.out.println("----------------------------------------");
ss.accept();
System.out.println("Client request arrived");
}
}
