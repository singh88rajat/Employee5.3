import java.io.*;
public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmp pemp=new PermanentEmp(1,"Mukesh",30000);
		pemp.calculate_salary();
		pemp.print_leave_details(1,2,1);
		pemp.avail_leave(1, 'S');
		pemp.calculate_balance_leaves();
		
		System.out.println();
		
		TemporaryEmp temp=new TemporaryEmp(2,"Sandeep",20000);
		temp.avail_leave(2, 'A');
		temp.calculate_balance_leaves();
		temp.calculate_salary();
		//pemp.avail_leave();
		
	}

}
//Note: Please clarify about abstract boolean avail_leave(int no_of_leaves, char type_of_leave);
//function. I am not sure how to manage it.