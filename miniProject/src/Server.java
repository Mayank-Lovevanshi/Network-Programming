package com.fastLearner.server;

import java.net.ServerSocket;
import java.net.Socket;
import com.fastLearner.server.RequestProcessor;
import java.io.IOException;
public class Server
{
static int clientNumber=1;
public static void main(String args[]) throws IOException
{
ServerSocket ss = new ServerSocket(5050);
while(true)
{
System.out.println("************************************************");
System.out.println("----------Waiting for Client Request------------");
System.out.println("************************************************");
Socket clientSocket = ss.accept();
System.out.println("Client : "+clientNumber);
clientNumber++;
System.out.println("************************************************");
System.out.println("------------Client request accepted-------------");
System.out.println("************************************************");
RequestProcessor rp = new RequestProcessor(clientSocket);
rp.start();
}
}
}
