package inheritance.animal;

public class Eagle extends Animal {
	
	private String wings;
	
	public void fly() {
		System.out.println("날아다닌다.");
	}
	
	@Override
	public void eat() {
		System.out.println("고기를 먹는다");
	}

	@Override
	public void move() {
		System.out.println("존나 빠르게 난다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("날면서 잔다.");
		
	}
		
}
