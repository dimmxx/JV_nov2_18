package lesson.lesson20_09022019_socket.p1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {


    public static void main(String[] args) {

        try {
            Socket s = new Socket(InetAddress.getByName("192.168.1.214"), 3135);
            s.getOutputStream().write("Hello, Dima".getBytes());
            byte[] buf = new byte[64*1024];

            int readSize = s.getInputStream().read(buf);
            String data = new String(buf, 0, readSize);
            System.out.println("Received = " + data);


        } catch (IOException e) {
            System.out.println("Wrong Host");
            e.printStackTrace();
        }


    }



}
