package prgram6CaHap05;

public class Smartphone extends Telephone {
	private String game;
	
	void playGame() {
		System.out.println(owner+ "가"+ game + "게임을 하는 중이다.");
	}
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
		
	}
	public Smartphone(String owner, String when, String game) {
		super(owner, when);
		this.game = game;
	}
	
}