package employeemanagement.services;

import javax.xml.ws.Endpoint;
//this act as local server but it was not running on localhost so I ran the project on glassfish else we dont need to.
public class Exporter {
	
	
	public static void main(String args[]) {
		
		Endpoint.publish("http://localhost:1235/any/name/you/like/employeeservice", new EmployeeServiceImpl());
		
	}

}
