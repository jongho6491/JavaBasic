package hw250430.pro7;

interface Flyable{
	void speed();
	void height();
}

class Bird implements Flyable{
	
	@Override
	public void speed() {
		System.out.println("속도");
	}
	@Override
	public void height() {
		System.out.println("높이");
	}
	
	
}

public class FlyableTest {

	public static void main(String[] args) {
		
		Flyable f = new Bird();
		f.speed();
		f.height();
	
	}
}