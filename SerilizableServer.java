import com.fastLearner.dataFormat.Student;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class SerilizableServer
{
public static void main(String args[]) throws IOException,ClassNotFoundException
{
ServerSocket ss = new ServerSocket(5050);
Socket clientSocket = ss.accept();
ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
Student s = (Student)ois.readObject();
s.show();
}
}
