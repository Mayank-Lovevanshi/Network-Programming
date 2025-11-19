import java.io.*;
import java.net.*;

public class TestMultiThreadedServer
{
public static void main(String args[]) throws IOException
{

Socket s = new Socket("localhost",5050);
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Response time(ms) : ");
String message = br.readLine();
dos.writeUTF(message);
System.out.println("----------Output from Server--------------");
System.out.println(dis.readUTF());
System.out.println("--------------------------------------------");
}
}
