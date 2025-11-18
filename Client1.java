import java.net.Socket;
import java.io.IOException;

public class Client1
{
public static void main(String args[]) throws IOException
{
Socket s = new Socket("localhost",9696);
System.out.println(s);
}
}
