package bean;


import java.rmi.RemoteException;


public class EjbTestBean implements javax.ejb.SessionBean {

    public void ejbCreate( ) {
    // Do nothing.
    }
    public String showHelloWorld() throws RemoteException {

    	System.out.println("showHelloWorld()");
    	return "showHelloWorld()";
    }

    public void ejbRemove( ){}
    public void ejbActivate( ){}
    public void ejbPassivate( ){}
    public void setSessionContext(javax.ejb.SessionContext cntx){}
    

}