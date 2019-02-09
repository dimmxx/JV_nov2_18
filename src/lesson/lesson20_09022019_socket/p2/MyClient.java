package lesson.lesson20_09022019_socket.p2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message;

        while (true) {

            try {
                Socket s = new Socket(InetAddress.getByName("192.168.1.214"), 3136);

                message = scanner.nextLine();

                s.getOutputStream().write(message.getBytes());
                byte[] buf = new byte[64 * 1024];

                int readSize = s.getInputStream().read(buf);
                String data = new String(buf, 0, readSize);
                System.out.println("Received = " + data);

            } catch (IOException e) {
                System.out.println("Wrong Host");
                e.printStackTrace();
            }

        }

    }



}
