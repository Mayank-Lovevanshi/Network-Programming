import java.io.*;
import java.net.*;

public class Server3
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos = new FileOutputStream("copy.png");
ServerSocket ss = new ServerSocket(9696);
System.out.println("-----------------------------------");
System.out.println("Waiting for Client request");
System.out.println("-----------------------------------");
Socket clientSocket = ss.accept();
InputStream is = clientSocket.getInputStream();
int i;
while((i=is.read())!=-1)
{
fos.write(i);
}
clientSocket.close();
ss.close();
fos.close();
}
}
