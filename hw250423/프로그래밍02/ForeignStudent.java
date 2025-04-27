package prgram6CaHap02;

public class ForeignStudent extends Student {
	
	String kook;
	
	public ForeignStudent(String name, int age, int number, String kook) {
		
		super(name, age, number);
		
		this.kook = kook;
	}
	String show() {
		return "외국학생[이름 : " + name +", 나이 :" + age + "," +number + ", "+ "국적 : " + kook +"]";
	}
	

}
