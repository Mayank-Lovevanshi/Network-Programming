import java.net.*;
import java.io.*;
public class Server2
{
public static void main(String args[]) throws IOException
{
ServerSocket ss = new ServerSocket(9696);
System.out.println("----------------------------------------");
System.out.println("Waiting for client Request...");
System.out.println("----------------------------------------");
Socket clientSocket = ss.accept();
InputStream is = clientSocket.getInputStream();
int i;
while((i=is.read())!=-1)
{
System.out.print((char)i);
}
System.out.println();
System.out.println("Client request arrived");
}
}
