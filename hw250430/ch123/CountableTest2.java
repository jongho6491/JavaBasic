package hw250430.ch123;

public class CountableTest2 {

	public static void main(String[] args) {
		Countable[] m = { new Bird1("뻐꾸기"),
				new Bird1("독수리"),
				new Tree1("사과나무"),
				new Tree1("밤나무")
		};
		for (Countable e : m)
			e.count();
		
		for (Countable e : m) {
			if(e instanceof Bird1) {
				((Bird1)e).fly();
			}else
				((Tree1)e).ripen();
		}
		
	}
}
