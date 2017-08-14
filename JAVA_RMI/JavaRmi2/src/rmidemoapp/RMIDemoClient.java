package rmidemoapp;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIDemoClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		
		
			String url= new String("rmi://localhost:5099/RMIDemo");
			RMIDemo	rMIDemo = (RMIDemo)Naming.lookup(url);//look up a remote object on any host, and on the local host: bind a simple (string) name to a remote object, 
			
			String serverReply = rMIDemo.doCommunicate("Jaya");
			System.out.println("Server reply"+ serverReply);
			
		
	}

}
