package L12.network;

import javax.sound.midi.Soundbank;
import javax.xml.crypto.Data;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {

    public void com(int port) throws IOException, InterruptedException {
        Socket connection = new Socket("localhost", port);
        InputThread input = new InputThread(connection.getInputStream());
        OutputThread out = new OutputThread(connection.getOutputStream());
        input.start();
        out.start();
        input.join();
        connection.close();
    }

    public void communicate(int port) throws IOException {
        Socket connection = new Socket("localhost", port);
        String mes = "Hell march\n";
        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        out.writeBytes(mes);


        Scanner input = new Scanner(connection.getInputStream());
        String srvMes = input.nextLine();

        System.out.println("msg from srv: "+srvMes);
        input.close();
        out.close();
        connection.close();
    }

    public void send(){

    }
}
