package com.sritech.callbyvalue.com;

public class StudentMain {
	public static void main(String[] args) {
		Student student=new Student();
		System.out.println("Data receiving....");
		recvData(student);
		int studentNum=student.getStudentNum();
		String studentName=student.getStudentName();
		double studentFee=student.getStudentFee();
		String studentCourse=student.getStudentCourse();
		String studentGender=student.getStudentGender();
		int studentAge=student.getStudentAge();
		System.out.println(studentNum+"\t"+studentName+"\t"+studentFee+"\t"+studentCourse+"\t"+studentGender+"\t"+studentAge);
		System.out.println("Data received");
	}
	public static void recvData(Student std)
	{
		std.setStudentNum(33);
		std.setStudentName("PUSHPA");
		std.setStudentFee(70000.00);
		std.setStudentCourse("M.Sc");
		std.setStudentGender("female");
		std.setStudentAge(23);
	}

}
