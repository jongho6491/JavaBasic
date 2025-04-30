package hw250430.pro5;

public class ControllerTest {

	public static void main(String[] args) {
		
		// controller 배열 생성
		Controller[] c = { new TV(false), new Radio(true) };
		
		// 각 controller 객체의 show() 메서드 호출
		for (Controller controller : c)
			controller.show();
	}
}
