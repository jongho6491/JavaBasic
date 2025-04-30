package hw250430.ch123;

public class Bird1 implements Countable {

	String name;
	
	public Bird1(String name) {
		this.name = name;
	}
	
	public void fly() {
		System.out.println(name + "가 날았다.");
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
		
	}

}
