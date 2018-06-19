package ex4;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lihanqing3 on 2017/11/24.
 */
public class SocketTest2 {

    @Test
    public void testServerSocket2() throws IOException {
        ServerSocket serverSocket=new ServerSocket(8686);
        Socket socket=serverSocket.accept();

        InputStream in=new FileInputStream("good thinking.txt");
        byte[] buffer=new byte[1024];
        int len=0;
        OutputStream out=socket.getOutputStream();
        while ((len=in.read(buffer))!=-1)
        {
            out.write(buffer,0,len);
        }
        out.close();
        in.close();

        socket.close();
        serverSocket.close();


    }

    @Test
    public void testClientSocket2() throws IOException{
        InetAddress address=InetAddress.getByName("127.0.0.1");
        Socket socket=new Socket(address,8686);

        InputStream in=socket.getInputStream();
        OutputStream out=new FileOutputStream("d://lihanqing.txt");
        byte[] buffer=new byte[1024];
        int len=0;

        while((len=in.read(buffer)) !=-1)
        {
            out.write(buffer,0,len);
        }
        in.close();
        out.close();
        socket.close();

    }

}
