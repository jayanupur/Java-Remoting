package rmihello;

import java.rmi.Remote;
import java.rmi.RemoteException;


//First step- create the remote interface  extend java.rmi.remote

public interface HelloService extends Remote{
	
	public String echo(String input) throws RemoteException;

}
