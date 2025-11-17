import java.io.*;
import java.net.*;

public class Client3
{
public static void main(String args[]) throws IOException
{
Socket s = new Socket("localhost",9696);
FileInputStream fis = new FileInputStream("./test/mayank.png");
OutputStream os = s.getOutputStream();
int i;
while((i=fis.read())!=-1)
{
os.write(i);
}
}
}
