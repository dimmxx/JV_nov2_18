package lesson.lesson20_09022019_socket.p2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer extends Thread {

    Socket s;
    int connections;

    public MyServer(Socket s, int connections){
        this.s = s;
        this.connections = connections;
        setDaemon(true);
        setPriority(10);
        start();
    }




    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(3136, 0, InetAddress.getByName("192.168.1.214"));
        System.out.println("Server started ...");

        int connections = 0;

        while (true){

            new MyServer(server.accept(), ++connections);
        }




    }


    @Override
    public void run() {
        try {

            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            byte[] buf = new byte[64*1024];
            int readSize = is.read(buf); //size
            String data = new String(buf, 0, readSize);
            System.out.println("R: " + data);

            data = "Connection = " + (connections) + "; Server received your message: " + data;
            os.write(data.getBytes());


        } catch (Exception e){

        }



    }


}
