package prgram6CaHap05;

public class Telephone extends Phone{
	private String when;
	 
	void autoAnswering() {
		System.out.println(owner+" 가 부재 중이니"+ when+ "에 전화 요망");
	}
	
	public Telephone(String owner, String when) {
		super(owner);
		this.when= when;
	}
	public Telephone(String owner) {
		super(owner);
	}

}
