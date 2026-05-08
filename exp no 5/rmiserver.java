import java.rmi.*;
import java.rmi.registry.*;

public class rmiserver {
    public static void main(String args[]) throws Exception {
        try {
            LocateRegistry.createRegistry(1099);
            two twox = new two();
            Naming.bind("rmi://localhost:1099/palin", twox);
            System.out.println("Object registered");
        }
        catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}