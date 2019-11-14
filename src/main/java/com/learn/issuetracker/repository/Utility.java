package com.learn.issuetracker.repository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.learn.issuetracker.model.Employee;
import com.learn.issuetracker.model.Issue;

/*
 * This class has methods for parsing the String read from the files in to corresponding Model Objects
*/
public class Utility {
	
	private Utility() {
		//Private Constructor to prevent object creation
	}

	/*
	 * parseEmployee takes a string with employee details as input parameter and parses it in to an Employee Object 
	*/
	public static Employee parseEmployee(String employeeDetail) {
		if(employeeDetail!=null && !(employeeDetail.isEmpty())) {
			
			String[] empdetails = employeeDetail.split(",");
			
			Employee e = new Employee(Integer.parseInt(empdetails[0]),empdetails[1],empdetails[2]);
			return e;
		}
		
				return null;
	}

	/*
	 * parseIssue takes a string with issue details and parses it in to an Issue Object. The employee id in the 
	 * Issue details is used to search for an an Employee, using EmployeeRepository class. If the employee is found
	 * then it is set in the Issue object. If Employee is not found, employee is set as null in Issue Object  
	*/

	public static Issue parseIssue(String issueDetail) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Issue i = null;
		String[] details = issueDetail.split(",");
		Optional<Employee> optionDetail = EmployeeRepository.getEmployee(Integer.parseInt(details[6]));
		if(optionDetail.isPresent()) {
			Employee detail = optionDetail.get();
			if(details!=null && details.length>0) {
				 i = new Issue(details[0],details[1],LocalDate.parse(details[2],format),LocalDate.parse(details[3],format),details[4],details[5],detail);
			return i;
			}
		}
		else {
			 i = new Issue(details[0],details[1],LocalDate.parse(details[2],format),LocalDate.parse(details[3],format),details[4],details[5],null);
		     return i;
		}
		
		return i;
	}
}
