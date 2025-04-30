package hw250430.pro5;

public class TV extends Controller {
	
	// 생성자
	public TV(boolean power) {
		super(power);
	}
	
	// show() 메서드 오버라이드
	@Override
	void show() {
		if (power) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	
	// getName() 메서드 오버라이드
	@Override
	String getName() {
		return "TV";
	}
}
