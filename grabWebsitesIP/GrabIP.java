//Finds a websites ip simply by passing the url as an argument in the command prompt
//ex: java GrabIP wwww.example.com

import java.net.*;

public class GrabIP{
    public static void main(String args[]){
        String ip = args[0];

        try{
            InetAddress address = InetAddress.getByName(ip);
            System.out.println(address);
        } catch(UnknownHostException e){
            System.out.println("unexpected error");
        }
    }
}
