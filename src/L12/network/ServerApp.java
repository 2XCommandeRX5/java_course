package L12.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
    private ServerSocket server;
    private int port;

    public void startServer(int port) throws IOException {
        this.port = port;
        server = new ServerSocket(port);
        server.setReuseAddress(true);
    }

    public void communicate() throws IOException, InterruptedException {
        Socket clientCon = server.accept();
        InputThread input = new InputThread(clientCon.getInputStream());
        OutputThread out = new OutputThread(clientCon.getOutputStream());
        input.start();
        out.start();
        input.join();
        clientCon.close();

    }


    public void echo() throws IOException {

        Socket clientCon = server.accept();

        Scanner input = new Scanner(clientCon.getInputStream());
        String message = input.nextLine();
        System.out.println("Msg from client: " + message);


        DataOutputStream out = new DataOutputStream(clientCon.getOutputStream());
        out.writeBytes(message + "\n");

        input.close();
        out.close();
        clientCon.close();

    }

    public void stopServer() throws IOException {
        server.close();
    }
}
