import java.net.Socket;
import java.io.*;
public class Client2
{
public static void main(String args[]) throws IOException
{
Socket s = new Socket("localhost",9696);
String message = "Hello Server";
OutputStream os = s.getOutputStream();
os.write(message.getBytes());
os.close();
s.close();
}
}
