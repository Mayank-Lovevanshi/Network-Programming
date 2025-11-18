import java.io.*;
import java.net.*;

public class Client4
{
public static void main(String args[]) throws IOException
{
FileInputStream fis = new FileInputStream("./test/data.txt");
Socket s = new Socket("localhost",9696);
OutputStream os = s.getOutputStream();
int i;
while((i=fis.read())!=-1)
{
os.write(i);
}
}
}
