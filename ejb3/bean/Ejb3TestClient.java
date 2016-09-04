package bean;
import java.util.Properties;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;


public class Ejb3TestClient {
   public static void main(String[] args) throws Exception
   {
	   
   	String factory = "weblogic.jndi.WLInitialContextFactory";
   	Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, factory);
		properties.put(Context.PROVIDER_URL,"t3://localhost:7001");  
		properties.put(Context.SECURITY_PRINCIPAL,"weblogic");
		properties.put(Context.SECURITY_CREDENTIALS,"weblogic1");
       
      InitialContext ctx = new InitialContext(properties);
      Object ref = ctx.lookup("TestEJB1#bean.Ejb3TestRemote");
      Ejb3TestRemote ejbTst = (Ejb3TestRemote)PortableRemoteObject.narrow(ref, Ejb3TestRemote.class);
      
      System.out.println(ejbTst.showHelloWorld());
   }
}