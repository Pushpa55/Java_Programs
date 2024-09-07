package com.sritech.callbyvalue.com;

public class StudentMain2 {
	public static void main(String[] args) {
		Student student=new Student();
		recvData1(student);
		System.out.println("Data recevining");
		int studentNum=student.getStudentNum();
		String studentName=student.getStudentName();
		double studentFee=student.getStudentFee();
		String studentCourse=student.getStudentCourse();
		String studentGender=student.getStudentGender();
		int studentAge=student.getStudentAge();
		System.out.println(studentNum+"\t"+studentName+"\t"+studentFee+"\t"+studentCourse+"\t"+studentGender+"\t"+studentAge);
		System.out.println("Data received");
		}
	public static void recvData1(Student stud)
	{
		recvData2(stud);
		stud.setStudentNum(33);
		stud.setStudentName("PUSHPA");
		stud.setStudentFee(30000.00);
	}
	public static void recvData2(Student stud)
	{
		stud.setStudentCourse("M.Sc");
		stud.setStudentGender("FEMALE");
		stud.setStudentAge(23);
	}

}
