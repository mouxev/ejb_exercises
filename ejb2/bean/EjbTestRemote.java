package bean;

import java.rmi.RemoteException;
import javax.ejb.FinderException;

public interface EjbTestRemote extends javax.ejb.EJBObject {

    public String showHelloWorld() throws RemoteException;
    
}
        