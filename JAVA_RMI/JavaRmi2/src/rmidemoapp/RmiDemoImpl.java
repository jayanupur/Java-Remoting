package rmidemoapp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiDemoImpl  extends UnicastRemoteObject implements RMIDemo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected RmiDemoImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doCommunicate(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return "Servere says HI "+name+" \n";
	}

}
