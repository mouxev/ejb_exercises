package bean;

import java.rmi.RemoteException;
import javax.ejb.CreateException;

public interface EjbTestHomeRemote extends javax.ejb.EJBHome {
    public EjbTestRemote create( )
        throws RemoteException, CreateException;
}