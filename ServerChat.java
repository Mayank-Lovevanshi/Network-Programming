import java.io.*;
import java.net.*;

public class ServerChat
{
public static void main(String args[]) throws IOException
{
ServerSocket ss = new ServerSocket(5050);
System.out.println("---------------------------------");
System.out.println("Server is ready for connections");
System.out.println("---------------------------------");
Socket clientSocket = ss.accept();
System.out.println("Client Connected");

DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String toRecieve = "";
String toSend = "";
while(!toSend.equals("bye!!"))
{
toRecieve = dis.readUTF();
System.out.println("Client : "+toRecieve);
System.out.print("You : ");
toSend = br.readLine();
dos.writeUTF(toSend);
}

}
}
