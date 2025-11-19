import java.io.*;
import java.net.*;

class RequestProcessor extends Thread
{
Socket clientSocket;
DataInputStream dis;
DataOutputStream dos;
RequestProcessor(Socket clientSocket) throws IOException
{
this.clientSocket = clientSocket;
this.dis = new DataInputStream(clientSocket.getInputStream());
this.dos = new DataOutputStream(clientSocket.getOutputStream());
}
public void run()
{
try
{
System.out.println(clientSocket);
String message = dis.readUTF();
int duration = Integer.parseInt(message);
System.out.println("--------------------Going to sleep------------------");
Thread.sleep(duration);
System.out.println("--------------------Woke up from Sleep--------------");
dos.writeUTF("Request processed");
clientSocket.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

public class MultiThreadedServer
{
static int i = 0;
public static void main(String args[]) throws IOException
{
ServerSocket ss = new ServerSocket(5050);
System.out.println("----------Server is waiting for the requests---------");

while(true)
{
Socket clientSocket = ss.accept();
i++;
System.out.println("Client "+i);
RequestProcessor rp = new RequestProcessor(clientSocket);
rp.start();
}

}
}
