package hw250430.pro6;

public class Student implements Human {
	int age;
	
	
	public Student() {
		//기본생성자
	}
	public Student(int age) {
		this.age = age;
	}
	
	
	@Override
	public void eat() {
		System.err.println("도시락을 먹습니다.");
	}
	
	@Override
	public void print() {
		System.out.println(age+"세의 학생입니다.");
	//	System.out.println("20세의 학생입니다.");
	}
}
