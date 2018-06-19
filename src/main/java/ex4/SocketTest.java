package ex4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.junit.Test;

import java.io.*;
import java.net.*;

/**
 * Created by lihanqing3 on 2017/11/24.
 */
public class SocketTest {
@Test
    public void testInternetAddress(){
  /*  InetAddress address=InetAddress.getByName("www.baidu.com");
    System.out.println(address);*/
    InetAddress address= null;
    try {
        address = InetAddress.getLocalHost();
    } catch (UnknownHostException e) {
        e.printStackTrace();
    }
    System.out.println(address);
}
@Test
public void testServerSocket() throws IOException{
    ServerSocket serverSocket=new ServerSocket(8989);
    Socket socket=serverSocket.accept();
    OutputStream out= socket.getOutputStream();
    PrintWriter writer=new PrintWriter(out);
    writer.write("来自服务端");
    writer.close();
    out.close();

    socket.close();
    serverSocket.close();

}

@Test
    public void testSocket() throws IOException {
        InetAddress address=InetAddress.getByName("127.0.0.1");
    Socket socket= null;
    try {
        socket = new Socket(address,8989);
    } catch (IOException e) {
        e.printStackTrace();
    }
    InputStream in=socket.getInputStream();
    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
    System.out.println("~~"+reader.readLine());

    reader.close();
    socket.close();


}
@Test
    public void  testURL() throws IOException{
    URL url=new URL("http://127.0.0.1:8080/examples/abcd.txt");



    System.out.println(url.getPath());
    System.out.println(url.getFile());
    System.out.println(url.getQuery());

    URLConnection urlConnection=url.openConnection();
    System.out.println(urlConnection);

InputStream in=urlConnection.getInputStream();

    FileOutputStream out=new FileOutputStream("test.txt");
  byte[] buffer=new byte[1024];
    int len=0;

    while((len=in.read(buffer)) !=-1)
    {
        out.write(buffer,0,len);
    }
    in.close();
    out.close();

}





}
