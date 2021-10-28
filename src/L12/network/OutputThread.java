package L12.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputThread extends Thread {
    private Scanner userInput;
    private DataOutputStream out;

    public OutputThread(OutputStream outputStream) {
        this.userInput = new Scanner(System.in);
        this.out = new DataOutputStream(outputStream);
    }

    @Override
    public void run(){
        while(true){
            String message = userInput.nextLine();
            try {
                out.writeBytes(message+"\n");
            } catch (IOException e) {
                System.out.println("Write data error" + e.getMessage());;
            }

        }
    }

}
