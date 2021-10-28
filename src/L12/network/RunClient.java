package L12.network;

import java.io.IOException;

public class RunClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClientApp cl = new ClientApp();
        cl.com(999);
    }
}
