<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP sample</title>
</head>
<body>

 <%@ page import = "java.sql.*" %>
 <%@ page import = "java.util.Properties" %>


<%@ page import = "javax.naming.Context" %>
<%@ page import = "javax.naming.InitialContext" %>
<%@ page import = "javax.rmi.PortableRemoteObject" %>
<%@ page import = "bean.*" %>
 
 
<% 

	String factory = "weblogic.jndi.WLInitialContextFactory";
	Properties properties = new Properties();
	properties.put(Context.INITIAL_CONTEXT_FACTORY, factory);
	properties.put(Context.PROVIDER_URL,"t3://localhost:7001");  
	properties.put(Context.SECURITY_PRINCIPAL,"weblogic");
	properties.put(Context.SECURITY_CREDENTIALS,"weblogic1");
	System.out.println("Start");
	

   
  InitialContext ctx = new InitialContext(properties);
  Object ref = ctx.lookup("TestEJB");
  EjbTestHomeRemote home = (EjbTestHomeRemote)
          PortableRemoteObject.narrow(ref,EjbTestHomeRemote.class);


  EjbTestRemote ejbTst = home.create();
  String a = ejbTst.showHelloWorld();
  
  out.println(a); 

%>

</body>
</html>