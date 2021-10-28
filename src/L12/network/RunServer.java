package L12.network;

import java.io.IOException;

public class RunServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerApp s = new ServerApp();
        s.startServer(999);
        s.communicate();
        s.stopServer();
    }
}
