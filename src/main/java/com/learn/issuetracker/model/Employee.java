package com.learn.issuetracker.model;

/*
 * Model class for storing Employee details. Complete the code as per the comments given below
*/
public class Employee {

	private int emplId;
	private String name;
	private String location;

	public Employee() {
		// Default Constructor
	}

	/*
	 * Complete the parameterized Constructor
	 */
	
	/*public Employee(int emplId, String name, String location) {

	}*/

	public Employee(int emplId, String name, String location) {
		super();
		this.emplId = emplId;
		this.name = name;
		this.location = location;
	}

	/*
	 * Override toString() here . The toString() should return the employee details
	 * in the below format
	 * 
	 * Employee : {Employee Id : xxx; Name : xxxx; Location : xxxxx}
	 */

	/*
	 * Complete the Getter and Setters
	 */
	public int getEmplId() {
		return emplId;
	}

	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", name=" + name + ", location=" + location + "]";
	}
	
	/*public int getEmplId() {
		return 0;
	}

	public void setEmplId(int emplId) {

	}

	public String getName() {
		return null;
	}

	public void setName(String name) {

	}

	public String getLocation() {
		return null;
	}

	public void setLocation(String location) {

	}*/

	

	

	
	
}