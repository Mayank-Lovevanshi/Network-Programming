package com.fastLearner.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.OutputStream;

public class RequestProcessor extends Thread
{
StringBuffer fileStorage = new StringBuffer("/Users/mayanklovevanshi/desktop/java/library/networking/miniProject/fileStorage/");
DataInputStream dis;
FileInputStream fis = null;
OutputStream os;
public RequestProcessor(Socket clientSocket)
{
try
{
dis = new DataInputStream(clientSocket.getInputStream());
os = clientSocket.getOutputStream();
}
catch(Exception e)
{
System.out.println(e);
}
}
public void run()
{
try
{
String path = dis.readUTF().trim();
fileStorage.append(path);
fis = new FileInputStream(fileStorage.toString());
int i;
// Writing file on the socket output stream
while((i=fis.read())!=-1)
{
os.write(i);
}
// end
System.out.println("-----------Client request Served------------");

}
catch(Exception e)
{
System.out.println(e);
}
finally
{
try
{
fis.close();
dis.close();
os.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}

