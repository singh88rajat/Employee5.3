import java.io.*;

public class PermanentEmp extends Employee 

{
	int paid_leave, sick_leave, casual_leave;
	double basic, hra, pfa;
	int no_of_leaves,current_leave_balance;
	char type_of_leave;
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public PermanentEmp(int empId, String empName, double basic) {
		super(empId, empName);
		this.basic = basic;
	}

	public PermanentEmp(int paid_leave,int sick_leave, int casual_leave)
			 
	{
		super(paid_leave, sick_leave, casual_leave);
		this.paid_leave = paid_leave;
		this.sick_leave = sick_leave;
		this.casual_leave = casual_leave;
	}

	void print_leave_details(int paid_leave, int sick_leave, int casual_leave)
	{   
	current_leave_balance=total_leaves+paid_leave+sick_leave+casual_leave;
		System.out.println("Special Leaves for Permanent Employee: "+current_leave_balance);
	}
	@Override
	void calculate_balance_leaves() {
		// TODO Auto-generated method stub
		int balance_leaves=total_leaves-no_of_leaves;
		System.out.println("Total Balance Leaves="+balance_leaves);
	}
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		
		return false;
		
		// TODO Auto-generated method stub
		
	}
	@Override
	void calculate_salary() {
		// TODO Auto-generated method stub
		hra = basic*12/100;
		pfa = basic*50/100;
		total_salary=basic+hra-pfa;
		
		System.out.println("Total Salary of "+empName+ " is "+total_salary);
		
	}

	
}
