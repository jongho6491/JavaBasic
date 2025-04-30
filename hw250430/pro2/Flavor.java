package hw250430.pro2;


//Delicious 인터페이스를 구현
public class Flavor implements Delicious{

	@Override
	public void eat() {
		System.out.println("먹는다.");
	}

	@Override
	public void sweet() {
		System.out.println("달다.");
	}
	
}
