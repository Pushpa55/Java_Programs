package com.sritech.collections;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmployeeC>{

	@Override
	public int compare(EmployeeC e1, EmployeeC e2) 
	{
	    if(e1.getEmpSalary()==e2.getEmpSalary())
	    {
		return 0;
	    }
	    else if(e1.getEmpSalary()<e2.getEmpSalary())
	    {
	    	return 1;
	    }
	    else
	    {
	    	return -1;
	    }
	
	

    }
	
}
