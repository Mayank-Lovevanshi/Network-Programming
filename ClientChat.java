import java.io.*;
import java.net.*;

public class ClientChat
{
public static void main(String args[]) throws IOException
{
Socket s = new Socket("localhost",5050);
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String toSend = "";
String toReceive = "";
while(!toSend.equals("bye!"))
{
System.out.print("You : ");
toSend = br.readLine();
dos.writeUTF(toSend);
toReceive = dis.readUTF();
System.out.println("Server : "+toReceive);
}
}
}
