package hw250430.pro2;

public class InterfaceTest {

	public static void main(String[] args) {
		
		// Delicious 인터페이스를 구현한 Flavor 객체 생성
		Delicious d = new Flavor();
		
		// 메서드 호출
		d.eat();
		d.sweet();
	}
}
