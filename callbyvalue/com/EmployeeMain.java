package com.sritech.callbyvalue.com;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee employee=new Employee();
		
		employee.setEmpNum(33);
		employee.setEmpName("PUSHPA");
		employee.setEmpJob("Analyst");
		employee.setEmpSalary(70000.00);
		employee.setEmpGender("FEMALE");
		employee.setEmpAge(23);
		System.out.println("Data Delivering....");
		sendData(employee);
		System.out.println("Data delivered");
		}
	public static void sendData(Employee emp)
	{
		int empNum=emp.getEmpNum();
		String empName=emp.getEmpName();
		String empJob=emp.getEmpJob();
		double empSalary=emp.getEmpSalary();
		String empGender=emp.getEmpGender();
		int empAge=emp.getEmpAge();
		System.out.println(empNum+"\t"+empName+"\t"+empJob+"\t"+empSalary+"\t"+empGender+"\t"+empAge);
		
	}

}
