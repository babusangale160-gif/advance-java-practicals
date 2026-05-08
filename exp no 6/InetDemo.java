import java.io.*;
import java.net.*;

public class InetDemo
{
    public static void main(String[] args)
    {
        try
        {
            // Get IP of localhost (your own computer)
            InetAddress ip = InetAddress.getByName("localhost");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

            // Get IP of your actual machine
            InetAddress ip2 = InetAddress.getLocalHost();
            System.out.println("\nLocal Host Name: " + ip2.getHostName());
            System.out.println("Local IP Address: " + ip2.getHostAddress());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}