import java.io.*;
public class TemporaryEmp extends Employee{
	double basic, hra, pfa;
	public TemporaryEmp(int empId, String empName, double basic) {
		super(empId, empName);
		this.basic = basic;
	}

	@Override
	void calculate_balance_leaves() {
		// TODO Auto-generated method stub
		System.out.println("Total Balance Leaves="+total_leaves);
	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	void calculate_salary() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		hra = basic*12/100;
		pfa = basic*50/100;
		total_salary=basic+hra-pfa;
		
		System.out.println("Total Salary of "+empName+ " is "+total_salary);
	}

}
