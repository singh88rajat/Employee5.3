import java.io.*;
public abstract class Employee {
	int empId;
	String  empName;
	int total_leaves=10;
	double total_salary;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	
	}
	public Employee(int paid_leave, int sick_leave, int casual_leave) {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getTotal_leaves() {
		return total_leaves;
	}
	public void setTotal_leaves(int total_leaves) {
		this.total_leaves = total_leaves;
	}
	public double getTotal_salary() {
		return total_salary;
	}
	public void setTotal_salary(double total_salary) {
		this.total_salary = total_salary;
	}
	abstract void calculate_balance_leaves(); 
	abstract boolean  avail_leave(int no_of_leaves, char type_of_leave);
	abstract void calculate_salary();
	
	
}
