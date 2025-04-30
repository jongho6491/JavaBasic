package inheritance.animal;

public class Goldfish extends Animal{

	private String fins;
	
	public void swim() {
		System.out.println("헤엄친다.");
	}
	
	@Override
	public void eat() {
		System.out.println("플랑크톤을 먹는다.");
	}
	@Override
	public void move() {
		swim();
	}

	@Override
	public void sleep() {
		System.out.println("거품을 뿜으면서 잔다.");
		
	}
	
}
