import java.io.*;
import java.net.*;

public class Client 
{
    public static void main(String[] args) 
    {
        try 
        {
            // Connect to server at localhost, port 5000
            Socket socket = new Socket("localhost", 5000);

            // Input & Output streams
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            // Send message to server
            String message = "Hello Server!";
            output.writeUTF(message);

            // Receive reply from server
            String reply = input.readUTF();
            System.out.println("Server says: " + reply);

            // Close connection
            socket.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}