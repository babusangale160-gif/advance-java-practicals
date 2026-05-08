import java.rmi.*;
import java.lang.*;
import java.rmi.server.*;
public class two extends UnicastRemoteObject implements one
{
    public two() throws RemoteException { }
    public int palin(String a) throws RemoteException
    {
        StringBuffer str = new StringBuffer(a);
        String str1 = str.toString();
        StringBuffer str2 = str.reverse();
        int b = str1.compareTo(str2.toString());
        if (b == 0)
            return 1;
        else
            return 0;
    }
}