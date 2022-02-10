import java.net.InetAddress;
import java.net.UnknownHostException;

public class Proj01Runner {
    public void run(){
        System.out.println("I certify that this program is my own work \nand not the work of others. I agree not \nto share my solution with others.\nNathan Lu");
        try {
            // Getting the website IP
            System.out.println("\nGet and display IP address of website by name");
            System.out.println(InetAddress.getByName("www.austincc.edu"));

            // Getting the LocalHost IP
            System.out.println("Get and display current IP address of LocalHost");
            InetAddress i1 = InetAddress.getLocalHost();
            System.out.println(i1);

            // Getting the Localhost name
            System.out.println("Get and display current name of LocalHost");
            System.out.println(i1.getHostName());

            // Getting the LocalHost IP
            System.out.println("Get and display current IP address of LocalHost");
            System.out.println(i1.getHostAddress());

        } catch (UnknownHostException e){
            e.printStackTrace();
        }

    }
}
