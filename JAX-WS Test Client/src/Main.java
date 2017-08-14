import employeemanagement.services.Employee;
import employeemanagement.services.EmployeeServiceImpl;
import employeemanagement.services.EmployeeServiceImplService;

public class Main {
	
	
	static {
	    //for localhost testing only
	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){

	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("localhost")) {
	                return true;
	            }
	            return false;
	        }
	    });
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//call the webservice
		//URL: http://localhost:1235/any/name/you/like/employeeservice?wsdl
		
		EmployeeServiceImpl webservice=new EmployeeServiceImplService().getEmployeeServiceImplPort();
		
		//getEmployeeServiceImplPort() webservice it self
		
		Employee emp=webservice.getEmployeeById();
		
		System.out.println(emp.getName());

	}

}
