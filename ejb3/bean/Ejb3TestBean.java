package bean;

import javax.ejb.Stateless;


@Stateless(name="TestEJB1", mappedName="TestEJB1")
public class Ejb3TestBean implements Ejb3TestRemote  {

    public String showHelloWorld() throws Exception {

    	System.out.println("showHelloWorld()");
    	return "showHelloWorld()";
    }

}