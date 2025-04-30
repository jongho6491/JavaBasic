package inheritance.animal;

public class Tiger extends Animal{

	private String legs;
	
	public void run() {
		System.out.println("달린다.");
	}
	
	@Override
	public void eat() {
		System.out.println("고기를 먹는다.");
	}
	@Override
	public void move() {
		run();
	}

	@Override
	public void sleep() {
		System.out.println("퍼질러 잔다.");
		
	}
}
