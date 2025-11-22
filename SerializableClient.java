import com.fastLearner.dataFormat.Student;
import java.net.Socket;
import java.io.ObjectOutputStream;
public class SerializableClient
{
public static void main(String args[]) throws Exception
{
Student s = new Student("Mayank Lovevanshi",152,"Acropolis Institude of Technology and Research");
Socket clientSocket = new Socket("localhost",5050);
ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
oos.writeObject(s);
}
}
