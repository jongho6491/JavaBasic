package hw250430.pro5;


// 추상 클래스
abstract class Controller {
	boolean power;
	
	
	// 생성자
	public Controller(boolean power) {
		this.power = power;
	}
	
	// show() 메서드는 각 클래스에서 오버라이드해야 함.
	abstract void show();
	
	// getName() 메서드는 TV와 Radio 각각의 이름을 반환
	abstract String getName();
}
