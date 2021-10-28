package L12.network;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Runnable srt = new Runnable() {
            @Override
            public void run() {
                ServerApp server = new ServerApp();
                try {
                    server.startServer(880);
                    server.echo();
                    server.stopServer();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable clt = new Runnable() {
            @Override
            public void run() {
                ClientApp cl = new ClientApp();
                try {
                    cl.communicate(880);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread srv = new Thread(srt, "Server");
        Thread client = new Thread(clt, "Client");
        srv.start();
        client.start();
        srv.join();
        client.join();
    }

}
