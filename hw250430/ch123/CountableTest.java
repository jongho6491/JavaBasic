package hw250430.ch123;

public class CountableTest {

	public static void main(String[] args) {
		// 생성자 생성
		Countable[] m = {
				new Bird1("뻐꾸기"),
				new Bird1("독수리"),
				new Tree1("사과나무"),
				new Tree1("밤나무")
		};
		for (Countable e : m) {
			e.count();
		}
	}
}
