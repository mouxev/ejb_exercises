package bean;

import javax.ejb.Remote;


@Remote
public interface Ejb3TestRemote  {

    public String showHelloWorld() throws Exception;
    
}
        