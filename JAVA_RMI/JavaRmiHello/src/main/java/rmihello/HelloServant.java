package rmihello;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


//2) Provide the implementation of the remote interface
public class HelloServant extends UnicastRemoteObject implements HelloService{

	protected HelloServant() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

	public String echo(String input) throws RemoteException {
		// TODO Auto-generated method stub
		return "from server "+ input;
	}
	
	

}
