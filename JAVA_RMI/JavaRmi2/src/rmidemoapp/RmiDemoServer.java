package rmidemoapp;

import java.net.MalformedURLException;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiDemoServer {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		// TODO Auto-generated method stub
	
		RmiDemoImpl rMIDemoImpl =new RmiDemoImpl();
		Registry registry=LocateRegistry.createRegistry(5099);//used to get a registry operating on the local host or local host and port.
		registry.rebind("RMIDemo", rMIDemoImpl);// bind remote objects to names. 
		System.out.println("RMI demo object bound to  the name 'RMIDemo' and is ready for use...........");

	}

}
