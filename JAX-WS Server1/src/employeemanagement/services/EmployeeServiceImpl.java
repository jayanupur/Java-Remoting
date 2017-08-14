package employeemanagement.services;

import javax.jws.WebService;

import employeemanagement.domain.Employee;

@WebService
public class EmployeeServiceImpl  implements  EmployeeService{

	@Override
	public Employee getEmployeeById() {
		// TODO Auto-generated method stub
		return new Employee("jaya", 34);
	}

}
