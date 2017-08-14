package rmidemoapp;

import java.rmi.Remote;
import java.rmi.RemoteException;


//1)Create the remote interface
public interface RMIDemo  extends Remote{
	
	public String doCommunicate(String name) throws RemoteException;

}
