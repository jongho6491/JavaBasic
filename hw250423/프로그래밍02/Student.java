package prgram6CaHap02;

public class Student extends Person {
	int number;
	
	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
		
	}
	int getStudentNumber() {
		return number;
	}
	
	String show() {
		return ("학생[이름 : " +name+ ", 나이 :" +age+","+ "학번 :" +number+"]");
		
	}

}
