import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleHttpServer {
    public static void main(String[] args) throws Exception{
        final ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Listening to port 8080..........");
        while (true){
            final Socket client = serverSocket.accept();
            InputStreamReader inputStreamReader = new InputStreamReader((client.getInputStream()));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            while (!line.isEmpty()){
                System.out.println(line);
                line = bufferedReader.readLine();

            }

        }

    }
}
