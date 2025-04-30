package hw250430.ch123;

public class Tree1 implements Countable {
	
	String name;
	

	public Tree1(String name) {
		this.name = name;
	}
	public void ripen() {
		System.out.println(name + "에 열매가 잘 익었다.");
	}
	
	@Override
	public void count() {
		System.out.println(name + "가 5그루 있다.");
	}
	
	
}