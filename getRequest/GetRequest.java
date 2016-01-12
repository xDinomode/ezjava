//Grabs the html of a webpage using sockets
//eg: java SocketGet www.example.com

import java.net.*;
import java.io.*;

public class GetRequest{
    public static void main(String args[]) throws IOException{
        Socket s = null;

        try{
            String host = args[0];
            int port = 80;

            s = new Socket(host, port);

            OutputStream out = s.getOutputStream();
            PrintWriter outw = new PrintWriter(out, false);
            outw.print("GET " + "/" + " HTTP/1.1\r\n");
            outw.print("Accept: text/plain, text/html, text/*\r\n");
            outw.print("\r\n");
            outw.flush();

            InputStream in = s.getInputStream();
            InputStreamReader inr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(inr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(UnknownHostException e){}
        catch(IOException e){}
            if(s != null){
                try{
                    s.close();
                }catch(IOException ioex){}
            }
    }
}
