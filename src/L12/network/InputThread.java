package L12.network;

import java.io.InputStream;
import java.util.Scanner;

public class InputThread extends Thread {
    private Scanner input;

    public InputThread(InputStream inputStream) {
        this.input = new Scanner(inputStream);
    }

    @Override
    public void run() {
        while (true) {
            String mes = input.nextLine();
            System.out.println(mes);
        }
    }

}
