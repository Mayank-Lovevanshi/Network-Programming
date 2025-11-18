import java.io.*;
import java.net.*;

public class Server4
{
public static void main(String args[]) throws IOException
{
FileOutputStream fos = new FileOutputStream("data.txt");
ServerSocket ss = new ServerSocket(9696);
Socket clientSocket = ss.accept();
InputStream is = clientSocket.getInputStream();
int i;
while((i=is.read())!=-1)
{
fos.write(i);
}
}
}
