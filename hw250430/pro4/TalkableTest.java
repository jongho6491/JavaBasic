package hw250430.pro4;

public class TalkableTest  {
	
	// talkble 타입의 객체를 받아서 talk() 메서드 호출
	static void speak(Talkble talkble) {
		talkble.talk();
	}
	
	public static void main(String[] args) {
		
		// Korean과 American 객체를 Talkable 타입으로 전달
		speak(new Korean());
		speak(new American());
		
	}
	
}
