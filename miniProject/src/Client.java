package com.fastLearner.client;


import java.io.IOException;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.net.Socket;

public class Client
{
public static void main(String args[]) throws IOException
{
Socket s = new Socket("localhost",5050);
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("************************************************");
System.out.println("-------------Connected to Server----------------");
System.out.println("************************************************");
System.out.print("Enter file name to Request for(with extension) : ");
String request = br.readLine().trim();
dos.writeUTF(request);
FileOutputStream fos = new FileOutputStream(request);
InputStream is = s.getInputStream();
// Downloading file from Server
int i;
while((i=is.read())!=-1)
{
fos.write(i);
}

System.out.println("************************************************");
System.out.println("File Downloaded : "+request);
System.out.println("************************************************");
}
}
